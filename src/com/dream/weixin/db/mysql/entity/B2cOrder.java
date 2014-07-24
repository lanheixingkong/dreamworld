package com.dream.weixin.db.mysql.entity;

import java.math.BigDecimal;

public class B2cOrder {
    private Long orderId;

    private String netNo;

    private String gysids;

    private String gysName;

    private String psam;

    private String billno;

    private String payTime;

    private BigDecimal totalAmount;

    private BigDecimal finalAmount;

    private String payStatus;

    private String quhuotime;

    private String daohuotime;

    private String isqianshou;

    private String isdaohuo;

    private String shipStatus;

    private String arrivalStatus;

    private String receviceStatus;

    private String isDelivery;

    private Long createtime;

    private Long lastModified;

    private String payment;

    private Integer shippingId;

    private String shipping;

    private Integer memberId;

    private String memberName;

    private String memberIdCard;

    private String status;

    private String isDead;

    private String confirm;

    private String shipArea;

    private String shipName;

    private BigDecimal weight;

    private Integer itemnum;

    private String ip;

    private String shipZip;

    private String shipTel;

    private String shipEmail;

    private String shipTime;

    private String shipMobile;

    private BigDecimal costItem;

    private String isTax;

    private BigDecimal costTax;

    private String taxCompany;

    private String isProtect;

    private BigDecimal costProtect;

    private BigDecimal costPayment;

    private String currency;

    private BigDecimal curRate;

    private BigDecimal scoreU;

    private BigDecimal scoreG;

    private BigDecimal discount;

    private BigDecimal pmtGoods;

    private BigDecimal pmtOrder;

    private BigDecimal payed;

    private String disabled;

    private String markType;

    private BigDecimal costFreight;

    private String extend;

    private String orderRefer;

    private String source;

    private String billSettleStatus;

    private String billSettleMsg;

    private String channelSource;

    private String channelType;

    private String os;

    private String sid;

    private String netid;

    private String terminalno;

    private String paymentseri;

    private String billid;

    private String isFenrun;

    private String isRemoney;

    private BigDecimal reAmount;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getNetNo() {
        return netNo;
    }

    public void setNetNo(String netNo) {
        this.netNo = netNo == null ? null : netNo.trim();
    }

    public String getGysids() {
        return gysids;
    }

    public void setGysids(String gysids) {
        this.gysids = gysids == null ? null : gysids.trim();
    }

    public String getGysName() {
        return gysName;
    }

    public void setGysName(String gysName) {
        this.gysName = gysName == null ? null : gysName.trim();
    }

    public String getPsam() {
        return psam;
    }

