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
public class IllegalCodeController {

    private final String pathName = "illegalTreatment";

    @Autowired
    private IIlleagelService iIlleagelService;

    /**
     * @author 王坤
     * @time 2018-10-08  下午 14:13
     * @function 进行违法字典编码的操作
     * @return 访问illegalCode.jsp页面的路径
     */
    @RequestMapping("/illegal/code")
    public String accessIllegalImg(){
        return pathName + "/illegalCode";
    }

    @RequestMapping("/illegalList/all")
    @ResponseBody
    public PageObject getIllegalCode(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                      @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        if(pageIndex == 0){
            pageIndex = 1;
        }
        return this.iIlleagelService.getIllegelCodes(pageIndex,pageSize);
    }
}
