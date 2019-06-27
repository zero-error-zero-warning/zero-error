package controller;


import model.Discount;
import model.Vip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DiscountService;
import service.VipService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(value = "*", maxAge = 3600)
@RequestMapping(value = "vip")
@Controller
public class VipController {

	@Autowired
	private VipService vipServiceImpl;

	@Autowired
	private DiscountService discountServiceImpl;
	/*
	*
	* 根据电话判断是否为会员
	* */
	@ResponseBody
	@RequestMapping(value = "queryVipById")
	public Map<String, Object> queryVipById(@RequestBody Map<String, String> map1) {
		String phoneNum = map1.get("phoneNum");
		Map<String, Object> map = new HashMap<String, Object>();
		Vip vip = vipServiceImpl.getVipByNum(phoneNum);
		int result = 0;
		if (vip != null) {
			result = 1;
		}
		map.put("status", result);
		map.put("result", vip);
		return map;
	}


	/*
	* 添加会员
	*
	* */
	@ResponseBody
	@RequestMapping(value = "addVip")
	public Map<String, Object> addVip(@RequestBody Map<String, String> map) {
		Map<String, Object> map1 = new HashMap<String, Object>();
		//获取会员的信息
		String name = map.get("name");
		String phoneNum = map.get("phoneNum");
		String gender = map.get("gender");
		Vip vip1 = vipServiceImpl.getVipByNum(phoneNum);
		int result1 = 0;
		if(vip1==null){
			Vip vip = new Vip();
			vip.setGender(gender);
			vip.setPhoneNum(phoneNum);
			vip.setName(name);
			int i = vipServiceImpl.addVip(vip);
			if (i != 0) {
				result1 = 1;
			}
		}
		map1.put("status", result1);
		return map1;
	}


	/*
	* 显示所有会员
	**/
	@ResponseBody
	@RequestMapping(value = "queryVip")
	public Map<String, Object> queryVip() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Vip> vipList = vipServiceImpl.getVipByDefault();
		map.put("vips", vipList);
		return map;
	}



	/*
	* 设置会员折扣
	* */
	@RequestMapping(value = "setDiscount")
	@ResponseBody
	public Map<String, Object> setDiscount(@RequestBody Map<String, Object> map) {
		Map<String, Object> map1 = new HashMap<String, Object>();
		float dis = Float.parseFloat((String) map.get("discount"));
		int result = 0;
		if (dis > 0 && dis < 1) {        //折扣必须在   0--1之间
			Discount discount = new Discount(dis);
			int i = discountServiceImpl.updateDiscount(discount);
			if (i != 0) {
				result = 1;
			}
		}
		map1.put("status", result);
		return map1;
	}


	/*
	* 查询会员折扣
	* */
	@RequestMapping(value = "queryDiscount")
	@ResponseBody
	public Map<String, Object> queryDiscount() {
		Map<String, Object> map1 = new HashMap<String, Object>();
		Discount discount = discountServiceImpl.getDiscount();
		int result = 0;
		float dis=0;
		if (discount != null) {
			result = 1;
			 dis = discount.getDiscount();     //获取折扣
		}
		map1.put("discount", dis);
		map1.put("status", result);
		return map1;
	}
}



