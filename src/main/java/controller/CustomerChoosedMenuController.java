package controller;


import model.CustomerChoosedMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CustomerChoosedMenuService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@RequestMapping("CustomerChoosedMenu")
public class CustomerChoosedMenuController {

	@Autowired
	private CustomerChoosedMenuService customerChoosedMenuServiceImpl;



	/*
	* 确认点餐订单
	* */
	@RequestMapping(value = "checkOrder")
	@ResponseBody
	public Map<String,Object> sureMenu(@RequestBody Map<String,Object> map){
		Map<String,Object> map1=new HashMap<String, Object>();
		List<Map<String,Object>> list= (List) map.get("orderedGoods");
		int goodsId=0;
		int  num=0;
		CustomerChoosedMenu customerChoosedMenu=null;
		int maxWaterNum=Integer.parseInt(customerChoosedMenuServiceImpl.getMaxWaterNum()); //获取当前数据库的最大的流水单号
		List<CustomerChoosedMenu> customerChoosedMenuList=new ArrayList<CustomerChoosedMenu>();





		for(int i=0;i<list.size();i++){
			goodsId=(Integer) list.get(i).get("goodsId");
			num=(Integer) list.get(i).get("count");
			customerChoosedMenu=new CustomerChoosedMenu(maxWaterNum+1,goodsId,num);
			customerChoosedMenu.setGoodsId(goodsId);
			customerChoosedMenu.setNum(num);
			customerChoosedMenu.setWaterNumId(maxWaterNum+1);
			customerChoosedMenuList.add(customerChoosedMenu);
		}
		int i = customerChoosedMenuServiceImpl.addCuschooseMenu(customerChoosedMenuList);  //将一个商品集合写入数据库  生成一个流水单号
		int result=0;
		if(i!=0){
			result=1;
			map1.put("tatusOrWaterNumId",maxWaterNum+1);
		}
		map.put("status",result);
		return  map1;
	}

}
