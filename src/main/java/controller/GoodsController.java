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

import javax.jws.Oneway;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Controller
@CrossOrigin(value = "*",maxAge = 3600)
@RequestMapping("goods")
public class GoodsController {


	@Autowired
	private GoodsService goodsServiceImpl;

	@Autowired
	private GoodsCategoryService goodsCategoryServiceImpl;


	/*
	*
	* 查询一个类下面的所有的商品
	*
	* */
	@ResponseBody
	@RequestMapping(value = "queryGoodsByCategory")
	public Map showAllGoodsByCategory(@RequestBody Map<String,String> map){
		String typeId=map.get("typeId");
		Map<String,Object> map1=new HashMap<String,Object>();
		List<Goods> goods=goodsServiceImpl.getGoodsByCategory(typeId);
		map1.put("goods",goods);
		return  map1;
	}

	/*
	*
	* 删除一个商品
	*
	* */
	@ResponseBody
	@RequestMapping(value = "deleteGoodsCategory")
	public Map<String,Object>  deleteGoodsCategory  (@RequestBody Map<String,String> map){
		Map<String,Object> map1=new HashMap<String, Object>();
		String goodsId=map.get("goodsId");
		int result=0;
		int i = goodsServiceImpl.deleteGoodsById(goodsId);
		if(i!=0){
			result=1;
		}
		map1.put("status",result);
		return  map1;
	}

	/*
	* 添加商品
	*
	* */
	@ResponseBody
	@RequestMapping(value = "addGood")
	public Map<String,Object> addGood(@RequestBody Map<String,Map<String,String>> map){
		Map<String,Object> map1=new HashMap<String, Object>();
		String name= map.get("good").get("name");
		float price=Float.parseFloat(map.get("good").get("price"));
		int  goodsCategoryId=Integer.parseInt(map.get("good").get("goodsCategoryId"));   //获取添加产品的类别id  先要查询此类别是否存在
		GoodsCategory goodsCategoryById = goodsCategoryServiceImpl.getGoodsCategoryById(String.valueOf(goodsCategoryId));
		int i=0;
		int result=0;
		if(goodsCategoryById!=null&&price>0){    //可以添加
			String pictureUrl="img/1.jpg";
			Goods goods=new Goods(name,price,pictureUrl,goodsCategoryId);
			 i = goodsServiceImpl.addGoods(goods);
			if(i!=0){
				result=1;   //添加成功
			}
		}
		map1.put("status",result);
		return  map1;
	}
}
