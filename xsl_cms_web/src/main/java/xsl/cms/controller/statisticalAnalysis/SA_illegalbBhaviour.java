package xsl.cms.controller.statisticalAnalysis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/statisticalAnalysis")
public class SA_illegalbBhaviour {

    private final String pathName = "statisticalAnalysis";

    /**
     * @author 王坤
     * @time 2018-10-08  下午 17:10
     * @function 对某个时间段中的违法行为的比例图
     * @return 访问illegal_behaviour.jsp页面的路径
     */
    @RequestMapping("/illegal/behaviour")
    public String accessWorkPerson(){
        return pathName + "/illegal_behaviour";
    }

}
