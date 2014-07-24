package com.dream.weixin.service.impl;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.weixin.common.Business;
import com.dream.weixin.db.mysql.entity.B2cOrderExample;
import com.dream.weixin.db.mysql.entity.OpenidPsam;
import com.dream.weixin.db.mysql.entity.OpenidPsamExample;
import com.dream.weixin.db.mysql.entity.PsamProperty;
import com.dream.weixin.db.mysql.entity.PsamPropertyExample;
import com.dream.weixin.db.mysql.entity.PsamPropertyIns;
import com.dream.weixin.db.mysql.entity.PsamPropertyInsExample;
import com.dream.weixin.db.mysql.entity.TermDevice;
import com.dream.weixin.db.mysql.entity.TermDeviceExample;
import com.dream.weixin.db.mysql.manager.B2cOrderMapper;
import com.dream.weixin.db.mysql.manager.OpenidPsamMapper;
import com.dream.weixin.db.mysql.manager.PsamPropertyInsMapper;
import com.dream.weixin.db.mysql.manager.PsamPropertyMapper;
import com.dream.weixin.db.mysql.manager.TermDeviceMapper;
import com.dream.weixin.model.exception.ServiceException;
import com.dream.weixin.service.ClientService;
import com.dream.weixin.util.DateUtils;
import com.dream.weixin.util.StringUtil;

@Service
public class ClientServiceImpl implements ClientService {

	private static Logger logger = Logger.getLogger(ClientServiceImpl.class);

	@Autowired
	private TermDeviceMapper termDeviceMapper;

	@Autowired
	private OpenidPsamMapper openidPsamMapper;

	@Autowired
	private B2cOrderMapper b2cOrderMapper;

	@Autowired
	private PsamPropertyMapper psamPropertyMapper;

	@Autowired
	private PsamPropertyInsMapper psamPropertyInsMapper;

	@Override
	public Map<String, String> submitPsam(String openid, String psam,
			String qqCode) throws ServiceException {
		// 验证psam 卡号是否正确
		logger.info("start valid psam");
		psam = Business.HEADPSAM + psam;
		logger.info("psam:" + psam);
		Map<String, String> map = new HashMap<String, String>();
		TermDeviceExample tdExample = new TermDeviceExample();
		tdExample.createCriteria().andPsamEqualTo(psam);
		List<TermDevice> termDevices = termDeviceMapper
				.selectByExample(tdExample);

		if (termDevices.size() == 0) {
			throw new ServiceException(ServiceException.PSAMISNOTFOUND,
					ServiceException.PSAMISNOTFOUND);
		}

		B2cOrderExample b2cOrderExample = new B2cOrderExample();
		Date now = new Date();

		Long beforeThirthDay = DateUtils.addDay(now, -30).getTime();// 上线开放
		b2cOrderExample.createCriteria().andPsamEqualTo(psam)
		// .andStatusEqualTo("finish");
		 .andCreatetimeGreaterThanOrEqualTo(beforeThirthDay);

		int count = b2cOrderMapper.countByExample(b2cOrderExample);
		String gemGrade = "0";
		if (count >= 0 && count < 11) {
			gemGrade = "1";
		} else if (count >= 11 && count < 30) {
			gemGrade = "2";
		} else if (count >= 31) {
			gemGrade = "3";
		}
		// 校验宝码是否已经获取，且 在有效期内，否则 返回
		OpenidPsamExample openidPsamExample = new OpenidPsamExample();

		openidPsamExample.createCriteria().andOpPsamEqualTo(psam).andOpInvalidTimeGreaterThan(now);
		List<OpenidPsam> openidPsams = openidPsamMapper
				.selectByExample(openidPsamExample);
		if (openidPsams.size() > 0) {
			String opString = openidPsams.get(0).getOpGemCode();
			throw new ServiceException(opString, ServiceException.GEMEFFECT);
		}
		// 建立关系 生成宝码号
		String randomStr = StringUtil.RandomString(6);
		OpenidPsam openidPsam = new OpenidPsam();

		openidPsam.setOpCreateTime(now);
		openidPsam.setOpGemCode(randomStr);
		openidPsam.setOpGemCodeStatus("1");
		Date invalidTime = DateUtils.addDay(now, 30);
		openidPsam.setOpInvalidTime(invalidTime);
		openidPsam.setQqCode(qqCode);

		openidPsam.setOpOpenid(openid);
		openidPsam.setOpPsam(psam);
		openidPsam.setOpStatus("1");
		openidPsam.setOpType(Business.BUSINESS);
		openidPsam.setOpUpdateTime(now);
		openidPsam.setOpGemGrade(gemGrade);

		openidPsamMapper.insert(openidPsam);
		map.put("gemGrade", gemGrade);
		map.put("gem_code", randomStr);
		map.put("invalid_time", invalidTime.toString());

		return map;
	}

