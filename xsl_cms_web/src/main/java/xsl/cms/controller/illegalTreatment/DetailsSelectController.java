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
public class DetailsSelectController {

    private final String pathName = "illegalTreatment";

    @Autowired
    private IIlleagelService iIlleagelService;

    /**
     * @author 王坤
     * @time 2018-10-08  下午 14:17
     * @function 进行违法信息的细节查询
     * @return 访问details_select.jsp页面的路径
     */
    @RequestMapping("/details/select")
    public String accessIllegalImg(){
        return pathName + "/details_select";
    }

    @RequestMapping("/details/all")
    @ResponseBody
    public PageObject getIlleagelRecords(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                         @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        if(pageIndex == 0){
            pageIndex = 1;
        }
        return this.iIlleagelService.getAllIlleagelRecords(pageIndex,pageSize);
    }
}
