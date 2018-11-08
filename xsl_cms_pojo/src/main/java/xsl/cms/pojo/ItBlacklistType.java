package xsl.cms.pojo;

public class ItBlacklistType {
    private Integer btId;

    private String btName;

    private Boolean btLevel;

    private String btRemark;

    private Boolean btState;

    private Long btUsecount;

    private String btUpdatetime;

    public Integer getBtId() {
        return btId;
    }

    public void setBtId(Integer btId) {
        this.btId = btId;
    }

    public String getBtName() {
        return btName;
    }

    public void setBtName(String btName) {
        this.btName = btName == null ? null : btName.trim();
    }

    public Boolean getBtLevel() {
        return btLevel;
    }

    public void setBtLevel(Boolean btLevel) {
        this.btLevel = btLevel;
    }

    public String getBtRemark() {
        return btRemark;
    }

    public void setBtRemark(String btRemark) {
        this.btRemark = btRemark == null ? null : btRemark.trim();
    }

    public Boolean getBtState() {
        return btState;
    }

    public void setBtState(Boolean btState) {
        this.btState = btState;
    }

    public Long getBtUsecount() {
        return btUsecount;
    }

    public void setBtUsecount(Long btUsecount) {
        this.btUsecount = btUsecount;
    }

    public String getBtUpdatetime() {
        return btUpdatetime;
    }

    public void setBtUpdatetime(String btUpdatetime) {
        this.btUpdatetime = btUpdatetime;
    }
}