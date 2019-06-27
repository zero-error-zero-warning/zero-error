package service.impl;

import mapper.GoodsCategoryMapper;
import model.GoodsCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GoodsCategoryService;

import java.util.List;


@Service
public class GoodsCategoryServiceImpl  implements GoodsCategoryService{

	@Autowired
	private GoodsCategoryMapper goodsCategoryMapper;



	/*
		*   @Description:  添加商品类型
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param:   商品类型实体
		*   @Return: 1： 成功   0：失败
		*
		* */
	public int addGoodsCategory(GoodsCategory gc) {
		return goodsCategoryMapper.addGoodsCategory(gc);
	}

	/*
		*   @Description:  根据id删除商品类型
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param:  商品id
		*   @Return: 1： 成功   0：失败
		*
		* */
	public int deleteGoodsCategory(String id) {
		return goodsCategoryMapper.deleteGoodsCategory(id);
	}

	/*
		*   @Description:  查询所有的商品类型
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 无
		*   @Return:   所有的商品类型
		*
		* */
	public List<GoodsCategory> getGoodsCategoryByDefault() {
		return goodsCategoryMapper.getGoodsCategoryByDefault();
	}

	/*
		*   @Description:   ？？？？？？
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 商品类型id
		*   @Return:
		*
		* */
	public GoodsCategory getGoodsCategoryById(String id) {
		return goodsCategoryMapper.getGoodsCategoryById(id);
	}
}
