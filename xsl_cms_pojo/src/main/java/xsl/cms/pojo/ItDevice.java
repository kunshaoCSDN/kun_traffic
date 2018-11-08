package xsl.cms.pojo;

import java.io.Serializable;

public class ItDevice implements Serializable {
    private Integer dId;

    private String dName;

    private String dPlace;

    private String dDirect;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdPlace() {
        return dPlace;
    }

    public void setdPlace(String dPlace) {
        this.dPlace = dPlace == null ? null : dPlace.trim();
    }

    public String getdDirect() {
        return dDirect;
    }

    public void setdDirect(String dDirect) {
        this.dDirect = dDirect == null ? null : dDirect.trim();
    }
}