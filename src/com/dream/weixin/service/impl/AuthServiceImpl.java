package com.dream.weixin.service.impl;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.weixin.db.mysql.entity.OpenidMobile;
import com.dream.weixin.db.mysql.entity.Sms;
import com.dream.weixin.db.mysql.entity.SmsExample;
import com.dream.weixin.db.mysql.manager.OpenidMobileMapper;
import com.dream.weixin.db.mysql.manager.SmsMapper;
import com.dream.weixin.model.exception.ServiceException;
import com.dream.weixin.service.AuthService;
import com.dream.weixin.util.HttpXmlClient;
import com.dream.weixin.util.MD5Utils;
import com.dream.weixin.util.StringUtil;

@Service
public class AuthServiceImpl implements AuthService{

	private static Logger logger = Logger.getLogger(AuthServiceImpl.class);
	
	@Autowired
	private SmsMapper smsMapper;
	
	@Autowired
	private OpenidMobileMapper openidMobileMapper;
	
	public String sendSms(String mobile,String verifyCode) {
		String url = "http://127.0.0.1/shortMessage/sr";
		String xml = "";
		String userName = "tengyun";
		String userPassword = "ty#201309qaz";
		String message = "拉卡拉验证码:"+verifyCode+".【拉卡拉】";

		String macKey = MD5Utils.getMD5(userName+userPassword);
		logger.info("macKey:   " + macKey);

		Map<String, String> params = new HashMap<String, String>();
		params.put("userName", userName);
		params.put("mobile", mobile);
		params.put("macKey", macKey);
		params.put("channel", "1");
		params.put("dst", "1065710901838388");
		params.put("message", message);
		xml = HttpXmlClient.post(url, params);

		return xml;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.ailk.contact.service.LoginService#insertVerifyCode(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void insertVerifyCode(String mobile,String smsType,String verifyCode) throws ServiceException, ParseException {
		
		boolean isMobileNo = StringUtil.isMobileNO(mobile);
		if(!isMobileNo){
			throw new ServiceException(ServiceException.IS_NOTMOBILE, ServiceException.IS_NOTMOBILE);
		}

//		短信下发次数限制
//		int countTodaySms = smsMapper.countTodaySms(phone, smsType);
//		
//		int countTwoMinuteSms = smsMapper.countTwoMinuteToNowSms(phone, smsType);
//		log.info("countTodaySms===="+countTodaySms+"====countTwoMinuteSms======"+countTwoMinuteSms);
//		if("reg".equals(smsType) && countTodaySms >= Sms.MaxSendTimes){
//		throw new ServiceException(ServiceException.MAXSENDTIMES, ServiceException.MAXSENDTIMES);
//		}
//		log.info("smsType==="+smsType);
//		if("bal".equals(smsType)){
//			if(countTodaySms >= 50 || countTwoMinuteSms > 0 ){
//				throw new ServiceException(ServiceException.MAXSENDTIMES, ServiceException.MAXSENDTIMES);
//			}
//		}
		
		SmsExample smsExample = new SmsExample();
		smsExample.createCriteria().andMobileEqualTo(mobile);
		
		Sms smsTemp = new Sms();
		smsTemp.setSmsStatus(Sms.CODECLOSE);
		smsMapper.updateByExampleSelective(smsTemp, smsExample);
		
		Sms sms = new Sms();
		sms.setMobile(mobile);
		sms.setSendStatus(Sms.SENDDEFAULT);
		sms.setSmsStatus(Sms.CODEOPEN);
		sms.setVerifyCode(verifyCode);
		sms.setOtherOne(smsType);

		smsMapper.insert(sms);
	}
	
	@Override
	public void updateSendStatusToSucc(String mobile,String verifyCode){
		
		SmsExample smsExample = new SmsExample();
		smsExample.createCriteria().andMobileEqualTo(mobile).andVerifyCodeEqualTo(verifyCode);
		
		Sms smsTemp = new Sms();
		smsTemp.setSmsStatus(Sms.CODECLOSE);
		smsMapper.updateByExampleSelective(smsTemp, smsExample);
	}


	@Override
	public boolean revelanceOpenId(String mobile, String openid, String code,String omType) throws ServiceException {
		boolean verifyStatus = this.verifyCode(mobile,code);
		if(!verifyStatus){
			throw new ServiceException(ServiceException.VERIFYCODE_INVALID, ServiceException.VERIFYCODE_INVALID);
		}
		OpenidMobile openidMobile = new OpenidMobile();
		openidMobile.setMobile(mobile);
		openidMobile.setOpenid(openid);
		openidMobile.setMoStatus(OpenidMobile.OMABLE);
		openidMobile.setMoType(omType);
		
		openidMobileMapper.insert(openidMobile);
		
		return true;
	}
	
	public boolean verifyCode(String mobile, String code) {
		Sms sms = new Sms();
		
		SmsExample smsExample = new SmsExample();
		smsExample.createCriteria().andSmsStatusEqualTo(Sms.CODEOPEN).andMobileEqualTo(mobile).andVerifyCodeEqualTo(code);
		List<Sms> smses = smsMapper.selectByExample(smsExample);
		
		if(smses.size() > 0){
			sms = smses.get(0);
			if(code.equals(sms.getVerifyCode())){
				sms.setSmsStatus(Sms.CODECLOSE);
				smsMapper.updateByPrimaryKey(sms);
			}
			return true;
		}
		
		return false;
	}
}