	@Override
	public Map<String, Object> submitGemCode(String openid, String psam,
			String gemCode) throws ServiceException {

		Map<String, Object> map = new HashMap<String, Object>();

		OpenidPsamExample opExample = new OpenidPsamExample();
		OpenidPsamExample.Criteria criteria = opExample.createCriteria();
		criteria.andOpPsamEqualTo(psam);
		criteria.andOpGemCodeEqualTo(gemCode);
		criteria.andOpOpenidEqualTo(openid);
		criteria.andOpStatusEqualTo(Business.OPEN);
		criteria.andOpGemCodeStatusEqualTo(Business.OPEN);

		List<OpenidPsam> openidPsams = openidPsamMapper
				.selectByExample(opExample);
		if (openidPsams.size() == 0) {
			throw new ServiceException(ServiceException.INFOISNOTFOUND,
					ServiceException.INFOISNOTFOUND);
		}
		
		
		OpenidPsam openidPsam = openidPsams.get(0);
		if(openidPsam.getOpInvalidTime().before(new Date())){
			throw new ServiceException(ServiceException.VERIFYCODE_INVALID,ServiceException.VERIFYCODE_INVALID);
		}
		PsamPropertyExample ppExample = new PsamPropertyExample();
		ppExample.createCriteria().andPsamPropStatusEqualTo("open");
		ppExample.setOrderByClause(" psam_prop_parser asc");
		List<PsamProperty> psamProperties = psamPropertyMapper
				.selectByExample(ppExample);


		String opGemGrade = openidPsam.getOpGemGrade();
		PsamPropertyExample pe = new PsamPropertyExample();
		pe.createCriteria().andPsamPropParserGreaterThanOrEqualTo(opGemGrade);
		int count = psamPropertyMapper.countByExample(pe);
		

		String gradeStr = "初级店主（非会员）";
		if ("1".equals(opGemGrade)) {
			gradeStr = "初级店主（非会员）";
		} else if ("2".equals(opGemGrade)) {
			gradeStr = "普通会员";
		} else if ("3".equals(opGemGrade)) {
			gradeStr = "高级会员";
		}
		
		map.put("gem_grade_str", gradeStr);
		map.put("gem_grade", opGemGrade);
		map.put("prop_list", psamProperties);
		map.put("prop_list_size", count);
		return map;
	}

	@Override
	public Map<String, Object> submitService(String openid, Integer[] userProps)
			throws ServiceException {
		// 1.获取psam 卡号，
		Map<String, Object> map = new HashMap<String, Object>();
		OpenidPsamExample opExample = new OpenidPsamExample();
		opExample.createCriteria().andOpOpenidEqualTo(openid)
				.andOpInvalidTimeGreaterThan(new Date())
				.andOpStatusEqualTo(Business.OPEN)
				.andOpGemCodeStatusEqualTo(Business.OPEN);
		List<OpenidPsam> openidPsams = openidPsamMapper
				.selectByExample(opExample);

		if (openidPsams.size() == 0) {
			throw new ServiceException(ServiceException.INFOISNOTFOUND,
					ServiceException.INFOISNOTFOUND);
		}
		// 2.验证用户勾选服务是否合法
		OpenidPsam openidPsam = openidPsams.get(0);
		String gemGrade = openidPsam.getOpGemGrade();
		String psam = openidPsam.getOpPsam();

		PsamPropertyExample ppExample = new PsamPropertyExample();
		List<Integer> list = Arrays.asList(userProps);
		ppExample.createCriteria().andPsamPropIdIn(list);
		// 3.修改数据库
		List<PsamProperty> psamProperties = psamPropertyMapper
				.selectByExample(ppExample);
		//删除原有服务
		PsamPropertyInsExample ppie = new PsamPropertyInsExample();
		ppie.createCriteria().andPsamIdEqualTo(psam);
		psamPropertyInsMapper.deleteByExample(ppie);
		for (PsamProperty pp : psamProperties) {
			if (Integer.valueOf(pp.getPsamPropParser()) > Integer
					.valueOf(gemGrade)) {
				throw new ServiceException(ServiceException.INFOISNOTFOUND,
						ServiceException.INFOISNOTFOUND);
			}

			PsamPropertyIns ppi = new PsamPropertyIns();
			ppi.setPsamId(psam);
			ppi.setPsamPropId(pp.getPsamPropId());
			ppi.setPsamPropName(pp.getPsamPropName());
			ppi.setPsamPropStatus("open");
			ppi.setPsamPropValue("1");
			psamPropertyInsMapper.insert(ppi);
		}
		return map;
	}

