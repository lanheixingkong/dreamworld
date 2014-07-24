package com.dream.weixin.message.req.service;

public class BaseServiceMessage {
	// openid
	private String touser;
	
	//消息类型
	private String msgtype;

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	
	

}
