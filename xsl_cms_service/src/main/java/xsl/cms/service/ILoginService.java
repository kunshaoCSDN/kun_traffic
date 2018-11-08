package xsl.cms.service;

import xsl.cms.commons.XslResult;

public interface ILoginService {
    XslResult login(String username,String password);
}
