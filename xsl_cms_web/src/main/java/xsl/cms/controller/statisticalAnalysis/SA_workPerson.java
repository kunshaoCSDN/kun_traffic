package xsl.cms.controller.statisticalAnalysis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/statisticalAnalysis")
public class SA_workPerson {

    private final String pathName = "statisticalAnalysis";

    /**
     * @author 王坤
     * @time 2018-10-08  下午 14:03
     * @function 统计工作人员的操作
     * @return 访问work_person.jsp页面的路径
     */
    @RequestMapping("/work/person")
    public String accessWorkPerson(){
        return pathName + "/work_person";
    }

}
