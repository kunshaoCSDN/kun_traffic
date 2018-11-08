package xsl.cms.mapper;

import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.IlleagelRecord;
import xsl.cms.pojo.ItDrivingrecords;
import xsl.cms.pojo.ItDrivingrecordsExample;

import java.util.List;

public interface ItDrivingrecordsMapper {
    int countByExample(ItDrivingrecordsExample example);

    int deleteByExample(ItDrivingrecordsExample example);

    int deleteByPrimaryKey(Integer drId);

    int insert(ItDrivingrecords record);

    int insertSelective(ItDrivingrecords record);

    List<ItDrivingrecords> selectByExample(ItDrivingrecordsExample example);

    ItDrivingrecords selectByPrimaryKey(Integer drId);

    int updateByExampleSelective(@Param("record") ItDrivingrecords record, @Param("example") ItDrivingrecordsExample example);

    int updateByExample(@Param("record") ItDrivingrecords record, @Param("example") ItDrivingrecordsExample example);

    int updateByPrimaryKeySelective(ItDrivingrecords record);

    int updateByPrimaryKey(ItDrivingrecords record);

    List<IlleagelRecord> getIlleagelImages();

    List<IlleagelRecord> getIlleagelRecords();

    List<IlleagelRecord> getDeleteIlleagelRecords();

    List<IlleagelRecord> getAllIlleagelRecords();
}