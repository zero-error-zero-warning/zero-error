package controller;


import model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AdminService;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(value = "*",maxAge = 3600)
@RequestMapping(value = "admin")
public class AdminController {



	@Autowired
	private AdminService adminServiceImpl;


	@ResponseBody
	@RequestMapping(value = "adminLogin")
	public Map<String,Object> adminLogin(@RequestBody Map<String,String> map){
		Map<String,Object > map1=new HashMap<String, Object>();
		String username =map.get("username");
		String password=map.get("password");
		Admin admin = adminServiceImpl.getAdminByAccount(username, password);
		int result=0;
		if(admin!=null){
			result=1;
			map1.put("adminId",admin.getAdminId());
			map1.put("adminName",admin.getName());
		}
		map1.put("status",result);
		return  map1;
	}
}
