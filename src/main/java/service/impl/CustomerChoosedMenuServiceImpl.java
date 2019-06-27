package service.impl;

import mapper.CustomerChoosedMenuMapper;
import model.CustomerChoosedMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CustomerChoosedMenuService;

import java.util.List;

@Service
public class CustomerChoosedMenuServiceImpl  implements CustomerChoosedMenuService{

	@Autowired
	private CustomerChoosedMenuMapper customerChoosedMenuMapper;




	/*
		*   @Description:   添加一个顾客点菜单
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param:   商品集合
		*   @Return: 流水单号
		*
		* */
	public int addCuschooseMenu(List<CustomerChoosedMenu> ccm) {
		return customerChoosedMenuMapper.addCuschooseMenu(ccm);
	}

	/*
		*   @Description:  查询所有的顾客的点菜单
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 无
		*   @Return: 顾客订单的集合
		*
		* */
	public List<CustomerChoosedMenu> getCusChooseMenuBydefault() {
		return customerChoosedMenuMapper.getCusChooseMenuBydefault();
	}

	/*
		*   @Description:  根据流水编号获取顾客的点菜单
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param:  流水单号
		*   @Return: 顾客点菜单
		*
		* */
	public List<CustomerChoosedMenu> getCusChooseMenuByWaterNum(String  num) {
		return customerChoosedMenuMapper.getCusChooseMenuByWaterNum(num);
	}



	/**
	 * @Description: 获取目前数据库最大的waterNum
	 * @Param:
	 * @return:  waterNum
	 * @Author: 何袁辉
	 * @Date: 2019/6/24
	 */
	public String getMaxWaterNum() {
		return customerChoosedMenuMapper.getMaxWaterNum();
	}
}
