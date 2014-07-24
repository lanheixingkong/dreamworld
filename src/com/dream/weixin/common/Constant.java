package com.dream.weixin.common;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * 
 * @author wenmx
 * 
 */
public class Constant implements Serializable{
	

	private static final long serialVersionUID = 8871133131289696478L;
	
	public static final SimpleDateFormat overSDF = new SimpleDateFormat("HH:mm:ss");
	public static final SimpleDateFormat updateSDF = new SimpleDateFormat("yyyy-MM-dd");
	public static final SimpleDateFormat orderSDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	

}
