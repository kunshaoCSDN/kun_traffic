package xsl.cms.service;

import xsl.cms.pojo.common.PageObject;

public interface IIlleagelService {
    PageObject getWhiteList(Integer pageIndex, Integer pageSize);
    PageObject getIllegelCodes(Integer pageIndex,Integer pageSize);
    PageObject getIlleagelImages(Integer pageIndex,Integer pageSize);
    PageObject getIlleagelRecords(Integer pageIndex,Integer pageSize);
    PageObject getDeleteIlleagelRecords(Integer pageIndex,Integer pageSize);
    PageObject getAllIlleagelRecords(Integer pageIndex,Integer pageSize);
}
