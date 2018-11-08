package xsl.cms.service;

import xsl.cms.pojo.common.PageObject;

public interface IBlackListTypeService {
    PageObject getAllBlackListType(Integer pageIndex, Integer pageSize);
    PageObject getAllBlackList(Integer pageIndex,Integer pageSize);
    PageObject getRecords(Integer pageIndex, Integer pageSize);
    PageObject getRecordAlarms(Integer pageIndex, Integer pageSize);
    PageObject getAutoAnalysis(Integer pageIndex,Integer pageSize);
}
