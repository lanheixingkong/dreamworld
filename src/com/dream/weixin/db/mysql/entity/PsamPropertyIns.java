package com.dream.weixin.db.mysql.entity;

public class PsamPropertyIns {
    private Integer psamPropInsId;

    private Integer psamPropId;

    private String psamId;

    private String psamPropName;

    private String psamPropValue;

    private String psamPropStatus;

    public Integer getPsamPropInsId() {
        return psamPropInsId;
    }

    public void setPsamPropInsId(Integer psamPropInsId) {
        this.psamPropInsId = psamPropInsId;
    }

    public Integer getPsamPropId() {
        return psamPropId;
    }

    public void setPsamPropId(Integer psamPropId) {
        this.psamPropId = psamPropId;
    }

    public String getPsamId() {
        return psamId;
    }

    public void setPsamId(String psamId) {
        this.psamId = psamId;
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

    public String getPsamPropStatus() {
        return psamPropStatus;
    }

    public void setPsamPropStatus(String psamPropStatus) {
        this.psamPropStatus = psamPropStatus == null ? null : psamPropStatus.trim();
    }
}