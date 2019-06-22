package service;

import model.CustomerChoosedMenu;

import java.util.List;

public interface CustomerChoosedMenuService {
	/**
	 * @Description: 添加一个顾客点菜单
	 * @Param:  商品的集合
	 * @return:  流水单号
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public int addCuschooseMenu(List<CustomerChoosedMenu> ccm);

	/**
	 * @Description: 查询所有的顾客点菜单
	 * @Param: 无
	 * @return: 顾客订单的集合
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public List<CustomerChoosedMenu> getCusChooseMenuBydefault();

	/**
	 * @Description: 根据流水编号获取顾客的点菜单
	 * @Param: 流水单号
	 * @return: 顾客点菜单
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public List<CustomerChoosedMenu> getCusChooseMenuByWaterNum(int num);
}
