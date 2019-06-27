package controller;


import model.Goods;
import model.GoodsCategory;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.GoodsCategoryService;
import service.GoodsService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(value = "*",maxAge = 3600)
@RequestMapping("goodsCategory")
public class GoodsCategoryController {



	@Autowired
	GoodsCategoryService goodsCategoryServiceImpl;

	@Autowired
	GoodsService goodsServiceImpl;



	/*
	*
	* 查询所有的种类
	* */
	@ResponseBody
	@RequestMapping(value = "queryGoodsCategory")
	public Map<String,Object>  queryAllCategory(){
		Map<String,Object> map=new HashMap<String, Object>();
		List<GoodsCategory> list = goodsCategoryServiceImpl.getGoodsCategoryByDefault();
		map.put("goodsCategory",list);
		return map;
	}



	/*
	*
	* 添加种类
	* */
	@RequestMapping(value = "addGoodsCategory")
	@ResponseBody
	public Map<String,Object> addGoodsCategory(@RequestBody Map<String,String> map){
		Map<String,Object> map1=new HashMap<String, Object>();
		String typeName=map.get("category");
		GoodsCategory goodsCategory=new GoodsCategory();
		goodsCategory.setCategory(typeName);
		int i = goodsCategoryServiceImpl.addGoodsCategory(goodsCategory);
		int result=0;
		if(i!=0){
			result=1;
		}
		map1.put("status",result);
		return  map1;
	}



	/*
	* 删除一个类：   同时删除该类下的所有商品
	*
	* */
	@ResponseBody
	@RequestMapping(value = "deleteGoodsCategory")
	public Map<String,Object> deleteGoodsCategory(@RequestBody Map<String,String> map){
		Map<String,Object> map1=new HashMap<String, Object>();
		String goodsCategoryId=map.get("goodsCategoryId");   //先要判断这个类别是否存在
		GoodsCategory goodsCategoryById = goodsCategoryServiceImpl.getGoodsCategoryById(goodsCategoryId);
		int result=0;
		if(goodsCategoryById!=null){
			List<Goods> goods = goodsServiceImpl.getGoodsByCategory(goodsCategoryId);
			int i=0;
			if(goods==null&&goods.size()==0){         //该类下没有商品   直接删除该类
				i= goodsCategoryServiceImpl.deleteGoodsCategory(goodsCategoryId);
				if(i!=0){
					result=1;
				}
			}else {       //该类下有商品  先删除该类下的商品   再删除该类
				int j=0;
				j= goodsServiceImpl.deleteGoodsByCategoryId(goodsCategoryId);
				if(j!=0){
					i=goodsCategoryServiceImpl.deleteGoodsCategory(goodsCategoryId);
					if(i!=0){
						result=1;
					}
				}
			}
		}
		map1.put("status",result);
		return  map1;
	}
}
