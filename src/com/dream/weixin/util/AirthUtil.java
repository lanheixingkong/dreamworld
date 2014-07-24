package com.dream.weixin.util;

import java.math.BigDecimal;

/**
 * 
 * @author : wen manxiang
 * @Email : wenmanxiang@lakala.com	
 * @description :
 * 
 * 【提供精确的加、减、乘、除运算】
 * 【提供精确的数据转换】
 */
public class AirthUtil {

    /**
     * 【加】
     * @param value1
     * @param value2
     * @return
     * @Author: Yujin_Chen  2013-10-9上午10:00:47
     */
	public static float add(float value1,  float value2){
		BigDecimal b1 = new BigDecimal(value1);
		BigDecimal b2 = new BigDecimal(value2);
		
		return b1.add(b2).floatValue();
	}
	
    /**
     * 【减】
     * @param value1
     * @param value2
     * @return
     * @Author: Yujin_Chen  2013-10-9上午10:00:55
     */
	public static float sub(String value1, String value2){
		BigDecimal b1 = new BigDecimal(value1);
		BigDecimal b2 = new BigDecimal(value2);
		
		return b1.subtract(b2).floatValue();
	}
	
    /**
     * 【乘】
     * @param value1
     * @param value2
     * @return
     * @Author: Yujin_Chen  2013-10-9上午10:01:10
     */
	public static Float mul(String value1, String value2){
		BigDecimal b1 = new BigDecimal(value1);
		BigDecimal b2 = new BigDecimal(value2);
		
		return b1.multiply(b2).floatValue();
	}
	
    /**
     * 【除】
     * @param value1
     * @param value2
     * @return
     * @Author: Yujin_Chen  2013-10-9上午10:01:04
     */
	public static Float div(String value1, String value2){
		BigDecimal b1 = new BigDecimal(value1);
		BigDecimal b2 = new BigDecimal(value2);
		
		return b1.divide(b2,6).floatValue();
	}
	
	/**
	 * 【精确转换】
	 * @param value
	 * @return
	 * @Author: Yujin_Chen  2013-10-9上午10:03:12
	 */
	public static float transFloat(float value){
		BigDecimal b = new BigDecimal(value);
		float c = b.setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();
		return c;
	}

}
