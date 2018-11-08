package xsl.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xsl.cms.commons.DateUtils;
import xsl.cms.mapper.ItDeviceMapper;
import xsl.cms.mapper.TrafficFlowMapper;
import xsl.cms.pojo.ItDevice;
import xsl.cms.pojo.ItDeviceExample;
import xsl.cms.pojo.TrafficFlew;
import xsl.cms.pojo.common.*;
import xsl.cms.service.ITFMonthService;
import xsl.cms.vo.TrafficFlewModel;
import xsl.cms.vo.YesrsNodeVo;

import java.text.SimpleDateFormat;
import java.util.*;

@Service("iTFMonthService")
@Transactional
public class TFMonthServiceImpl implements ITFMonthService {
    private Logger logger = LoggerFactory.getLogger(TFMonthServiceImpl.class);

    @Autowired
    private TrafficFlowMapper trafficFlowMapper;

    @Autowired
    private ItDeviceMapper itDeviceMapper;

    @Override
    public PageObject getTrafficList(Integer pageIndex, Integer pageSize, String toTime) {
        PageObject pageObject = new PageObject();
        try{
            PageHelper.startPage(pageIndex,pageSize);
            List<TrafficFlew> trafficList = trafficFlowMapper.getTrafficList(toTime);
            List<TrafficFlewModel> models = new ArrayList<>();
            for(TrafficFlew trafficFlew:trafficList){
                TrafficFlewModel model = null;
                if(trafficFlew != null){
                    model = TFMonthServiceImpl.convertVo(trafficFlew);
                    models.add(model);
                }
            }
            PageInfo<TrafficFlew> pageInfo = new PageInfo<>(trafficList);
            long totals = pageInfo.getTotal();
            pageObject.setTotal(totals);
            pageObject.setData(models);
        }catch (Exception e){
            logger.error(e.getMessage());
            pageObject = null;
        }
        return pageObject;
    }

    /**
     * @author 王坤
     * @time 2018-10-21  下午 13:58
     * @function 获取日车流量的信息
     * @return 访问页面的路径
     */
    @Override
    public PageObject getDayTrafficList(Integer pageIndex, Integer pageSize, String toDay) {
        PageObject pageObject = new PageObject();
        try{
            PageHelper.startPage(pageIndex,pageSize);
            List<TrafficFlew> dayTrafficList = trafficFlowMapper.getDayTrafficList(toDay);
            List<TrafficFlewModel> models = new ArrayList<>();
            for(TrafficFlew trafficFlew:dayTrafficList){
                TrafficFlewModel model = null;
                if(trafficFlew != null){
                    model = TFMonthServiceImpl.convertVo(trafficFlew);
                    models.add(model);
                }
            }
            PageInfo<TrafficFlew> pageInfo = new PageInfo<>(dayTrafficList);
            long total = pageInfo.getTotal();
            pageObject.setTotal(total);
            pageObject.setData(models);
        }catch (Exception e){
            logger.error(e.getMessage());
            pageObject = null;
        }
        return pageObject;
    }

    /**
     * @author 王坤
     * @time 2018-10-21  下午 14:10
     * @function 获取时车流量的信息
     * @return 访问页面的路径
     */
    @Override
    public PageObject getHourTrafficList(Integer pageIndex, Integer pageSize, String toHour) {
        PageObject pageObject = new PageObject();
        try{
            PageHelper.startPage(pageIndex,pageSize);
            List<TrafficFlew> dayTrafficList = trafficFlowMapper.getHourTrafficList(toHour);
            List<TrafficFlewModel> models = new ArrayList<>();
            for(TrafficFlew trafficFlew:dayTrafficList){
                TrafficFlewModel model = null;
                if(trafficFlew != null){
                    model = TFMonthServiceImpl.convertVo(trafficFlew);
                    models.add(model);
                }
            }
            PageInfo<TrafficFlew> pageInfo = new PageInfo<>(dayTrafficList);
            long total = pageInfo.getTotal();
            pageObject.setTotal(total);
            pageObject.setData(models);
        }catch (Exception e){
            logger.error(e.getMessage());
            pageObject = null;
        }
        return pageObject;
    }

    @Override
    public PageObject SelectMonth(Integer pageIndex, Integer pageSize) {
        return null;
    }

    /**
     * @author 王坤
     * @time 2018-10-21  下午 13:09
     * @function 获取所有的检测地点
     * @return 访问页面的路径
     */
    @Override
    public List<ComboboxObject> getDevicePlace(){
        ItDeviceExample example = new ItDeviceExample();
        List<ItDevice> itDevices = itDeviceMapper.selectByExample(example);
        List<ComboboxObject> coms = new ArrayList<>();
        for(ItDevice itDevice:itDevices){
            ComboboxObject com = new ComboboxObject();
            if(itDevice != null){
                com.setId(itDevice.getdId().toString());
                com.setText(itDevice.getdPlace());
            }
            coms.add(com);
        }
        return coms;
    }

