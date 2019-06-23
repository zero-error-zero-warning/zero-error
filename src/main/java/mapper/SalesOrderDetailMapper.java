package mapper;

import model.SalesOrderDetail;

import java.util.List;
import java.util.Map;

/**
 * @author 陈泯全
 * @title: SalesOrderDetailMapper
 * @projectName Zero_Error
 * @description: TODO
 * @date 2019/6/221:48
 */
public interface SalesOrderDetailMapper {
    
    /** 
    * @Description: 查询所有的销售信息
    * @Param:  
    * @return:  销售详情实体
    * @Author: 陈泯全
    * @Date: 2019/6/22 
    */ 
    public List<SalesOrderDetail> getSalesOrderDetailByDefault();

    /** 
    * @Description: 根据流水单号查询销售信息
    * @Param:  
    * @return:  
    * @Author: 陈泯全
    * @Date: 2019/6/24 
    */ 
    public List<SalesOrderDetail> getSalesOrderDetailByWaterNumId(String id);

    /**
    * @Description: 根据参数查询详细销售信息
    * @Param:  类别category，开始时间startTime，结束时间endTime ，这里还有问题，需要讨论时间的格式
    * @return: 销售详情实体
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public List<SalesOrderDetail> getSalesOrderDetailByParams(Map map);
}
