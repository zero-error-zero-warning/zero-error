package service.impl;

import mapper.GoodsMapper;
import model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GoodsService;

import java.util.List;

@Service
public class GoodsServiceImpl  implements GoodsService{


	@Autowired
	private GoodsMapper goodsMapper;

	/*
		*   @Description:  添加商品
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param:  商品实体
		*   @Return:  1：成功   0：失败
		*
		* */
	public int addGoods(Goods g) {
		return goodsMapper.addGoods(g);
	}

	/*
		*   @Description:   根据id 删除商品
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param:  商品id
		*   @Return: 1：成功   0：失败
		*
		* */
	public int deleteGoodsById(String id) {
		return goodsMapper.deleteGoodsById(id);
	}

	/*
		*   @Description:根据类别删除商品
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param:   类别id
		*   @Return: 1：成功   0：失败
		*
		* */
	public int deleteGoodsByCategoryId(String id) {

		return goodsMapper.deleteGoodsByCategoryId(id);
	}

	/*
		*   @Description:   获取所有的商品
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 无
		*   @Return:  商品集合
		*
		* */
	public List<Goods> getGoodsByDefault() {
		return goodsMapper.getGoodsByDefault();
	}

	/*
		*   @Description:  获取某一类的所有商品
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 商品类别
		*   @Return: 某一个类别下的商品集合
		*
		* */
	public List<Goods> getGoodsByCategory(String id) {
		return goodsMapper.getGoodsByCategory(id);
	}
}
