package service;

import model.SalesOrderDetail;

import java.util.List;

public interface SalesOrderDetailService {



	/**
	 * @Description: 查询所有的销售信息
	 * @Param: 无
	 * @return:  销售详情视图
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */

	public List<SalesOrderDetail> getSalesOrderDetailByDefault();

	/**
	 * @Description: 根据参数查询详细销售信息
	 * @Param:  类别，开始时间，结束时间
	 * @return:
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public List<SalesOrderDetail> getSalesOrderDetailByParams(String category,String startTime,String endTime);
}