    /**
     * @author 王坤
     * @time 2018-10-21  下午 15:56
     * @function 获取某个月内的某日的车流量信息
     * @return 访问页面的路径
     */
    @Override
    public MonitorObject getMonthMonitor(String toMonth) {
        MonitorObject monitorObject = new MonitorObject();
        try{
            List<KeyValueObject> monthMonitor = trafficFlowMapper.getMonthMonitor(toMonth);
            if(monthMonitor != null){
                /*获取月份,初始化List*/
                String xname = "";
                String monthName = "";
                int dayByMonth = 0;
                Date date = null;
                if("".equals(toMonth)){
                    SimpleDateFormat sdf = new SimpleDateFormat("MM");
                    date = new Date();
                    monthName = sdf.format(date);
                }else{
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    monthName = toMonth.substring(5,7);
                    date = sdf.parse(toMonth);
                }
                dayByMonth = DateUtils.getDaysOfMonth(date);
                xname = TFMonthServiceImpl.getMonthName(monthName);
                /* 进行map的初始化 */
                List<Integer> keys = new ArrayList<>(dayByMonth);
                List<Integer> values = new ArrayList<>(dayByMonth);
                for(int i = 0; i < dayByMonth ; i ++){
                    keys.add(i+1);
                    values.add(0);
                }
                for(KeyValueObject object:monthMonitor){
                    values.add(Integer.valueOf(TFMonthServiceImpl.getMonthName(object.getFiled().substring(8,10)))-1,Integer.valueOf(object.getMount()));
                }
                monitorObject.setXname(xname);
                monitorObject.setKeys(keys);
                monitorObject.setValues(values);
            }
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return monitorObject;
    }

    /**
     * @author 王坤
     * @time 2018-10-06  下午 15:35
     * @function vo与pojo之间的转换
     * @return vo
     */
    public static TrafficFlewModel convertVo(TrafficFlew trafficFlew){
        TrafficFlewModel model = new TrafficFlewModel();
        ItDevice itDevice = trafficFlew.getItDevice();
        if(itDevice != null){
            model.setdPlace(itDevice.getdPlace());
        }
        model.setDrCarsign(trafficFlew.getDrCarsignArea() + trafficFlew.getDrCarsignNum());
        model.setDrTime(trafficFlew.getDrTime());
        model.setDrIsillegal(trafficFlew.getDrIsillegal()?"是":"否");
        model.setDrActualSpeed(trafficFlew.getDrActualSpeed());
        model.setDrLimitSpeed(trafficFlew.getDrLimitSpeed());
        return model;
    }

    /**
     * @author 获取月份
     * @time 2018-10-06  下午 16:28
     * @function 字符串月份的转化
     * @return 月份
     */
    public static String getMonthName(String month){
        if("0".equals(month.substring(0,1))){
            month = month.substring(1);
        }
        return month;
    }

    /**
     * @author 王坤
     * @time 2018-10-27  下午 19:59
     * @function 获取某天的每一个小时内车流量信息
     * @return 访问页面的路径
     */
    @Override
    public MonitorObject getDayMonitor(String toDay) {
        MonitorObject monitorObject = new MonitorObject();
        try{
            List<KeyValueObject> monthMonitor = trafficFlowMapper.getDayMonitor(toDay);
            if(monthMonitor != null){
                /* 进行map的初始化 */
                List<Integer> keys = new ArrayList<>(24);
                List<Integer> values = new ArrayList<>(24);
                for(int i = 0; i < 24 ; i ++){
                    keys.add(i+1);
                    values.add(0);
                }
                for(KeyValueObject object:monthMonitor){
                    values.add(Integer.valueOf(TFMonthServiceImpl.getMonthName(object.getFiled()))-1,Integer.valueOf(object.getMount()));
                }
                if("".equals(toDay)){
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    toDay = sdf.format(new Date());
                }
                monitorObject.setXname(toDay);
                monitorObject.setKeys(keys);
                monitorObject.setValues(values);
            }
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return monitorObject;
    }

    public List<YesrsNodeVo> getYearDates(){
        List<YearNode> yearDates = this.trafficFlowMapper.getYearDates();
        List<YesrsNodeVo> yesrsNodeVoList = new ArrayList<>();
        for(YearNode yearNode : yearDates){
            YesrsNodeVo yesrsNodeVo = getVoByPojo(yearNode);
            yesrsNodeVoList.add(yesrsNodeVo);
        }
        return yesrsNodeVoList;
    }

    private YesrsNodeVo getVoByPojo(YearNode yearNode){
        YesrsNodeVo yesrsNodeVo = new YesrsNodeVo();
        String name = "";
        String color = "";
        if(yearNode.getCount() > 100){
            name = "重度";
            color = "red";
        }else{
            name = "轻度";
            color = "green";
        }
        yesrsNodeVo.setName(name);
        yesrsNodeVo.setEndDate(yearNode.getDate());
        yesrsNodeVo.setStartDate(yearNode.getDate());
        yesrsNodeVo.setColor(color);
        return yesrsNodeVo;
    }


}
