package xsl.cms.controller.illegalTreatment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xsl.cms.pojo.common.PageObject;
import xsl.cms.service.IIlleagelService;

@Controller
@RequestMapping("/illegalTreatment")
public class WhiteListController {

    private final String pathName = "illegalTreatment";

    @Autowired
    private IIlleagelService iIlleagelService;

    /**
     * @author 王坤
     * @time 2018-10-08  下午 14:15
     * @function 进行白名单的录入和维护操作
     * @return 访问whiteList.jsp页面的路径
     */
    @RequestMapping("/white/list")
    public String accessIllegalImg(){
        return pathName + "/whiteList";
    }

    @RequestMapping("/whiteList/all")
    @ResponseBody
    public PageObject getWhiteLists(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                    @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        if(pageIndex == 0){
            pageIndex = 1;
        }
        return this.iIlleagelService.getWhiteList(pageIndex,pageSize);
    }
}
