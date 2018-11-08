package xsl.cms.controller.viewMonitor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/viewMonitor")
public class videoMonitor {
    private final String pathName = "videoMonitor";

    /**
     * @author 王坤
     * @time 2018-10-13  下午 21:35
     * @function 进行视频的监控
     * @return 访问页面的路径
     */
    @RequestMapping("/video/monitor")
    public String accessVideoMonitor(){
        return  pathName + "/videoMonitor";
    }
}
