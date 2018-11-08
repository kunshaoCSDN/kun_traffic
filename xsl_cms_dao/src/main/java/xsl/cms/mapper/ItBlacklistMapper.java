package xsl.cms.mapper;

import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.ItBlacklist;
import xsl.cms.pojo.ItBlacklistExample;

import java.util.List;

public interface ItBlacklistMapper {
    int countByExample(ItBlacklistExample example);

    int deleteByExample(ItBlacklistExample example);

    int deleteByPrimaryKey(Integer blId);

    int insert(ItBlacklist record);

    int insertSelective(ItBlacklist record);

    List<ItBlacklist> selectByExample(ItBlacklistExample example);

    ItBlacklist selectByPrimaryKey(Integer blId);

    int updateByExampleSelective(@Param("record") ItBlacklist record, @Param("example") ItBlacklistExample example);

    int updateByExample(@Param("record") ItBlacklist record, @Param("example") ItBlacklistExample example);

    int updateByPrimaryKeySelective(ItBlacklist record);

    int updateByPrimaryKey(ItBlacklist record);
}