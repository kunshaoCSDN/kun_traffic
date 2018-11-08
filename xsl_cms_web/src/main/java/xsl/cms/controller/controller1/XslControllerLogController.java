package xsl.cms.controller.controller1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xsl.cms.pojo.PersonWorkplace;
import xsl.cms.pojo.common.MonitorObject;
import xsl.cms.pojo.common.PageObject;
import xsl.cms.service.IXslControllerLogService;

import java.util.List;

/**
 *  对controllerLog.jsp进行操作
 *  @author 王坤
 *  */
@Controller
@RequestMapping("/log/controller")
public class XslControllerLogController {
    @Autowired
    private IXslControllerLogService xslControllerLogService;

    //一定注意pageindex+1这个动作，因为第一页为0
    //@SystemControllerLog( description = "Controller日志查询" )
    @RequestMapping("/list")
    @ResponseBody
    public PageObject getXslControllerLogInfo(Integer pageIndex, Integer pageSize){
        return this.xslControllerLogService.SelectControllerLogAll(pageIndex+1,pageSize);
    }

    @RequestMapping("/monitor")
    public String getPersonWorkplaceMonitorPage(){
        return "statisticalAnalysis/monitor_personWork";
    }

    @RequestMapping("/personWork")
    @ResponseBody
    public List<PersonWorkplace> getPersonWorkplaces(){
        return this.xslControllerLogService.getPersonWorkplaces();
    }

    @RequestMapping("/personMonitor")
    @ResponseBody
    public MonitorObject getPersonWorkplaceMonitor(){
        return this.xslControllerLogService.getPersonWorkplaceMonitor();
    }
}
