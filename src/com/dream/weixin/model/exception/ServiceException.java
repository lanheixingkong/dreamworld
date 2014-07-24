package com.dream.weixin.model.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 619702019416455177L;

	public static final String IS_NOTMOBILE = "is_no_mobile";

	public static final String VERIFYCODE_INVALID = "code_invalid";

	public static final String PSAMISNOTFOUND = "psam_is_not_found";
	/*
	 * 有效期内
	 */
	public static final String GEMEFFECT = "gem_effect";
	
	public static final String GEMEFFECTNOTWEN = "gem_effect_not_wen";

	public static final String LESSTENORDERS = "less_ten_orders";

	public static final String INFOISNOTFOUND = "info_is_not_found";
	

//	public static final String ORDERVALID = "orderValid";

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ServiceException(String message, String type) {
		super(message);
		this.type = type;
	}
	
	public ServiceException(String message){
		super(message);
	}
}
