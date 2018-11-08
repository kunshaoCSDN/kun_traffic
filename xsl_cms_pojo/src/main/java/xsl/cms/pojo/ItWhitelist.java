package xsl.cms.pojo;

public class ItWhitelist {
    private Integer wlId;

    private String wlCarsignArea;

    private String wlCarsignNum;

    private Boolean wlApproveunit;

    private String wlApproveposi;

    private Boolean wlState;

    private String wlTime;

    public Integer getWlId() {
        return wlId;
    }

    public void setWlId(Integer wlId) {
        this.wlId = wlId;
    }

    public String getWlCarsignArea() {
        return wlCarsignArea;
    }

    public void setWlCarsignArea(String wlCarsignArea) {
        this.wlCarsignArea = wlCarsignArea == null ? null : wlCarsignArea.trim();
    }

    public String getWlCarsignNum() {
        return wlCarsignNum;
    }

    public void setWlCarsignNum(String wlCarsignNum) {
        this.wlCarsignNum = wlCarsignNum == null ? null : wlCarsignNum.trim();
    }

    public Boolean getWlApproveunit() {
        return wlApproveunit;
    }

    public void setWlApproveunit(Boolean wlApproveunit) {
        this.wlApproveunit = wlApproveunit;
    }

    public String getWlApproveposi() {
        return wlApproveposi;
    }

    public void setWlApproveposi(String wlApproveposi) {
        this.wlApproveposi = wlApproveposi == null ? null : wlApproveposi.trim();
    }

    public Boolean getWlState() {
        return wlState;
    }

    public void setWlState(Boolean wlState) {
        this.wlState = wlState;
    }

    public String getWlTime() {
        return wlTime;
    }

    public void setWlTime(String wlTime) {
        this.wlTime = wlTime;
    }
}