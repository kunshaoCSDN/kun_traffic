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
public class CC_BlackListType {
    private final String pathName = "checkControlled";

    @Autowired
    private IBlackListTypeService iBlackListType;

    /**
     * @author 王坤
     * @time 2018-10-06  下午 17:13
     * @function 进行黑名单类别的编辑
     * @return 访问页面的路径
     */
    @RequestMapping("/black/listType")
    public String accessBlackList(){
        return pathName + "/blackListType";
    }

    @RequestMapping("/blackList/type")
    @ResponseBody
    public PageObject getAllBlackListType(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        if(pageIndex == 0){
            pageIndex = 1;
        }
        return this.iBlackListType.getAllBlackListType(pageIndex,pageSize);
    }
}
