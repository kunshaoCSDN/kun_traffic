package xsl.cms.mapper;

import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.ItBlacklistType;
import xsl.cms.pojo.ItBlacklistTypeExample;

import java.util.List;

public interface ItBlacklistTypeMapper {
    int countByExample(ItBlacklistTypeExample example);

    int deleteByExample(ItBlacklistTypeExample example);

    int deleteByPrimaryKey(Integer btId);

    int insert(ItBlacklistType record);

    int insertSelective(ItBlacklistType record);

    List<ItBlacklistType> selectByExample(ItBlacklistTypeExample example);

    ItBlacklistType selectByPrimaryKey(Integer btId);

    int updateByExampleSelective(@Param("record") ItBlacklistType record, @Param("example") ItBlacklistTypeExample example);

    int updateByExample(@Param("record") ItBlacklistType record, @Param("example") ItBlacklistTypeExample example);

    int updateByPrimaryKeySelective(ItBlacklistType record);

    int updateByPrimaryKey(ItBlacklistType record);
}