package service.impl;

import mapper.DiscountMapper;
import model.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DiscountService;

@Service
public class DiscountServiceImpl  implements DiscountService{

	@Autowired
	private DiscountMapper discountMapper;



	/*
	*   @Description:   获取折扣
	*   @Author: 何袁辉
	*   @Param: 无
	*   @Date:2019/6/22
	*   @Return: 折扣实体
	*
	* */
	public Discount getDiscount() {
		return discountMapper.getDiscount();
	}

	/*
		*   @Description:更改折扣
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 折扣实体
		*   @Return:    是否修改成功 1： 成功   0：失败
		*
		* */
	public int updateDiscount(Discount d) {
		return discountMapper.updateDiscount(d);
	}
}
