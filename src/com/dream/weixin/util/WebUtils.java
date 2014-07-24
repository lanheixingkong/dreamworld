package com.dream.weixin.util;


import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.dream.weixin.model.exception.ServiceException;


public class WebUtils {

   
    /**
     * 获取int值
     * @param request
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ServiceException 
     */
    public static int getIntValue(HttpServletRequest request, String paramName, int defaultValue, boolean notNull) throws ServiceException {
        return getValue(request, paramName, defaultValue, notNull);
    }
   
    @SuppressWarnings("unchecked")
    public static <T> T getValue(HttpServletRequest request, String paramName, T defaultValue, boolean notNull) throws ServiceException {
        String paramValue = request.getParameter(paramName);
        checkValue(paramName, paramValue, notNull);
        if (paramValue != null) {
            if (defaultValue instanceof Integer) {
                return (T)(Integer.valueOf(paramValue));
            }
            if (defaultValue instanceof Double) {
                return (T)(Double.valueOf(paramValue));
            }
            if (defaultValue instanceof Long) {
                return (T)(Long.valueOf(paramValue));
            }
            if (defaultValue instanceof Float) {
                return (T)(Float.valueOf(paramValue));
            }
            if (defaultValue instanceof String) {
                return (T)(paramValue);
            }
        }
        return defaultValue;
    }
   
    /**
     * 辅助方法
     * @param paramValue
     * @param notNull
     */
    private static void checkValue(String paramName, String paramValue, boolean notNull) throws ServiceException {
        if (notNull && StringUtils.isBlank(paramValue)) {
            throw new ServiceException("请传递参数：" + paramName);
        }
    }
   
    /**
     * 获取int值
     * @param request
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ServiceException 
     */
    public static int getIntValue(HttpServletRequest request, String paramName) throws ServiceException {
        return getIntValue(request, paramName, -1, false);
    }
   
    /**
     * 获取int值
     * @param request
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ServiceException 
     */
    public static int getIntValue(HttpServletRequest request, String paramName, int defaultValue) throws ServiceException {
        return getIntValue(request, paramName, defaultValue, false);
    }
   
    /**
     * 获取int值
     * @param request
     * @param paramName
     * @param notNull
     * @return
     * @throws ServiceException 
     */
    public static int getIntValue(HttpServletRequest request, String paramName, boolean notNull) throws ServiceException {
        return getIntValue(request, paramName, -1, false);
    }
   
    /**
     * 返回字符串，默认返回""
     * @param request
     * @param paramName
     * @return
     * @throws ServiceException 
     */
    public static String getStringValue(HttpServletRequest request, String paramName) throws ServiceException {
        return getStringValue(request, paramName, false);
    }
   
    /**
     * 获取String值
     * @param request
     * @param paramName
     * @param notNull
     * @return
     */
    public static String getStringValue(HttpServletRequest request, String paramName, boolean notNull) throws ServiceException {
        return getValue(request, paramName, "", notNull);
    }
   
    /**
     * 获取double值
     * @param request
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ServiceException 
     */
    public static double getDoubleValue(HttpServletRequest request, String paramName, double defaultValue) throws ServiceException {
        return getDoubleValue(request, paramName, defaultValue, false);
    }
   
    /**
     * 获取double值
     * @param request
     * @param paramName
     * @param defaultValue
     * @return
     */
    public static double getDoubleValue(HttpServletRequest request, String paramName, double defaultValue, boolean notNull) throws ServiceException {
        return getValue(request, paramName, defaultValue, notNull);
    }
   
    public static double getDoubleValue(HttpServletRequest request, String paramName,  boolean notNull) throws ServiceException {
        return getDoubleValue(request, paramName, -1, notNull);
    }
   
    /**
     * 获取double值
     * @param request
     * @param paramName
     * @return
     * @throws ServiceException 
     */
    public static double getDoubleValue(HttpServletRequest request, String paramName) throws ServiceException {
        return getDoubleValue(request, paramName, 0);
    }
   
    /**
     * 获取boolean值
     * @param request
     * @param paramName
     * @param defaultValue
     * @return
     * @throws ServiceException 
     */
    public static boolean getBooleanValue(HttpServletRequest request, String paramName, boolean defaultValue) throws ServiceException {
        return getBooleanValue(request, paramName, defaultValue, false);
    }
   
    /**
     * 获取boolean值
     * @param request
     * @param paramName
     * @param defaultValue
     * @param notNull
     * @return
     * @throws ServiceException 
     */
    public static boolean getBooleanValue(HttpServletRequest request, String paramName, boolean defaultValue, boolean notNull) throws ServiceException {
        String paramValue = request.getParameter(paramName);
        checkValue(paramName, paramValue, notNull);
        if (paramValue == null) {
            return defaultValue;
        }
        if (paramValue.equals("true")) {
            return true;
        }
        if (paramValue.equals("false")) {
            return false;
        }
        if (paramValue.equals("1")) {
            return true;
        }
        if (paramValue.equals("0")) {
            return false;
        }
        return false;
    }
   
    public static Long getLongValue(HttpServletRequest request, String paramName, long defaultValue, boolean notNull) throws ServiceException {
        return getValue(request, paramName, defaultValue, notNull);
    }
   
    /**
     * 获取boolean值
     * @param request
     * @param paramName
     * @return
     * @throws ServiceException 
     */
    public static boolean getBooleanValue(HttpServletRequest request, String paramName) throws ServiceException {
        return getBooleanValue(request, paramName, false);
    }
   
}