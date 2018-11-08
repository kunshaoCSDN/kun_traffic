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
public class IllegalApproveController {

    private final String pathName = "illegalTreatment";

    @Autowired
    private IIlleagelService iIlleagelService;

    /**
     * @author 王坤
     * @time 2018-10-08  下午 14:12
     * @function 进行违法图片录入之后的审核操作
     * @return 访问illegal_approve.jsp页面的路径
     */
    @RequestMapping("/illegal/approve")
    public String accessIllegalImg(){
        return pathName + "/illegal_approve";
    }

    @RequestMapping("/illegalApprove/all")
    @ResponseBody
    public PageObject getIlleagelRecords(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                    @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        if(pageIndex == 0){
            pageIndex = 1;
        }
        return this.iIlleagelService.getIlleagelRecords(pageIndex,pageSize);
    }
}
