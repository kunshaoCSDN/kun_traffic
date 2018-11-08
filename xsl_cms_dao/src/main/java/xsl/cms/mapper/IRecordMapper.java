package xsl.cms.mapper;

import xsl.cms.pojo.TrafficFlew;

import java.util.List;

public interface IRecordMapper {
    List<TrafficFlew> getRecords();
    List<TrafficFlew> getRecordAlarms();
    List<TrafficFlew> getAutoAnalysis();
}
