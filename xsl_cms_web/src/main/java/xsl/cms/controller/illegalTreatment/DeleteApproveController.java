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
public class DeleteApproveController {

    private final String pathName = "illegalTreatment";

    @Autowired
    private IIlleagelService iIlleagelService;

    /**
     * @author 王坤
     * @time 2018-10-08  下午 14:17
     * @function 进行删除之后的图片再次进行审核
     * @return 访问delete_approve.jsp页面的路径
     */
    @RequestMapping("/delete/approve")
    public String accessIllegalImg(){
        return pathName + "/delete_approve";
    }

    @RequestMapping("/deleteIllegal/all")
    @ResponseBody
    public PageObject getDeleteIlleagelRecords(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                                @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        if(pageIndex == 0){
            pageIndex = 1;
        }
        return this.iIlleagelService.getDeleteIlleagelRecords(pageIndex,pageSize);
    }
}
