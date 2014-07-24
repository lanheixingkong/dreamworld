package com.dream.weixin.db.mysql.entity;

import net.sf.json.JSONObject;

import org.apache.commons.lang.builder.ToStringBuilder;


public class PsamProperty {
    private Integer psamPropId;

    private String psamPropName;

    private String psamPropValue;

    private String psamPropValueType;

    private String psamPropStatus;

    private String psamPropParser;

    private String psamId;

    private String psamPropDesc;

    public Integer getPsamPropId() {
        return psamPropId;
    }

    public void setPsamPropId(Integer psamPropId) {
        this.psamPropId = psamPropId;
    }

    public String getPsamPropName() {
        return psamPropName;
    }

    public void setPsamPropName(String psamPropName) {
        this.psamPropName = psamPropName == null ? null : psamPropName.trim();
    }

    public String getPsamPropValue() {
        return psamPropValue;
    }

    public void setPsamPropValue(String psamPropValue) {
        this.psamPropValue = psamPropValue == null ? null : psamPropValue.trim();
    }

    public String getPsamPropValueType() {
        return psamPropValueType;
    }

    public void setPsamPropValueType(String psamPropValueType) {
        this.psamPropValueType = psamPropValueType == null ? null : psamPropValueType.trim();
    }

    public String getPsamPropStatus() {
        return psamPropStatus;
    }

    public void setPsamPropStatus(String psamPropStatus) {
        this.psamPropStatus = psamPropStatus == null ? null : psamPropStatus.trim();
    }

    public String getPsamPropParser() {
        return psamPropParser;
    }

    public void setPsamPropParser(String psamPropParser) {
        this.psamPropParser = psamPropParser == null ? null : psamPropParser.trim();
    }

    public String getPsamId() {
        return psamId;
    }

    public void setPsamId(String psamId) {
        this.psamId = psamId;
    }

    public String getPsamPropDesc() {
        return psamPropDesc;
    }

    public void setPsamPropDesc(String psamPropDesc) {
        this.psamPropDesc = psamPropDesc == null ? null : psamPropDesc.trim();
    }
    
    
   
}