package xsl.cms.pojo;

public class ItIllagelcode {
    private Integer icId;

    private String icBehaviour;

    private Integer icFine;

    private Integer icScore;

    private String icTime;

    private Boolean icState;

    public Integer getIcId() {
        return icId;
    }

    public void setIcId(Integer icId) {
        this.icId = icId;
    }

    public String getIcBehaviour() {
        return icBehaviour;
    }

    public void setIcBehaviour(String icBehaviour) {
        this.icBehaviour = icBehaviour == null ? null : icBehaviour.trim();
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

    public String getIcTime() {
        return icTime;
    }

    public void setIcTime(String icTime) {
        this.icTime = icTime;
    }

    public Boolean getIcState() {
        return icState;
    }

    public void setIcState(Boolean icState) {
        this.icState = icState;
    }
}