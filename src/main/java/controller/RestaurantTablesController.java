package controller;

import model.RestaurantTables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.RestaurantTablesService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(value = "*",maxAge = 3600)
@Controller
@RequestMapping(value="tables")
public class RestaurantTablesController {

	@Autowired
	private RestaurantTablesService restaurantTablesServiceImpl;



	/*
	* 查询所有的桌子
	*
	* */
	@ResponseBody
	@RequestMapping(value = "queryTables")
	public Map<String, Object> queryTables(){
		Map<String ,Object> map=new HashMap<String,Object>();
		List<RestaurantTables> tabels = restaurantTablesServiceImpl.getRestaurantTabelsByDefault();
		map.put("tables",tabels);
		return  map;
	}



	/*
	* 添加桌子   :  桌子的id自增
	*
	* */
	@ResponseBody
	@RequestMapping(value = "addTable")
	public Map<String,Object> addTable(@RequestBody Map<String,Object> map){
		Map<String,Object> map1=new HashMap<String, Object>();
		String option=(String)map.get("option");
		int result=0;
		int i=0;
		if(option.equals("1")){
			RestaurantTables restaurantTables=new RestaurantTables();
			restaurantTables.setStatus(0);
			i = restaurantTablesServiceImpl.addRestaurantTable(restaurantTables);
			if(i!=0){
				result=1;
			}
		}


		map1.put("status",result);
		return  map1;
	}



	/*
	* 删除桌子   ：先查询桌子是否存在，桌子的状态是否被占用    然后才可以删除桌子
	*
	* */

	@ResponseBody
	@RequestMapping("deleteTable")
	public Map<String ,Object> deleteTable(@RequestBody Map<String,Integer> map){
		Map<String,Object> map1=new HashMap<String, Object>();
		int  tableId= map.get("tableId");
		int option=(map.get("option"));
		int result=0;
		if(option==0){
			RestaurantTables table = restaurantTablesServiceImpl.getRestaurantTabelsById(String.valueOf(tableId));
			if(table!=null&&table.getStatus()!=1){    //有这个桌子  并且没有被使用  可以删除
				int i = restaurantTablesServiceImpl.deleteRestaurantTable(String.valueOf(tableId));
				if(i!=0){
					result=1;
				}
			}
		}

		map1.put("status",result);
		return  map1;
	}
}
