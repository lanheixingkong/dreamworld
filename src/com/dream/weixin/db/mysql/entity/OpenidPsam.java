package com.dream.weixin.db.mysql.entity;

import java.util.Date;

public class OpenidPsam {
    private Integer openidPsamId;

    private String opPsam;

    private String opOpenid;

    private String opGemCode;

    private Date opCreateTime;

    private Date opUpdateTime;

    private Date opInvalidTime;

    private String opStatus;

    private String opType;

    private String opGemCodeStatus;

    private String opGemGrade;

    private String qqCode;

    private String otherOne;

    public Integer getOpenidPsamId() {
        return openidPsamId;
    }

    public void setOpenidPsamId(Integer openidPsamId) {
        this.openidPsamId = openidPsamId;
    }

    public String getOpPsam() {
        return opPsam;
    }

    public void setOpPsam(String opPsam) {
        this.opPsam = opPsam == null ? null : opPsam.trim();
    }

    public String getOpOpenid() {
        return opOpenid;
    }

    public void setOpOpenid(String opOpenid) {
        this.opOpenid = opOpenid == null ? null : opOpenid.trim();
    }

    public String getOpGemCode() {
        return opGemCode;
    }

    public void setOpGemCode(String opGemCode) {
        this.opGemCode = opGemCode == null ? null : opGemCode.trim();
    }

    public Date getOpCreateTime() {
        return opCreateTime;
    }

    public void setOpCreateTime(Date opCreateTime) {
        this.opCreateTime = opCreateTime;
    }

    public Date getOpUpdateTime() {
        return opUpdateTime;
    }

    public void setOpUpdateTime(Date opUpdateTime) {
        this.opUpdateTime = opUpdateTime;
    }

    public Date getOpInvalidTime() {
        return opInvalidTime;
    }

    public void setOpInvalidTime(Date opInvalidTime) {
        this.opInvalidTime = opInvalidTime;
    }

    public String getOpStatus() {
        return opStatus;
    }

    public void setOpStatus(String opStatus) {
        this.opStatus = opStatus == null ? null : opStatus.trim();
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType == null ? null : opType.trim();
    }

    public String getOpGemCodeStatus() {
        return opGemCodeStatus;
    }

    public void setOpGemCodeStatus(String opGemCodeStatus) {
        this.opGemCodeStatus = opGemCodeStatus == null ? null : opGemCodeStatus.trim();
    }

    public String getOpGemGrade() {
        return opGemGrade;
    }

    public void setOpGemGrade(String opGemGrade) {
        this.opGemGrade = opGemGrade == null ? null : opGemGrade.trim();
    }

    public String getQqCode() {
        return qqCode;
    }

    public void setQqCode(String qqCode) {
        this.qqCode = qqCode == null ? null : qqCode.trim();
    }

    public String getOtherOne() {
        return otherOne;
    }

    public void setOtherOne(String otherOne) {
        this.otherOne = otherOne == null ? null : otherOne.trim();
    }
}