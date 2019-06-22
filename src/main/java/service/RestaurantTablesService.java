package service;

import model.RestaurantTables;

import java.util.List;

public interface RestaurantTablesService {

	/**
	 * @Description: 添加桌子
	 * @Param:  桌子实体
	 * @return:  受影响的行数
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public int addRestaurantTable(RestaurantTables re);

	/**
	 * @Description: 根据ID删除桌子
	 * @Param:  桌子id
	 * @return:  受影响的行数
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public int deleteRestaurantTable(String id);

	/**
	 * @Description: 查询所有的桌子
	 * @Param:  无
	 * @return:  桌子的集合
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public List<RestaurantTables> getRestaurantTabelsByDefault();

	/**
	 * @Description: 根据id返回桌子实体
	 * @Param:  桌子id
	 * @return: 桌子实体
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public RestaurantTables getRestaurantTabelsById(String id);

}
