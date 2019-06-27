package controller;


import model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.EmployeesService;

import java.util.HashMap;
import java.util.Map;


@CrossOrigin(value = "*",maxAge = 3600)
@Controller
@RequestMapping(value = "employee")
public class Employee {


	@Autowired
	private EmployeesService employeesServiceImpl;



	@ResponseBody
	@RequestMapping(value = "employeeLogin")
	public Map<String,Object>  employeeLogin(@RequestBody Map<String,String> map){
		Map<String ,Object> map1=new HashMap();
		String username=map.get("username");
		String password=map.get("password");
		Employees employee = employeesServiceImpl.getEmployeesByAccount(username, password);
		Integer   result=0;
		if(employee!=null){
			map1.put("employeeName",employee.getName());
			map1.put("employeeId",employee.getEmployeeId());
			result=1;
		}
		map1.put("tatus",result);
		return  map1;
	}
}
