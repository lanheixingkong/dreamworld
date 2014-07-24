package com.dream.weixin.db.mysql.entity;

public class TermDevice {
    private Integer id;

    private String deviceCode;

    private String deviceErpCode;

    private String tCode;

    private String psam;

    private String netNo;

    private String tNo;

    private String tExt;

    private String platform;

    private String openDate;

    private String closeDate;

    private String state;

    private String machineFactory;

    private String machineKind;

    private String hasChassis;

    private String chassisKind;

    private String hasScreen;

    private String screenKind;

    private String menuVer;

    private String tsUp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode == null ? null : deviceCode.trim();
    }

    public String getDeviceErpCode() {
        return deviceErpCode;
    }

    public void setDeviceErpCode(String deviceErpCode) {
        this.deviceErpCode = deviceErpCode == null ? null : deviceErpCode.trim();
    }

    public String gettCode() {
        return tCode;
    }

    public void settCode(String tCode) {
        this.tCode = tCode == null ? null : tCode.trim();
    }

    public String getPsam() {
        return psam;
    }

    public void setPsam(String psam) {
        this.psam = psam == null ? null : psam.trim();
    }

    public String getNetNo() {
        return netNo;
    }

    public void setNetNo(String netNo) {
        this.netNo = netNo == null ? null : netNo.trim();
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo == null ? null : tNo.trim();
    }

    public String gettExt() {
        return tExt;
    }

    public void settExt(String tExt) {
        this.tExt = tExt == null ? null : tExt.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate == null ? null : openDate.trim();
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate == null ? null : closeDate.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getMachineFactory() {
        return machineFactory;
    }

    public void setMachineFactory(String machineFactory) {
        this.machineFactory = machineFactory == null ? null : machineFactory.trim();
    }

    public String getMachineKind() {
        return machineKind;
    }

    public void setMachineKind(String machineKind) {
        this.machineKind = machineKind == null ? null : machineKind.trim();
    }

    public String getHasChassis() {
        return hasChassis;
    }

    public void setHasChassis(String hasChassis) {
        this.hasChassis = hasChassis == null ? null : hasChassis.trim();
    }

    public String getChassisKind() {
        return chassisKind;
    }

    public void setChassisKind(String chassisKind) {
        this.chassisKind = chassisKind == null ? null : chassisKind.trim();
    }

    public String getHasScreen() {
        return hasScreen;
    }

    public void setHasScreen(String hasScreen) {
        this.hasScreen = hasScreen == null ? null : hasScreen.trim();
    }

    public String getScreenKind() {
        return screenKind;
    }

    public void setScreenKind(String screenKind) {
        this.screenKind = screenKind == null ? null : screenKind.trim();
    }

    public String getMenuVer() {
        return menuVer;
    }

    public void setMenuVer(String menuVer) {
        this.menuVer = menuVer == null ? null : menuVer.trim();
    }

    public String getTsUp() {
        return tsUp;
    }

    public void setTsUp(String tsUp) {
        this.tsUp = tsUp == null ? null : tsUp.trim();
    }
}