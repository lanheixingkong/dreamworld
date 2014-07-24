package com.dream.weixin.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author wenmx E-mail:wenmxiang@163.com
 * @version 创建时间：2013-5-27 下午7:27:24 类说明
 */
public class MathUtil {

	public static float decimalFormat(float price) {
		java.text.
		DecimalFormat formater = new DecimalFormat();
		formater.setMaximumFractionDigits(2);
		formater.setMinimumFractionDigits(1);

		return Float.parseFloat(formater.format(price));

	}
	

	static final int location = 10;

	public static BigDecimal add(double value1, double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.add(b2);
	}

	public static BigDecimal sub(double value1, double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.subtract(b2);
	}

	public static BigDecimal mul(double value1, double value2) {
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.multiply(b2);
	}

	public static BigDecimal div(double value1, double value2) {
		return div(value1, value2, location);
	}

	public static BigDecimal div(double value1, double value2, int b) {
		if (b < 0) {
			System.out.println("b值必须大于等于0");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));
		return b1.divide(b2, b, BigDecimal.ROUND_HALF_UP);
	}
	

}
