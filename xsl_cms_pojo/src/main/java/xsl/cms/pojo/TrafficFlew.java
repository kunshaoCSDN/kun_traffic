package xsl.cms.pojo;

import java.io.Serializable;

/**
 * 交通流量的pojo，包含很多个单表的字段
 */
public class TrafficFlew implements Serializable {
    /* 形式记录 */
    private String drTime;/* 检测时间 */
    private String drWay;/* 检测车道 */
    private String drCarsignArea;/* 车牌号地区 */
    private String drCarsignNum;/* 车牌号号码 */
    private String drCarType;/* 汽车车型 */
    private String drCarColor;/* 汽车颜色 */
    private String drCarSign;/* 汽车品牌 */
    private Boolean drIsillegal;/* 是否违法 */
    private Integer drActualSpeed;/* 实速 */
    private Integer drLimitSpeed;/* 限速 */
    private String drImageurl;

    public String getDrImageurl() {
        return drImageurl;
    }

    public void setDrImageurl(String drImageurl) {
        this.drImageurl = drImageurl;
    }

    /* 检测设备 */
    private ItDevice itDevice;

    /* 报警 */
    private ItBlacklist itBlacklist;

    public ItBlacklist getItBlacklist() {
        return itBlacklist;
    }

    public void setItBlacklist(ItBlacklist itBlacklist) {
        this.itBlacklist = itBlacklist;
    }

    public String getDrTime() {
        return drTime;
    }

    public void setDrTime(String drTime) {
        this.drTime = drTime;
    }

    public String getDrWay() {
        return drWay;
    }

    public void setDrWay(String drWay) {
        this.drWay = drWay;
    }

    public String getDrCarsignArea() {
        return drCarsignArea;
    }

    public void setDrCarsignArea(String drCarsignArea) {
        this.drCarsignArea = drCarsignArea;
    }

    public String getDrCarsignNum() {
        return drCarsignNum;
    }

    public void setDrCarsignNum(String drCarsignNum) {
        this.drCarsignNum = drCarsignNum;
    }

    public String getDrCarType() {
        return drCarType;
    }

    public void setDrCarType(String drCarType) {
        this.drCarType = drCarType;
    }

    public String getDrCarColor() {
        return drCarColor;
    }

    public void setDrCarColor(String drCarColor) {
        this.drCarColor = drCarColor;
    }

    public String getDrCarSign() {
        return drCarSign;
    }

    public void setDrCarSign(String drCarSign) {
        this.drCarSign = drCarSign;
    }

    public Boolean getDrIsillegal() {
        return drIsillegal;
    }

    public void setDrIsillegal(Boolean drIsillegal) {
        this.drIsillegal = drIsillegal;
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

    public ItDevice getItDevice() {
        return itDevice;
    }

    public void setItDevice(ItDevice itDevice) {
        this.itDevice = itDevice;
    }
}
