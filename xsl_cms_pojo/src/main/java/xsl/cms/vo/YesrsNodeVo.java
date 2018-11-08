package xsl.cms.vo;

/**
 * 年历中的节点
 */
public class YesrsNodeVo {
    private String name;         //描述眼中程度的
    private String startDate;   //开始时间
    private String endDate;     //结束时间
    private String color;       //颜色

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
