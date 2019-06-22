package service;

import model.Admin;
import org.springframework.stereotype.Service;


public interface AdminService {
	/**
	 * @Description: 根据账户信息获取管理员信息
	 * @Param:  用户名，密码
	 * @return:  管理员实体
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public Admin getAdminByAccount(String username, String password);
}
