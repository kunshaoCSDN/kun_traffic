package xsl.cms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.ItDevice;
import xsl.cms.pojo.ItDeviceExample;

public interface ItDeviceMapper {
    int countByExample(ItDeviceExample example);

    int deleteByExample(ItDeviceExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(ItDevice record);

    int insertSelective(ItDevice record);

    List<ItDevice> selectByExample(ItDeviceExample example);

    ItDevice selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") ItDevice record, @Param("example") ItDeviceExample example);

    int updateByExample(@Param("record") ItDevice record, @Param("example") ItDeviceExample example);

    int updateByPrimaryKeySelective(ItDevice record);

    int updateByPrimaryKey(ItDevice record);
}