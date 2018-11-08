package xsl.cms.controller.trafficFlow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xsl.cms.pojo.common.ComboboxObject;
import xsl.cms.pojo.common.MonitorObject;
import xsl.cms.pojo.common.PageObject;
import xsl.cms.service.ITFMonthService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/trafficFlow")
public class TF_MonthController {

    private final String pathName = "trafficFlow";

    /* 车流量Service */
    @Resource
    private ITFMonthService tFMonthService;

    /**
     * @author 王坤
     * @time 2018-10-06  下午 15:35
     * @function 进行交通流量月报表/柱状图的访问
     * @return 访问页面的路径
     */
    @RequestMapping("/month/form")
    public String accessMonthForm(){
        return  pathName + "/traffic_month";
    }

    /**
     * @author 王坤
     * @time 2018-10-06  下午 15:35
     * @function 进行交通流量月柱状图的访问
     * @return 访问页面的路径
     */
    @RequestMapping("/month/chart")
    public String accessMonthChart(){
        return pathName + "/monitor_traffic_month";
    }

    /**
     * @author 王坤
     * @time 2018-10-21  下午 12:31
     * @function 进行交通流量月表格的显示
     * @return 访问页面的路径
     */
    @RequestMapping("/month/select")
    @ResponseBody
    public PageObject getTrafficList(@RequestParam(value = "pageIndex", defaultValue = "1") int pageIndex,
                                     @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                     @RequestParam(value = "toTime",defaultValue = "") String toTime){
        PageObject pageObject = tFMonthService.getTrafficList(pageIndex,pageSize,toTime);
        return  pageObject;
    }

    /**
     * @author 王坤
     * @time 2018-10-21  下午 13:09
     * @function 获取所有的检测地点
     * @return 访问页面的路径
     */
    @RequestMapping("/device/place")
    @ResponseBody
    public List<ComboboxObject> getDevicePlace(){
        List<ComboboxObject> devicePlace = tFMonthService.getDevicePlace();
        return devicePlace;
    }

    /**
     * @author 王坤
     * @time 2018-10-21  下午 13:53
     * @function 获取某月内的每日的车流量信息
     * @return 访问页面的路径
     */
    @RequestMapping("/month/monitorCount")
    @ResponseBody
    public MonitorObject getMonthMonitor(@RequestParam(value = "toMonth",defaultValue = "") String toMonth){
        MonitorObject monthMonitor = tFMonthService.getMonthMonitor(toMonth);
        return monthMonitor;
    }
}
