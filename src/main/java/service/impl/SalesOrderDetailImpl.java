package service.impl;

import mapper.SalesOrderDetailMapper;
import model.SalesOrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SalesOrderDetailService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SalesOrderDetailImpl  implements  SalesOrderDetailService{

	@Autowired
	private SalesOrderDetailMapper salesOrderDetailMapper;

	/*
		*   @Description: 查询所有的销售信息
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param:无
		*   @Return: 销售详情视图集合
		*
		* */
	public List<SalesOrderDetail> getSalesOrderDetailByDefault() {
		return salesOrderDetailMapper.getSalesOrderDetailByDefault();
	}

	/*
		*   @Description: 根据参数查询详细销售信息
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 类别，开始时间，结束时间
		*   @Return: 销售详情视图集合
		*
		* */
	public List<SalesOrderDetail> getSalesOrderDetailByParams(String category, String startTime, String endTime) {
		Map map=new HashMap();
		map.put("category",category);
		map.put("startTime",startTime);
		map.put("endTime",endTime);


		return salesOrderDetailMapper.getSalesOrderDetailByParams(map);
	}
}
