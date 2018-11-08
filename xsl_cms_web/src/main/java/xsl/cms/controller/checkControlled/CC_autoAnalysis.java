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
public class CC_autoAnalysis {
    private final String pathName = "checkControlled";

    @Autowired
    private IBlackListTypeService iBlackListTypeService;

    /**
     * @author 王坤
     * @time 2018-10-06  下午 17:29
     * @function 进行自动对比可以车辆的信息存储
     * @return 访问页面的路径
     */
    @RequestMapping("/auto/analysis")
    public String accessBlackList(){
        return pathName + "/autoAnalysis";
    }

    @RequestMapping("/all/auto")
    @ResponseBody
    public PageObject getAutoAnalysis(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                      @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        if(pageIndex == 0){
            pageIndex = 1;
        }
        return this.iBlackListTypeService.getAutoAnalysis(pageIndex,pageSize);
    }
}
