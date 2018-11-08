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
public class IllegalImgController {

    private final String pathName = "illegalTreatment";

    @Autowired
    private IIlleagelService iIlleagelService;

    /**
     * @author 王坤
     * @time 2018-10-08  下午 14:10
     * @function 进行违法图片的浏览
     * @return 访问illegal_Img.jsp页面的路径
     */
    @RequestMapping("/illegal/img")
    public String accessIllegalImg(){
        return pathName + "/illegal_Img";
    }

    @RequestMapping("/illegalImg/all")
    @ResponseBody
    public PageObject getIlleagelImages(@RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                    @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        if(pageIndex == 0){
            pageIndex = 1;
        }
        return this.iIlleagelService.getIlleagelImages(pageIndex,pageSize);
    }
}
