package com.dream.weixin.db.mysql.entity;

import java.util.Date;

public class OpenidMobile {
	
	public static String OMABLE = "1";
    public static String OMDISABLE = "0";

    private Integer mobileOpenId;

    private String mobile;

    private String openid;

    private Date moCreateTime;

    private Date moUpdateTime;

    private String moStatus;

    private String moType;

    public Integer getMobileOpenId() {
        return mobileOpenId;
    }

    public void setMobileOpenId(Integer mobileOpenId) {
        this.mobileOpenId = mobileOpenId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Date getMoCreateTime() {
        return moCreateTime;
    }

    public void setMoCreateTime(Date moCreateTime) {
        this.moCreateTime = moCreateTime;
    }

    public Date getMoUpdateTime() {
        return moUpdateTime;
    }

    public void setMoUpdateTime(Date moUpdateTime) {
        this.moUpdateTime = moUpdateTime;
    }

    public String getMoStatus() {
        return moStatus;
    }

    public void setMoStatus(String moStatus) {
        this.moStatus = moStatus == null ? null : moStatus.trim();
    }

    public String getMoType() {
        return moType;
    }

    public void setMoType(String moType) {
        this.moType = moType == null ? null : moType.trim();
    }
}