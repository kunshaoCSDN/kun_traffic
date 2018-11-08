package xsl.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xsl.cms.mapper.ItDrivingrecordsMapper;
import xsl.cms.mapper.ItIllagelcodeMapper;
import xsl.cms.mapper.ItWhitelistMapper;
import xsl.cms.pojo.*;
import xsl.cms.pojo.common.PageObject;
import xsl.cms.service.IIlleagelService;
import xsl.cms.vo.IlleagelRecordVo;

import java.util.ArrayList;
import java.util.List;

/**
 * 违法代码中的Service实现
 */
@Service("iIlleagelService")
@Transactional
public class IlleagelServiceImpl implements IIlleagelService {
    @Autowired
    private ItWhitelistMapper itWhitelistMapper;

    @Autowired
    private ItIllagelcodeMapper itIllagelcodeMapper;

    @Autowired
    private ItDrivingrecordsMapper itDrivingrecordsMapper;

    //白名单的所有的显示
    public PageObject getWhiteList(Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        ItWhitelistExample example = new ItWhitelistExample();
        List<ItWhitelist> itWhitelists = this.itWhitelistMapper.selectByExample(example);
        PageInfo<ItWhitelist> info = new PageInfo<>(itWhitelists);
        long total = info.getTotal();
        PageObject object = new PageObject();
        object.setData(itWhitelists);
        object.setTotal((int) total);
        return object;
    }

    //获取所有的违法字典的信息
    public PageObject getIllegelCodes(Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        ItIllagelcodeExample example = new ItIllagelcodeExample();
        List<ItIllagelcode> itIllagelcodes = this.itIllagelcodeMapper.selectByExample(example);
        PageInfo<ItIllagelcode> info = new PageInfo<>(itIllagelcodes);
        long total = info.getTotal();
        PageObject object = new PageObject();
        object.setTotal((int)total);
        object.setData(itIllagelcodes);
        return object;
    }

    //非法图片的查询（普通审核和删除审核都已经通过）
    public PageObject getIlleagelImages(Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<IlleagelRecord> illeagelImages = this.itDrivingrecordsMapper.getIlleagelImages();
        List<IlleagelRecordVo> vos = new ArrayList<>();
        for(IlleagelRecord illeagelRecord : illeagelImages){
            IlleagelRecordVo vo = getIlleagelVoByPojo(illeagelRecord);
            vos.add(vo);
        }
        PageInfo<IlleagelRecord> illeagelRecordPageInfo = new PageInfo<>(illeagelImages);
        long total = illeagelRecordPageInfo.getTotal();
        PageObject object = new PageObject();
        object.setTotal((int) total);
        object.setData(vos);
        return object;
    }

    //违法的记录查询（只是普通的审核阶段）
    public PageObject getIlleagelRecords(Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<IlleagelRecord> illeagelImages = this.itDrivingrecordsMapper.getIlleagelRecords();
        List<IlleagelRecordVo> vos = new ArrayList<>();
        for(IlleagelRecord illeagelRecord : illeagelImages){
            IlleagelRecordVo vo = getIlleagelVoByPojo(illeagelRecord);
            vos.add(vo);
        }
        PageInfo<IlleagelRecord> illeagelRecordPageInfo = new PageInfo<>(illeagelImages);
        long total = illeagelRecordPageInfo.getTotal();
        PageObject object = new PageObject();
        object.setTotal((int) total);
        object.setData(vos);
        return object;
    }

    //删除违法的审核没有通过的记录，进行最后一次审核，如果没过，就设置为不违法
    public PageObject getDeleteIlleagelRecords(Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<IlleagelRecord> illeagelImages = this.itDrivingrecordsMapper.getDeleteIlleagelRecords();
        List<IlleagelRecordVo> vos = new ArrayList<>();
        for(IlleagelRecord illeagelRecord : illeagelImages){
            IlleagelRecordVo vo = getIlleagelVoByPojo(illeagelRecord);
            vos.add(vo);
        }
        PageInfo<IlleagelRecord> illeagelRecordPageInfo = new PageInfo<>(illeagelImages);
        long total = illeagelRecordPageInfo.getTotal();
        PageObject object = new PageObject();
        object.setTotal((int) total);
        object.setData(vos);
        return object;
    }

    //获取所有违法的车辆的信息
    public PageObject getAllIlleagelRecords(Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<IlleagelRecord> illeagelImages = this.itDrivingrecordsMapper.getAllIlleagelRecords();
        List<IlleagelRecordVo> vos = new ArrayList<>();
        for(IlleagelRecord illeagelRecord : illeagelImages){
            IlleagelRecordVo vo = getIlleagelVoByPojo(illeagelRecord);
            vos.add(vo);
        }
        PageInfo<IlleagelRecord> illeagelRecordPageInfo = new PageInfo<>(illeagelImages);
        long total = illeagelRecordPageInfo.getTotal();
        PageObject object = new PageObject();
        object.setTotal((int) total);
        object.setData(vos);
        return object;
    }

    //违法显示vo
    private IlleagelRecordVo getIlleagelVoByPojo(IlleagelRecord illeagelRecord){
        IlleagelRecordVo vo = new IlleagelRecordVo();
        vo.setDrCarsign(illeagelRecord.getDrCarsignArea()+illeagelRecord.getDrCarsignNum());
        vo.setDrId(illeagelRecord.getDrId());
        vo.setDrTime(illeagelRecord.getDrTime());
        vo.setDrWay(illeagelRecord.getDrWay());
        vo.setDrActualSpeed(illeagelRecord.getDrActualSpeed());
        vo.setDrLimitSpeed(illeagelRecord.getDrLimitSpeed());
        ItIllagelcode itIllagelcode = illeagelRecord.getItIllagelcode();
        if(itIllagelcode != null){
            vo.setIcScore(itIllagelcode.getIcScore());
            vo.setIcFine(itIllagelcode.getIcFine());
        }
        ItIllagelrecord itIllagelrecord = illeagelRecord.getItIllagelrecord();
        if(itIllagelrecord != null){
            vo.setIrImg(itIllagelrecord.getIrImg());
            vo.setIrRemark(itIllagelrecord.getIrRemark());
        }
        ItDevice itDevice = illeagelRecord.getItDevice();
        if(itDevice != null){
            vo.setdPlace(itDevice.getdPlace());
        }
        return vo;
    }
}