	@Override
	public boolean validGemCode(String openid)
			throws ServiceException {
		Date now = new Date();
		OpenidPsamExample openidPsamExample = new OpenidPsamExample();

		openidPsamExample.createCriteria().andOpOpenidEqualTo(openid)
				.andOpInvalidTimeGreaterThan(now);
		List<OpenidPsam> openidPsams = openidPsamMapper
				.selectByExample(openidPsamExample);
		
		
		if (openidPsams.size() > 0) {
			OpenidPsam op = openidPsams.get(0);
			Date createTime = op.getOpCreateTime();
			Calendar cl = Calendar.getInstance();
			cl.setTime(createTime);
			int weekOfDay = cl.get(Calendar.DAY_OF_WEEK);
			if (weekOfDay == 4) {
				
				String opString = op.getOpGemCode();
				throw new ServiceException(opString, ServiceException.GEMEFFECT);
				
			}
			String gemGrade = op.getOpGemGrade();
			throw new ServiceException(gemGrade,ServiceException.GEMEFFECTNOTWEN);
		}
		return true;
	}

	@Override
	public Map<String, Object> submitGemCode(String openid, String gemCode)
			throws ServiceException {
		Map<String, Object> map = new HashMap<String, Object>();

		OpenidPsamExample opExample = new OpenidPsamExample();
		OpenidPsamExample.Criteria criteria = opExample.createCriteria();
		criteria.andOpGemCodeEqualTo(gemCode);
		criteria.andOpOpenidEqualTo(openid);
		criteria.andOpStatusEqualTo(Business.OPEN);
		criteria.andOpGemCodeStatusEqualTo(Business.OPEN);

		List<OpenidPsam> openidPsams = openidPsamMapper
				.selectByExample(opExample);
		if (openidPsams.size() == 0) {
			throw new ServiceException(ServiceException.INFOISNOTFOUND,
					ServiceException.INFOISNOTFOUND);
		}
		OpenidPsam openidPsam = openidPsams.get(0);

		if(openidPsam.getOpInvalidTime().before(new Date())){
			throw new ServiceException(ServiceException.VERIFYCODE_INVALID,ServiceException.VERIFYCODE_INVALID);
		}
		
		PsamPropertyExample ppExample = new PsamPropertyExample();
		ppExample.createCriteria().andPsamPropStatusEqualTo("open");
		ppExample.setOrderByClause(" psam_prop_parser asc");
		List<PsamProperty> psamProperties = psamPropertyMapper
				.selectByExample(ppExample);
		
		String opGemGrade = openidPsam.getOpGemGrade();
		PsamPropertyExample pe = new PsamPropertyExample();
		pe.createCriteria().andPsamPropParserGreaterThanOrEqualTo(opGemGrade);
		int count = psamPropertyMapper.countByExample(pe);
		

		String gradeStr = "初级店主（非会员）";
		if ("1".equals(opGemGrade)) {
			gradeStr = "初级店主（非会员）";
		} else if ("2".equals(opGemGrade)) {
			gradeStr = "普通会员";
		} else if ("3".equals(opGemGrade)) {
			gradeStr = "高级会员";
		}
		map.put("gem_grade_str", gradeStr);
		map.put("gem_grade", opGemGrade);
		map.put("prop_list", psamProperties);
		map.put("prop_list_size", count);
		return map;
	}

	@Override
	public Map<String, Object> contactGemCode(String openid) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		OpenidPsamExample openidPsamExample = new OpenidPsamExample();

		openidPsamExample.createCriteria().andOpOpenidEqualTo(openid);
		List<OpenidPsam> openidPsams = openidPsamMapper
				.selectByExample(openidPsamExample);
		if (openidPsams.size() > 0) {
			OpenidPsam op = openidPsams.get(0);
			Date now = new Date();
			Date invalidTime = DateUtils.addDay(now, 30);
			op.setOpInvalidTime(invalidTime);
			openidPsamMapper.updateByPrimaryKey(op);
			map.put("gem_code", op.getOpGemCode());
			
		}

		return map;
	}

}
