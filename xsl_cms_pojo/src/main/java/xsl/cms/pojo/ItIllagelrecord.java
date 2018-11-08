package xsl.cms.pojo;

import java.util.Date;

public class ItIllagelrecord {
    private Integer irId;

    private Integer irIid;

    private Boolean irState;

    private String irImg;

    private Date irApprovetime;

    private String irRemark;

    public Integer getIrId() {
        return irId;
    }

    public void setIrId(Integer irId) {
        this.irId = irId;
    }

    public Integer getIrIid() {
        return irIid;
    }

    public void setIrIid(Integer irIid) {
        this.irIid = irIid;
    }

    public Boolean getIrState() {
        return irState;
    }

    public void setIrState(Boolean irState) {
        this.irState = irState;
    }

    public String getIrImg() {
        return irImg;
    }

    public void setIrImg(String irImg) {
        this.irImg = irImg == null ? null : irImg.trim();
    }

    public Date getIrApprovetime() {
        return irApprovetime;
    }

    public void setIrApprovetime(Date irApprovetime) {
        this.irApprovetime = irApprovetime;
    }

    public String getIrRemark() {
        return irRemark;
    }

    public void setIrRemark(String irRemark) {
        this.irRemark = irRemark == null ? null : irRemark.trim();
    }
}