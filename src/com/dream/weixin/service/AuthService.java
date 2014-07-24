package com.dream.weixin.service;

import java.text.ParseException;

import com.dream.weixin.model.exception.ServiceException;



public interface AuthService {

	public String sendSms(String mobile,String verifyCode);
	
	public void insertVerifyCode(String mobile,String smsType,String verifyCode) throws ServiceException, ParseException;
	
	public void updateSendStatusToSucc(String mobile,String verifyCode);

	public boolean revelanceOpenId(String mobile, String openid, String code, String omType) throws ServiceException;
}
