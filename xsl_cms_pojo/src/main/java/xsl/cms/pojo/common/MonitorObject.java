package xsl.cms.pojo.common;

import java.util.List;

/**
 * 柱状图的使用
 */
public class MonitorObject {
    private String xname;  //x轴的名字
    private List<Integer> keys;
    private List<Integer> values;

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname;
    }

    public List<Integer> getKeys() {
        return keys;
    }

    public void setKeys(List<Integer> keys) {
        this.keys = keys;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }
}