    public void setPsam(String psam) {
        this.psam = psam == null ? null : psam.trim();
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getQuhuotime() {
        return quhuotime;
    }

    public void setQuhuotime(String quhuotime) {
        this.quhuotime = quhuotime == null ? null : quhuotime.trim();
    }

    public String getDaohuotime() {
        return daohuotime;
    }

    public void setDaohuotime(String daohuotime) {
        this.daohuotime = daohuotime == null ? null : daohuotime.trim();
    }

    public String getIsqianshou() {
        return isqianshou;
    }

    public void setIsqianshou(String isqianshou) {
        this.isqianshou = isqianshou == null ? null : isqianshou.trim();
    }

    public String getIsdaohuo() {
        return isdaohuo;
    }

    public void setIsdaohuo(String isdaohuo) {
        this.isdaohuo = isdaohuo == null ? null : isdaohuo.trim();
    }

    public String getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(String shipStatus) {
        this.shipStatus = shipStatus == null ? null : shipStatus.trim();
    }

    public String getArrivalStatus() {
        return arrivalStatus;
    }

    public void setArrivalStatus(String arrivalStatus) {
        this.arrivalStatus = arrivalStatus == null ? null : arrivalStatus.trim();
    }

    public String getReceviceStatus() {
        return receviceStatus;
    }

    public void setReceviceStatus(String receviceStatus) {
        this.receviceStatus = receviceStatus == null ? null : receviceStatus.trim();
    }

    public String getIsDelivery() {
        return isDelivery;
    }

    public void setIsDelivery(String isDelivery) {
        this.isDelivery = isDelivery == null ? null : isDelivery.trim();
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping == null ? null : shipping.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberIdCard() {
        return memberIdCard;
    }

    public void setMemberIdCard(String memberIdCard) {
        this.memberIdCard = memberIdCard == null ? null : memberIdCard.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsDead() {
        return isDead;
    }

    public void setIsDead(String isDead) {
        this.isDead = isDead == null ? null : isDead.trim();
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm == null ? null : confirm.trim();
    }

    public String getShipArea() {
        return shipArea;
    }

    public void setShipArea(String shipArea) {
        this.shipArea = shipArea == null ? null : shipArea.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getItemnum() {
        return itemnum;
    }

    public void setItemnum(Integer itemnum) {
        this.itemnum = itemnum;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getShipZip() {
        return shipZip;
    }

    public void setShipZip(String shipZip) {
        this.shipZip = shipZip == null ? null : shipZip.trim();
    }

    public String getShipTel() {
        return shipTel;
    }

    public void setShipTel(String shipTel) {
        this.shipTel = shipTel == null ? null : shipTel.trim();
    }

    public String getShipEmail() {
        return shipEmail;
    }

    public void setShipEmail(String shipEmail) {
        this.shipEmail = shipEmail == null ? null : shipEmail.trim();
    }

    public String getShipTime() {
        return shipTime;
    }

    public void setShipTime(String shipTime) {
        this.shipTime = shipTime == null ? null : shipTime.trim();
    }

    public String getShipMobile() {
        return shipMobile;
    }

    public void setShipMobile(String shipMobile) {
        this.shipMobile = shipMobile == null ? null : shipMobile.trim();
    }

    public BigDecimal getCostItem() {
        return costItem;
    }

    public void setCostItem(BigDecimal costItem) {
        this.costItem = costItem;
    }

    public String getIsTax() {
        return isTax;
    }

    public void setIsTax(String isTax) {
        this.isTax = isTax == null ? null : isTax.trim();
    }

    public BigDecimal getCostTax() {
        return costTax;
    }

    public void setCostTax(BigDecimal costTax) {
        this.costTax = costTax;
    }

    public String getTaxCompany() {
        return taxCompany;
    }

    public void setTaxCompany(String taxCompany) {
        this.taxCompany = taxCompany == null ? null : taxCompany.trim();
    }

    public String getIsProtect() {
        return isProtect;
    }

    public void setIsProtect(String isProtect) {
        this.isProtect = isProtect == null ? null : isProtect.trim();
    }

    public BigDecimal getCostProtect() {
        return costProtect;
    }

    public void setCostProtect(BigDecimal costProtect) {
        this.costProtect = costProtect;
    }

    public BigDecimal getCostPayment() {
        return costPayment;
    }

    public void setCostPayment(BigDecimal costPayment) {
        this.costPayment = costPayment;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getCurRate() {
        return curRate;
    }

    public void setCurRate(BigDecimal curRate) {
        this.curRate = curRate;
    }

    public BigDecimal getScoreU() {
        return scoreU;
    }

    public void setScoreU(BigDecimal scoreU) {
        this.scoreU = scoreU;
    }

    public BigDecimal getScoreG() {
        return scoreG;
    }

    public void setScoreG(BigDecimal scoreG) {
        this.scoreG = scoreG;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPmtGoods() {
        return pmtGoods;
    }

    public void setPmtGoods(BigDecimal pmtGoods) {
        this.pmtGoods = pmtGoods;
    }

    public BigDecimal getPmtOrder() {
        return pmtOrder;
    }

    public void setPmtOrder(BigDecimal pmtOrder) {
        this.pmtOrder = pmtOrder;
    }

    public BigDecimal getPayed() {
        return payed;
    }

    public void setPayed(BigDecimal payed) {
        this.payed = payed;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled == null ? null : disabled.trim();
    }

    public String getMarkType() {
        return markType;
    }

    public void setMarkType(String markType) {
        this.markType = markType == null ? null : markType.trim();
    }

    public BigDecimal getCostFreight() {
        return costFreight;
    }

    public void setCostFreight(BigDecimal costFreight) {
        this.costFreight = costFreight;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    public String getOrderRefer() {
        return orderRefer;
    }

    public void setOrderRefer(String orderRefer) {
        this.orderRefer = orderRefer == null ? null : orderRefer.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getBillSettleStatus() {
        return billSettleStatus;
    }

    public void setBillSettleStatus(String billSettleStatus) {
        this.billSettleStatus = billSettleStatus == null ? null : billSettleStatus.trim();
    }

    public String getBillSettleMsg() {
        return billSettleMsg;
    }

    public void setBillSettleMsg(String billSettleMsg) {
        this.billSettleMsg = billSettleMsg == null ? null : billSettleMsg.trim();
    }

    public String getChannelSource() {
        return channelSource;
    }

    public void setChannelSource(String channelSource) {
        this.channelSource = channelSource == null ? null : channelSource.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getNetid() {
        return netid;
    }

    public void setNetid(String netid) {
        this.netid = netid == null ? null : netid.trim();
    }

    public String getTerminalno() {
        return terminalno;
    }

    public void setTerminalno(String terminalno) {
        this.terminalno = terminalno == null ? null : terminalno.trim();
    }

    public String getPaymentseri() {
        return paymentseri;
    }

    public void setPaymentseri(String paymentseri) {
        this.paymentseri = paymentseri == null ? null : paymentseri.trim();
    }

    public String getBillid() {
        return billid;
    }

    public void setBillid(String billid) {
        this.billid = billid == null ? null : billid.trim();
    }

    public String getIsFenrun() {
        return isFenrun;
    }

    public void setIsFenrun(String isFenrun) {
        this.isFenrun = isFenrun == null ? null : isFenrun.trim();
    }

    public String getIsRemoney() {
        return isRemoney;
    }

    public void setIsRemoney(String isRemoney) {
        this.isRemoney = isRemoney == null ? null : isRemoney.trim();
    }

    public BigDecimal getReAmount() {
        return reAmount;
    }

    public void setReAmount(BigDecimal reAmount) {
        this.reAmount = reAmount;
    }
}