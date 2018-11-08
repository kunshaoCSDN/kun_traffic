package xsl.cms.vo;

public class IlleagelRecordVo {
    private Integer drId;
    private String drTime;
    private String drWay;
    private String drCarsign;
    private Boolean drIsillegal;
    private Integer drActualSpeed;
    private Integer drLimitSpeed;

    private Integer icId;
    private Integer icFine;//罚金
    private Integer icScore;//扣分

    private Integer irId;
    private String irImg;//违法图片路径
    private String irRemark;//违法原因

    private Integer dId;
    private String dPlace;//地方

    public Integer getDrId() {
        return drId;
    }

    public void setDrId(Integer drId) {
        this.drId = drId;
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

    public String getDrCarsign() {
        return drCarsign;
    }

    public void setDrCarsign(String drCarsign) {
        this.drCarsign = drCarsign;
    }

    public Boolean getDrIsillegal() {
        return drIsillegal;
    }

    public void setDrIsillegal(Boolean drIsillegal) {
        this.drIsillegal = drIsillegal;
    }

    public Integer getIcId() {
        return icId;
    }

    public void setIcId(Integer icId) {
        this.icId = icId;
    }

    public Integer getIcFine() {
        return icFine;
    }

    public void setIcFine(Integer icFine) {
        this.icFine = icFine;
    }

    public Integer getIcScore() {
        return icScore;
    }

    public void setIcScore(Integer icScore) {
        this.icScore = icScore;
    }

    public Integer getIrId() {
        return irId;
    }

    public void setIrId(Integer irId) {
        this.irId = irId;
    }

    public String getIrImg() {
        return irImg;
    }

    public void setIrImg(String irImg) {
        this.irImg = irImg;
    }

    public String getIrRemark() {
        return irRemark;
    }

    public void setIrRemark(String irRemark) {
        this.irRemark = irRemark;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdPlace() {
        return dPlace;
    }

    public void setdPlace(String dPlace) {
        this.dPlace = dPlace;
    }
}
