package xsl.cms.controller.checkControlled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xsl.cms.pojo.common.PageObject;
import xsl.cms.service.IBlackListTypeService;

@Controller
@RequestMapping("/checkControlled")
public class CC_alarmMessage {
    private final String pathName = "checkControlled";

    @Autowired
    private IBlackListTypeService iBlackListTypeService;

    /**
     * @author 王坤
     * @time 2018-10-06  下午 17:29
     * @function 进行车辆报警信息查询
     * @return 访问页面的路径
     */
    @RequestMapping("/alarm/message")
    public String accessBlackList(){
        return pathName + "/alarmMessage";
    }

    @RequestMapping("/all/alarm")
    @ResponseBody
    public PageObject getAllAlarms(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                   @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        if(pageIndex == 0){
            pageIndex = 1;
        }
        return this.iBlackListTypeService.getRecordAlarms(pageIndex,pageSize);
    }
}
