package xsl.cms.mapper;

import org.apache.ibatis.annotations.Param;
import xsl.cms.pojo.TrafficFlew;
import xsl.cms.pojo.common.KeyValueObject;
import xsl.cms.pojo.common.YearNode;

import java.util.List;

/**
 * 对交通流量模块的Dao
 */
public interface TrafficFlowMapper {
    List<TrafficFlew> getTrafficList( @Param("toTime") String toTime);
    List<TrafficFlew> getDayTrafficList( @Param("toDay") String toDay);
    List<TrafficFlew> getHourTrafficList( @Param("toHour") String toHour);
    List<KeyValueObject> getMonthMonitor(@Param("toMonth") String toMonth);
    List<KeyValueObject> getDayMonitor(@Param("toDay") String toDay);
    List<YearNode> getYearDates();
}
