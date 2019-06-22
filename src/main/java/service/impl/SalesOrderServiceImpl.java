package service.impl;

import mapper.SalesOrderMapper;
import model.SalesOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SalesOrderService;

@Service
public class SalesOrderServiceImpl  implements SalesOrderService{

	@Autowired
	private SalesOrderMapper salesOrderMapper;


	/*
		*   @Description: 添加销售信息
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 销售实体
		*   @Return: 1：成功  0：失败
		*
		* */
	public int addSalesOrder(SalesOrder so) {
		return salesOrderMapper.addSalesOrder(so);
	}
}
