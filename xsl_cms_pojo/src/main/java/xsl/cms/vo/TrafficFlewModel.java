package xsl.cms.vo;

public class TrafficFlewModel {
    private String dPlace; // 检测站点
    private String drCarsign;//检测车牌
    private String drIsillegal;//是否违法
    private String drIsAlarm;//是否报警
    private String drDelete;//是否深处
    private String drTime;// 检测时间
    private String drImageurl;
    private String blName;
    private Integer drActualSpeed;//实速
    private Integer drLimitSpeed;//限速

    public String getBlName() {
        return blName;
    }

    public void setBlName(String blName) {
        this.blName = blName;
    }

    public String getDrImageurl() {
        return drImageurl;
    }

    public void setDrImageurl(String drImageurl) {
        this.drImageurl = drImageurl;
    }

    public String getDrDelete() {
        return drDelete;
    }

    public void setDrDelete(String drDelete) {
        this.drDelete = drDelete;
    }

    public String getDrIsAlarm() {
        return drIsAlarm;
    }

    public void setDrIsAlarm(String drIsAlarm) {
        this.drIsAlarm = drIsAlarm;
    }

    public String getdPlace() {
        return dPlace;
    }

    public void setdPlace(String dPlace) {
        this.dPlace = dPlace;
    }

    public String getDrCarsign() {
        return drCarsign;
    }

    public void setDrCarsign(String drCarsign) {
        this.drCarsign = drCarsign;
    }

    public String getDrIsillegal() {
        return drIsillegal;
    }

    public void setDrIsillegal(String drIsillegal) {
        this.drIsillegal = drIsillegal;
    }

    public String getDrTime() {
        return drTime;
    }

    public void setDrTime(String drTime) {
        this.drTime = drTime;
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
}
