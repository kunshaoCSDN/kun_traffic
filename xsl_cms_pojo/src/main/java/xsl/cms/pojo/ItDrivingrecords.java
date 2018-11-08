package xsl.cms.pojo;

import java.util.Date;

public class ItDrivingrecords {
    private Integer drId;

    private Integer drDid;

    private Date drTime;

    private String drWay;

    private String drCarsignArea;

    private String drCarsignNum;

    private String drCarType;

    private String drCarColor;

    private String drCarSign;

    private Boolean drIsillegal;

    private Integer drIllegalId;

    private Integer drAlarmCode;

    private Integer drActualSpeed;

    private Integer drLimitSpeed;

    private String drImageurl;

    public Integer getDrId() {
        return drId;
    }

    public void setDrId(Integer drId) {
        this.drId = drId;
    }

    public Integer getDrDid() {
        return drDid;
    }

    public void setDrDid(Integer drDid) {
        this.drDid = drDid;
    }

    public Date getDrTime() {
        return drTime;
    }

    public void setDrTime(Date drTime) {
        this.drTime = drTime;
    }

    public String getDrWay() {
        return drWay;
    }

    public void setDrWay(String drWay) {
        this.drWay = drWay == null ? null : drWay.trim();
    }

    public String getDrCarsignArea() {
        return drCarsignArea;
    }

    public void setDrCarsignArea(String drCarsignArea) {
        this.drCarsignArea = drCarsignArea == null ? null : drCarsignArea.trim();
    }

    public String getDrCarsignNum() {
        return drCarsignNum;
    }

    public void setDrCarsignNum(String drCarsignNum) {
        this.drCarsignNum = drCarsignNum == null ? null : drCarsignNum.trim();
    }

    public String getDrCarType() {
        return drCarType;
    }

    public void setDrCarType(String drCarType) {
        this.drCarType = drCarType == null ? null : drCarType.trim();
    }

    public String getDrCarColor() {
        return drCarColor;
    }

    public void setDrCarColor(String drCarColor) {
        this.drCarColor = drCarColor == null ? null : drCarColor.trim();
    }

    public String getDrCarSign() {
        return drCarSign;
    }

    public void setDrCarSign(String drCarSign) {
        this.drCarSign = drCarSign == null ? null : drCarSign.trim();
    }

    public Boolean getDrIsillegal() {
        return drIsillegal;
    }

    public void setDrIsillegal(Boolean drIsillegal) {
        this.drIsillegal = drIsillegal;
    }

    public Integer getDrIllegalId() {
        return drIllegalId;
    }

    public void setDrIllegalId(Integer drIllegalId) {
        this.drIllegalId = drIllegalId;
    }

    public Integer getDrAlarmCode() {
        return drAlarmCode;
    }

    public void setDrAlarmCode(Integer drAlarmCode) {
        this.drAlarmCode = drAlarmCode;
    }

    public Integer getDrActualSpeed() {
        return drActualSpeed;
    }

    public void setDrActualSpeed(Integer drActualSpeed) {
        this.drActualSpeed = drActualSpeed;
    }

    public Integer getDrLimitSpeed() {
        return drLimitSpeed;
    }

    public void setDrLimitSpeed(Integer drLimitSpeed) {
        this.drLimitSpeed = drLimitSpeed;
    }

    public String getDrImageurl() {
        return drImageurl;
    }

    public void setDrImageurl(String drImageurl) {
        this.drImageurl = drImageurl == null ? null : drImageurl.trim();
    }
}