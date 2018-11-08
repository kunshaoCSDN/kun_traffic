package xsl.cms.controller.userLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xsl.cms.commons.CodeUtils;
import xsl.cms.commons.ResponseCode;
import xsl.cms.commons.XslResult;
import xsl.cms.service.ILoginService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private ILoginService iLoginService;

    @RequestMapping("/login")
    @ResponseBody
    public XslResult login(String username, String password, HttpSession session){
        XslResult login = this.iLoginService.login(username, password);
        if(login.isOK()){
            session.setAttribute(CodeUtils.CURRENT_USER,login.getData());
        }
        return login;
    }

    @RequestMapping("/loginout")
    @ResponseBody
    public XslResult loginOut(HttpSession session){
        if(session != null){
            session.removeAttribute(CodeUtils.CURRENT_USER);
            return XslResult.ok();
        }
        return XslResult.build(ResponseCode.ERROR,"退出失败");
    }
}
