package service.impl;

import mapper.AdminMapper;
import model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AdminService;

import java.util.HashMap;
import java.util.Map;

@Service
public class AdminServiceImpl  implements AdminService{


	@Autowired
	private AdminMapper adminMapper;



	/*
	*   @Description:  根据 用户名  密码 获取管理员信息
	*   @Author: 何袁辉
	*   @Date: 2019/6/22
	*   @Param:  用户名  密码
	*   @Return:   管留员实体
	*
	* */
	public Admin getAdminByAccount(String username, String password) {
		Map map=new HashMap();
		map.put("username",username);
		map.put("password",password);
		return adminMapper.getAdminByAccount(map);
	}
}
