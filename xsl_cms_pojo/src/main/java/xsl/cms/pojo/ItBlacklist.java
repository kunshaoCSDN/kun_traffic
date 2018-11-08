package xsl.cms.pojo;

public class ItBlacklist {
    private Integer blId;

    private Integer blBid;

    private String blName;

    private Boolean blState;

    private String blRemark;

    private String blPublishunit;

    private String blPhone;

    private String blUpdatetime;

    public Integer getBlId() {
        return blId;
    }

    public void setBlId(Integer blId) {
        this.blId = blId;
    }

    public Integer getBlBid() {
        return blBid;
    }

    public void setBlBid(Integer blBid) {
        this.blBid = blBid;
    }

    public String getBlName() {
        return blName;
    }

    public void setBlName(String blName) {
        this.blName = blName == null ? null : blName.trim();
    }

    public Boolean getBlState() {
        return blState;
    }

    public void setBlState(Boolean blState) {
        this.blState = blState;
    }

    public String getBlRemark() {
        return blRemark;
    }

    public void setBlRemark(String blRemark) {
        this.blRemark = blRemark == null ? null : blRemark.trim();
    }

    public String getBlPublishunit() {
        return blPublishunit;
    }

    public void setBlPublishunit(String blPublishunit) {
        this.blPublishunit = blPublishunit == null ? null : blPublishunit.trim();
    }

    public String getBlPhone() {
        return blPhone;
    }

    public void setBlPhone(String blPhone) {
        this.blPhone = blPhone == null ? null : blPhone.trim();
    }

    public String getBlUpdatetime() {
        return blUpdatetime;
    }

    public void setBlUpdatetime(String blUpdatetime) {
        this.blUpdatetime = blUpdatetime;
    }
}