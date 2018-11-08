package xsl.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xsl.cms.commons.ResponseCode;
import xsl.cms.commons.XslResult;
import xsl.cms.mapper.IUserMapper;
import xsl.cms.pojo.User;
import xsl.cms.service.ILoginService;

@Service("iLoginService")
@Transactional
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private IUserMapper iUserMapper;

    /**
     * 验证账户密码
     * @param username
     * @param password
     * @return
     */
    @Override
    public XslResult login(String username, String password) {
        if(username == null || "".equals(username)){
            return XslResult.build(ResponseCode.ERROR,"账户为空");
        }
        int count = this.iUserMapper.isUsername(username);
        if(count < 1){
            return XslResult.build(ResponseCode.ERROR,"账户不在");
        }
        count = this.iUserMapper.isUser(username,password);
        if(count > 0){
            User user = new User();
            user.setPassword(password);
            user.setUsername(username);
            return XslResult.build(ResponseCode.SUCCESS,"",user);
        }
        return XslResult.build(ResponseCode.ERROR,"密码错误");
    }
}
