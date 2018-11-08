package xsl.cms.service;

import xsl.cms.pojo.common.ComboboxObject;
import xsl.cms.pojo.common.MonitorObject;
import xsl.cms.pojo.common.PageObject;
import xsl.cms.vo.YesrsNodeVo;

import java.util.List;

public interface ITFMonthService {
    PageObject SelectMonth(Integer pageIndex, Integer pageSize);
    /* 获取月车流量信息 */
    PageObject getTrafficList(Integer pageIndex, Integer pageSize, String toTime);
    /* 获取日车流量信息 */
    PageObject getDayTrafficList(Integer pageIndex, Integer pageSize, String toDay);
    /* 获取日车流量信息 */
    PageObject getHourTrafficList(Integer pageIndex, Integer pageSize, String toHour);
    /* 获取检测地点  */
    List<ComboboxObject> getDevicePlace();
    /* 获取某个月内的每天的车流量信息 */
    MonitorObject getMonthMonitor(String toMonth);
    /* 获取某一天内的每小时的车辆的信息 */
    MonitorObject getDayMonitor(String toDay);
    /* 获取年历中的信息 */
    List<YesrsNodeVo> getYearDates();
}
