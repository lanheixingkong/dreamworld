package com.dream.weixin.service;

import java.util.Map;

import com.dream.weixin.model.exception.ServiceException;

public interface ClientService {
	/**
	 * 获取宝码号
	 * @param openid
	 * @param psam
	 * @param qqCode 
	 * @return
	 * @throws ServiceException 
	 */
	public Map<String,String> submitPsam(String openid,String psam, String qqCode) throws ServiceException;

	/**
	 * 验证宝码
	 * @param openid
	 * @param psam
	 * @param genCode
	 * @return
	 * @throws ServiceException
	 */
	public Map<String, Object> submitGemCode(String openid, String psam,
			String genCode) throws ServiceException;

	/**
	 * 提交用户所选服务
	 * @param openid
	 * @param userProps
	 * @return
	 * @throws ServiceException 
	 */
	public Map<String, Object> submitService(String openid, Integer[] userProps) throws ServiceException;

	/**
	 * 验证OPENID 是否关联，且宝码已经申领
	 * @param openid
	 * @return
	 * @throws ServiceException 
	 */
	public boolean validGemCode(String openid) throws ServiceException;

	/**
	 * 页面直接到获取服务
	 * @param openid
	 * @param gemCode
	 * @return
	 * @throws ServiceException 
	 */
	public Map<String, Object> submitGemCode(String openid, String gemCode) throws ServiceException;

	/**
	 * 续约
	 * @param openid
	 * @param contactType
	 * @return
	 */
	public Map<String, Object> contactGemCode(String openid);
}
