package mapper;

import model.SalesOrder;

public interface SalesOrderMapper {

    /**
    * @Description: 添加销售信息
    * @Param:  销售实体
    * @return:  受影响的行数
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public int addSalesOrder(SalesOrder so);
}
