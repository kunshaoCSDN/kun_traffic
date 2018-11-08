package xsl.cms.mapper;

import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.PersonWorkplace;
import xsl.cms.pojo.XslLog;
import xsl.cms.pojo.XslLogExample;

import java.util.List;

public interface XslLogMapper {
    int countByExample(XslLogExample example);

    int deleteByExample(XslLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XslLog record);

    int insertSelective(XslLog record);

    List<XslLog> selectByExample(XslLogExample example);

    XslLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XslLog record, @Param("example") XslLogExample example);

    int updateByExample(@Param("record") XslLog record, @Param("example") XslLogExample example);

    int updateByPrimaryKeySelective(XslLog record);

    int updateByPrimaryKey(XslLog record);

    List<PersonWorkplace> getPersonWorkplaces();
}