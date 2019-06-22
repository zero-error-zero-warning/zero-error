package service;

import model.Vip;

import java.util.List;

public interface VipService {

	/**
	 * @Description: 添加会员
	 * @Param:  会员实体
	 * @return:  受影响的行数
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public int addVip(Vip vip);

	/**
	 * @Description: 根据会员点哈号码查询
	 * @Param:  电话号码
	 * @return:  vip实体
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public List<Vip> getVipById(String num);


	/**
	 * @Description: 查询所有的会员信息
	 * @Param:  无
	 * @return:  会员集合
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public List<Vip> getVipByDefault();

}
