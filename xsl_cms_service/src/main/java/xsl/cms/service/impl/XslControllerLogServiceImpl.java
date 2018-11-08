package xsl.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xsl.cms.annotation.SystemServiceLog;
import xsl.cms.mapper.XslLogMapper;
import xsl.cms.pojo.PersonWorkplace;
import xsl.cms.pojo.XslLog;
import xsl.cms.pojo.XslLogExample;
import xsl.cms.pojo.common.MonitorObject;
import xsl.cms.pojo.common.PageObject;
import xsl.cms.service.IXslControllerLogService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *  IXslControllerLogService 页面的服务层
 *  @author 王坤
 */
@Service("iXslControllerLogService")
@Transactional
public class XslControllerLogServiceImpl implements IXslControllerLogService {
    /* 控制日志日志 */
    Logger logger = LoggerFactory.getLogger(XslControllerLogServiceImpl.class);

    @Resource
    protected XslLogMapper xslLogMapper;

    /**
     * 页面数据的查询
     * @param page 分页查询页数
     * @param rows 分页查询行数
     * @return 返回一个数据的列表包含data和total
     */
    @SystemServiceLog(description = "Controller日志分页查询Service")
    @Override
    public PageObject SelectControllerLogAll(Integer page, Integer rows ) {
        String  tag = "Controller日志分页查询";
        PageObject object = new PageObject();
        try{
            XslLogExample example = new XslLogExample();
            PageHelper.startPage(page,rows);//进行分页
            List<XslLog> list = this.xslLogMapper.selectByExample(example);
            object.setData(list);
            PageInfo<XslLog> info = new PageInfo<XslLog>(list);//得到分页的信息
            //得到分页的总数量
            object.setTotal(info.getTotal());
        }catch (Exception e){
            logger.error(tag + "异常警报 :" + e.getMessage());
        }finally {
            return object;
        }
    }

    //获取人员工作量
    public List<PersonWorkplace> getPersonWorkplaces(){
        List<PersonWorkplace> personWorkplaces = this.xslLogMapper.getPersonWorkplaces();
        if(personWorkplaces != null){
            //1个的情况
            if(personWorkplaces.size() == 1){
                PersonWorkplace personWorkplace = personWorkplaces.get(0);
                PersonWorkplace sumWorkplace = new PersonWorkplace();
                sumWorkplace.setAdmin("合计");
                sumWorkplace.setOperationCount(personWorkplace.getOperationCount());
                sumWorkplace.setDeleteCount(personWorkplace.getDeleteCount());
                personWorkplaces.add(sumWorkplace);
            }else{//两个的情况
                PersonWorkplace personWorkplace1 = personWorkplaces.get(0);
                PersonWorkplace personWorkplace2 = personWorkplaces.get(1);
                PersonWorkplace sumWorkplace = new PersonWorkplace();
                sumWorkplace.setAdmin("合计");
                sumWorkplace.setOperationCount(personWorkplace1.getOperationCount()+personWorkplace2.getOperationCount());
                sumWorkplace.setDeleteCount(personWorkplace1.getDeleteCount()+personWorkplace2.getDeleteCount());
                personWorkplaces.add(sumWorkplace);
            }
        }
        return personWorkplaces;
    }

    //获取人员工作量，线型图操作
    public MonitorObject getPersonWorkplaceMonitor(){
        // 操作总数     第一个是管理员，第二个是非管理员
        // 删除总数     第一个是管理员，第二个是非管理员
        List<PersonWorkplace> personWorkplaces = this.xslLogMapper.getPersonWorkplaces();
        MonitorObject object = new MonitorObject();
        if(personWorkplaces != null){
            List<Integer> keys = new ArrayList<>();
            List<Integer> values = new ArrayList<>();
            for(PersonWorkplace personWorkplace : personWorkplaces){
                keys.add(personWorkplace.getOperationCount());
                values.add(personWorkplace.getDeleteCount());
            }
            object.setKeys(keys);
            object.setValues(values);
        }
        return object;
    }
}
