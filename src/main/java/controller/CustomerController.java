package controller;



import model.SalesOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.SalesOrderService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import java.util.Map;

@CrossOrigin(value="*",maxAge=3600)
@Controller
@RequestMapping(value="customer")
public class CustomerController {


	@Autowired
	private SalesOrderService salesOrderServiceImpl;


	/*
	*    吃完饭结账
	*
	* */
	@RequestMapping(value = "checkOut")
	@ResponseBody
	public Map<String,Object>  checkOut (@RequestBody Map<String,Map<String,String>> map){
		Map<String,Object> map1=new HashMap<String, Object>();
		//获取账单信息  添加入数据库
		int salesOrderId= Integer.parseInt(map.get("checkOutData").get("salesOrderId"));
		int  vipId1=Integer.parseInt(map.get("checkOutData").get("vipId"));
		int  waterNumId=Integer.parseInt(map.get("checkOutData").get("waterNumId"));
		float sumPrice=Float.parseFloat(map.get("checkOutData").get("sumPrice"));

		System.out.println(sumPrice);
		float discountSumPrice=Float.parseFloat(map.get("checkOutData").get("discountSumPrice"));
		Date date=new Date();
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
		String saleDate=f.format(date);          //获取当前的销售时间
		SalesOrder salesOrder=new SalesOrder(salesOrderId,vipId1,waterNumId,sumPrice,discountSumPrice,saleDate);
		int result=0;
		int i = salesOrderServiceImpl.addSalesOrder(salesOrder);
		if(i!=0){
			result=1;
		}
		 map1.put("status",result);
		 return  map1;
	}
}
