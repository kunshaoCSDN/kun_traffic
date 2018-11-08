package xsl.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xsl.cms.mapper.IRecordMapper;
import xsl.cms.mapper.ItBlacklistMapper;
import xsl.cms.mapper.ItBlacklistTypeMapper;
import xsl.cms.pojo.*;
import xsl.cms.pojo.common.PageObject;
import xsl.cms.service.IBlackListTypeService;
import xsl.cms.vo.TrafficFlewModel;
import java.util.ArrayList;
import java.util.List;

@Service("iBlackListTypeService")
@Transactional
public class BlackListTypeServiceImpl implements IBlackListTypeService {

    @Autowired
    private ItBlacklistTypeMapper itBlacklistTypeMapper;

    @Autowired
    private ItBlacklistMapper itBlacklistMapper;

    @Autowired
    private IRecordMapper iRecordMapper;

    /**
     * 得到黑名单类型
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public PageObject getAllBlackListType(Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        ItBlacklistTypeExample example = new ItBlacklistTypeExample();
        List<ItBlacklistType> itBlacklistTypes = this.itBlacklistTypeMapper.selectByExample(example);
        PageInfo<ItBlacklistType> pageInfo = new PageInfo<>(itBlacklistTypes);
        PageObject pageObject = new PageObject();
        pageObject.setData(itBlacklistTypes);
        pageObject.setTotal((int)pageInfo.getTotal());
        return pageObject;
    }

    public PageObject getAllBlackList(Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        ItBlacklistExample example = new ItBlacklistExample();
        List<ItBlacklist> itBlacklists = this.itBlacklistMapper.selectByExample(example);
        PageInfo<ItBlacklist> pageInfo = new PageInfo<>(itBlacklists);
        PageObject pageObject = new PageObject();
        pageObject.setData(itBlacklists);
        pageObject.setTotal((int)pageInfo.getTotal());
        return pageObject;
    }

    //获取所有的过往车辆信息
    public PageObject getRecords(Integer pageIndex, Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<TrafficFlew> records = this.iRecordMapper.getRecords();
        List<TrafficFlewModel> models = new ArrayList<>();
        for(TrafficFlew trafficFlew : records){
            TrafficFlewModel model = getVoByPojo(trafficFlew);
            models.add(model);
        }
        PageInfo<TrafficFlew> info = new PageInfo<>(records);
        long total = info.getTotal();
        PageObject pageObject = new PageObject();
        pageObject.setTotal((int) total);
        pageObject.setData(models);
        return pageObject;
    }

    public PageObject getRecordAlarms(Integer pageIndex, Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<TrafficFlew> records = this.iRecordMapper.getRecordAlarms();
        List<TrafficFlewModel> models = new ArrayList<>();
        for(TrafficFlew trafficFlew : records){
            TrafficFlewModel model = getVoByPojo(trafficFlew);
            models.add(model);
        }
        PageInfo<TrafficFlew> info = new PageInfo<>(records);
        long total = info.getTotal();
        PageObject pageObject = new PageObject();
        pageObject.setTotal((int) total);
        pageObject.setData(models);
        return pageObject;
    }

    //自动分析
    public PageObject getAutoAnalysis(Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<TrafficFlew> autoAnalysis = this.iRecordMapper.getAutoAnalysis();
        List<TrafficFlewModel> models = new ArrayList<>();
        for(TrafficFlew trafficFlew : autoAnalysis){
            TrafficFlewModel model = getVoByPojo(trafficFlew);
            models.add(model);
        }
        PageInfo<TrafficFlew> info = new PageInfo<>(autoAnalysis);
        long total = info.getTotal();
        PageObject pageObject = new PageObject();
        pageObject.setTotal((int) total);
        pageObject.setData(models);
        return pageObject;
    }

    /**
     * 交通流量的pojo向着vo转换
     * @param trafficFlew
     * @return
     */
    private TrafficFlewModel getVoByPojo(TrafficFlew trafficFlew){
        TrafficFlewModel model = new TrafficFlewModel();
        ItDevice itDevice = trafficFlew.getItDevice();
        if(itDevice != null){
            model.setdPlace(itDevice.getdPlace());
        }
        model.setDrCarsign(trafficFlew.getDrCarsignArea()+trafficFlew.getDrCarsignNum());
        model.setDrTime(trafficFlew.getDrTime());
        model.setDrLimitSpeed(trafficFlew.getDrLimitSpeed());
        model.setDrActualSpeed(trafficFlew.getDrActualSpeed());
        model.setDrImageurl(trafficFlew.getDrImageurl());
        ItBlacklist itBlacklist = trafficFlew.getItBlacklist();
        if(itBlacklist == null || itBlacklist.getBlId() < 1){
            model.setDrIsAlarm("否");
        }else{
            model.setDrIsAlarm("是");
            model.setBlName(itBlacklist.getBlName());
            Boolean blState = itBlacklist.getBlState();
            if(blState){
                model.setDrDelete("未逮捕");
            }else {
                model.setDrDelete("已逮捕");
            }
        }
        return model;
    }
}