package xsl.cms.service;

import xsl.cms.pojo.PersonWorkplace;
import xsl.cms.pojo.common.MonitorObject;
import xsl.cms.pojo.common.PageObject;

import java.util.List;

//Controller日志的查询
public interface IXslControllerLogService {
    PageObject SelectControllerLogAll(Integer page, Integer rows);
    List<PersonWorkplace> getPersonWorkplaces();
    MonitorObject getPersonWorkplaceMonitor();
}
