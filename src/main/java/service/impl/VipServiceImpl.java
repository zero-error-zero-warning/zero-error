package service.impl;

import mapper.VipMapper;
import model.Vip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.VipService;

import java.util.List;

@Service
public class VipServiceImpl  implements VipService{

	@Autowired
	private VipMapper vipMapper;


	/*
	*   @Description:  添加VIP
	*   @Author: 何袁辉
	*   @Date: 2019/6/22
	*   @Param: VIP实体
	*   @Return: 1：成功  0： 失败
	*
	* */
	public int addVip(Vip vip) {
		return vipMapper.addVip(vip);
	}




	/*
		*   @Description:  根据id获取VIP信息
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: vip号码
		*   @Return:   ？？？？
		*
		* */
	public Vip getVipByNum(String num) {
		return vipMapper.getVipByNum(num);
	}

	/*
		*   @Description:  获取所有的vip
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 无
		*   @Return:  所有的vip实体集合
		*
		* */
	public List<Vip> getVipByDefault() {
		return vipMapper.getVipByDefault();
	}
}
