package xsl.cms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.ItWhitelist;
import xsl.cms.pojo.ItWhitelistExample;

public interface ItWhitelistMapper {
    int countByExample(ItWhitelistExample example);

    int deleteByExample(ItWhitelistExample example);

    int deleteByPrimaryKey(Integer wlId);

    int insert(ItWhitelist record);

    int insertSelective(ItWhitelist record);

    List<ItWhitelist> selectByExample(ItWhitelistExample example);

    ItWhitelist selectByPrimaryKey(Integer wlId);

    int updateByExampleSelective(@Param("record") ItWhitelist record, @Param("example") ItWhitelistExample example);

    int updateByExample(@Param("record") ItWhitelist record, @Param("example") ItWhitelistExample example);

    int updateByPrimaryKeySelective(ItWhitelist record);

    int updateByPrimaryKey(ItWhitelist record);
}