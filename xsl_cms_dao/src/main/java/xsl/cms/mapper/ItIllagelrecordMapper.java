package xsl.cms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.ItIllagelrecord;
import xsl.cms.pojo.ItIllagelrecordExample;

public interface ItIllagelrecordMapper {
    int countByExample(ItIllagelrecordExample example);

    int deleteByExample(ItIllagelrecordExample example);

    int deleteByPrimaryKey(Integer irId);

    int insert(ItIllagelrecord record);

    int insertSelective(ItIllagelrecord record);

    List<ItIllagelrecord> selectByExample(ItIllagelrecordExample example);

    ItIllagelrecord selectByPrimaryKey(Integer irId);

    int updateByExampleSelective(@Param("record") ItIllagelrecord record, @Param("example") ItIllagelrecordExample example);

    int updateByExample(@Param("record") ItIllagelrecord record, @Param("example") ItIllagelrecordExample example);

    int updateByPrimaryKeySelective(ItIllagelrecord record);

    int updateByPrimaryKey(ItIllagelrecord record);
}