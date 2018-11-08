package xsl.cms.controller.trafficFlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xsl.cms.service.ITFMonthService;
import xsl.cms.vo.YesrsNodeVo;

import java.util.List;

@Controller
@RequestMapping("/TrafficFlowMapper")
public class TFController {

    private final String pathName = "TrafficFlowMapper";

    @Autowired
    private ITFMonthService itfMonthService;

    /**
     * @author 王坤
     * @time 2018-10-06  下午 16:10
     * @function 进行交通流量日报表/柱状图的访问
     * @return 访问页面的路径
     */
    @RequestMapping("/chart")
    public String accessMonthForm(){
        return  pathName + "/monitor_traffic";
    }

    @RequestMapping("/year/date")
    @ResponseBody
    public List<YesrsNodeVo> getYearDates(){
        return this.itfMonthService.getYearDates();
    }

}
