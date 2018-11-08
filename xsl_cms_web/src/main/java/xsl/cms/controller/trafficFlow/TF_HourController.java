package xsl.cms.controller.trafficFlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xsl.cms.pojo.common.PageObject;
import xsl.cms.service.ITFMonthService;

@Controller
@RequestMapping("/trafficFlow")
public class TF_HourController {

    private final String pathName = "trafficFlow";

    @Autowired
    private ITFMonthService tFMonthService;

    /**
     * @author 王坤
     * @time 2018-10-06  下午 16:40
     * @function 进行交通流量时报表/柱状图的访问
     * @return 访问页面的路径
     */
    @RequestMapping("/hour/form")
    public String accessMonthForm(){
        return  pathName + "/traffic_hour";
    }

    /**
     * @author 王坤
     * @time 2018-10-21  下午 14:12
     * @function 进行交通流量时表格的显示
     * @return 访问页面的路径
     */
    @RequestMapping("/hour/select")
    @ResponseBody
    public PageObject getHourTrafficList(@RequestParam(value = "pageIndex", defaultValue = "1") int pageIndex,
                                         @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
                                         @RequestParam(value = "toHour",defaultValue = "") String toHour){
        PageObject pageObject = tFMonthService.getHourTrafficList(pageIndex,pageSize,toHour);
        return  pageObject;
    }
}
