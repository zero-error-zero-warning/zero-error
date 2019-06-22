package service;

import model.Discount;

public interface DiscountService {
	/**
	 * @Description: 获取折扣
	 * @Param:  无
	 * @return:  折扣
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public Discount getDiscount();

	/**
	 * @Description: 修改折扣
	 * @Param:  折扣实体
	 * @return:  受影响的行数
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public int updateDiscount(Discount d);
}
