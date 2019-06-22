package service.impl;


import mapper.RestaurantTablesMapper;
import model.RestaurantTables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.RestaurantTablesService;

import java.util.List;

@Service
public class RestaurantTablesServiceImpl  implements RestaurantTablesService{

	@Autowired
	private RestaurantTablesMapper restaurantTablesMapper;


	/*
		*   @Description:  添加桌子
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param:  桌子实体
		*   @Return:  1：成功   0： 失败
		*
		* */
	public int addRestaurantTable(RestaurantTables re) {
		return restaurantTablesMapper.addRestaurantTable(re);
	}

	/*
		*   @Description: 根据id删除桌子
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 桌子id
		*   @Return: 1：成功   0： 失败
		*
		* */
	public int deleteRestaurantTable(String id) {
		return restaurantTablesMapper.deleteRestaurantTable(id);
	}


	/*
	*   @Description:  获取所有的桌子
	*   @Author: 何袁辉
	*   @Date: 2019/6/22
	*   @Param: 无
	*   @Return:  桌子集合
	*
	* */
	public List<RestaurantTables> getRestaurantTabelsByDefault() {
		return restaurantTablesMapper.getRestaurantTabelsByDefault();
	}

	/*
		*   @Description: 根据id查询桌子
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 桌子id
		*   @Return: 桌子
		*
		* */
	public RestaurantTables getRestaurantTabelsById(String id) {
		return restaurantTablesMapper.getRestaurantTabelsById(id);
	}
}
