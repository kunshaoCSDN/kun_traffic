package xsl.cms.controller.trafficFlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xsl.cms.pojo.common.MonitorObject;
import xsl.cms.pojo.common.PageObject;
import xsl.cms.service.ITFMonthService;

@Controller
@RequestMapping("/trafficFlow")
public class TF_DayController {

    private final String pathName = "trafficFlow";

    @Autowired
    private ITFMonthService tFMonthService;

    /**
     * @author 王坤
     * @time 2018-10-06  下午 16:10
     * @function 进行交通流量日报表/柱状图的访问
     * @return 访问页面的路径
     */
    @RequestMapping("/day/form")
    public String accessMonthForm(){
        return  pathName + "/traffic_day";
    }

    /**
     * @author 王坤
     * @time 2018-10-06  下午 16:10
     * @function 进行交通流量日柱状图的访问
     * @return 访问页面的路径
     */
    @RequestMapping("/day/chart")
    public String accessMonthChart(){
        return pathName + "/monitor_traffic_day";
    }

    /**
     * @author 王坤
     * @time 2018-10-21  下午 13:56
     * @function 进行交通流量日表格的显示
     * @return 访问页面的路径
     */
    @RequestMapping("/day/select")
    @ResponseBody
    public PageObject getTrafficList(@RequestParam(value = "pageIndex", defaultValue = "1") int pageIndex,
                                     @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                     @RequestParam(value = "toDay",defaultValue = "") String toDay){
        PageObject pageObject = tFMonthService.getDayTrafficList(pageIndex,pageSize,toDay);
        return  pageObject;
    }

    /**
     * @author 王坤
     * @time 2018-10-27  下午 20:18
     * @function 进行交通流量日监控
     * @return 访问页面的路径
     */
    @RequestMapping(value = "/day/monitorCount")
    @ResponseBody
    public MonitorObject getMonitorByDay(@RequestParam(value = "toDay",defaultValue = "") String toDay){
        System.out.println(toDay);
        return this.tFMonthService.getDayMonitor(toDay);
    }
}
