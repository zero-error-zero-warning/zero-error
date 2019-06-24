package mapper;

import model.Admin;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class AdminMapperTest {


	@Autowired
	private AdminMapper adminMapper;


	//根据 用户名  密码 获取管理员信息
	@Test
	public void getAdminByAccountTets(){
		String username="zs";
		String password="123456";
		Map<String,String> map=new HashMap<String,String>();
		map.put("username",username);
		map.put("password",password);
		Admin account = adminMapper.getAdminByAccount(map);
		System.out.println(account);
	}




}