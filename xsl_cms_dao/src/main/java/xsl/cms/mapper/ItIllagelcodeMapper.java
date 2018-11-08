package xsl.cms.mapper;

import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.ItIllagelcode;
import xsl.cms.pojo.ItIllagelcodeExample;

import java.util.List;

public interface ItIllagelcodeMapper {
    int countByExample(ItIllagelcodeExample example);

    int deleteByExample(ItIllagelcodeExample example);

    int deleteByPrimaryKey(Integer icId);

    int insert(ItIllagelcode record);

    int insertSelective(ItIllagelcode record);

    List<ItIllagelcode> selectByExample(ItIllagelcodeExample example);

    ItIllagelcode selectByPrimaryKey(Integer icId);

    int updateByExampleSelective(@Param("record") ItIllagelcode record, @Param("example") ItIllagelcodeExample example);

    int updateByExample(@Param("record") ItIllagelcode record, @Param("example") ItIllagelcodeExample example);

    int updateByPrimaryKeySelective(ItIllagelcode record);

    int updateByPrimaryKey(ItIllagelcode record);
}