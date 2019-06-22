package mapper;

import model.SalesOrderDetail;

import java.util.List;

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
    * @return:  销售详情视图
    * @Author: 陈泯全
    * @Date: 2019/6/22 
    */ 
    public List<SalesOrderDetail> getSalesOrderDetailByDefault();

    /**
    * @Description: 根据参数查询详细销售信息
    * @Param:  类别，开始时间，结束时间
    * @return:
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public List<SalesOrderDetail> getSalesOrderDetailByParams(String category,String startTime,String endTime);
}
