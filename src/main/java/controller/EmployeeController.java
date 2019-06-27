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
import java.util.List;
import java.util.Map;


@CrossOrigin(value = "*",maxAge = 3600)
@Controller
@RequestMapping(value = "employee")
public class EmployeeController {


	@Autowired
	private EmployeesService employeesServiceImpl;



	/*
	* @Description:员工登录
	* @Param: 员工密码和用户名
	* @Return:录状态码   员工的用户名  id
	* @Author:何袁辉
	* @Date:2019-6-24
	* */
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


	/*
	* 添加员工  addEmployee
	* */

	@ResponseBody
	@RequestMapping(value = "addEmployee")
	public Map<String,Object>  addEmployee(@RequestBody Map<String,Map<String,String>>  map){
		Map<String,Object> map1=new HashMap<String, Object>();
		String name=map.get("employee").get("name");
		String phoneNum=map.get("employee").get("phoneNum");
		String text=map.get("employee").get("text");
		String password=map.get("employee").get("password");
		Employees employees=new Employees(name,phoneNum,password,text);
		int result=0;
		int i=0;
		i = employeesServiceImpl.addEmployee(employees);
		if(i!=0){
			result=1;
		}
		map1.put("status",result);
		return  map1;
	}









	/*
	*
	* 删除员工  deleteEmployee
	*
	* */
	@ResponseBody
	@RequestMapping(value = "deleteEmployee")
	public Map<String,Object> deleteEmployee(@RequestBody Map<String,String> map){
		Map<String,Object> map1=new HashMap<String, Object>();
		String employeeId=map.get("employeeId");
		int result=0;
		int i=0;
		Employees employ = employeesServiceImpl.getEmployById(employeeId);
		if(employ!=null){
			 i = employeesServiceImpl.deleteEmployeeById(employeeId);
			if(i!=0){
				result=1;
			}
		}
		map1.put("status",result);
		return  map1;
	}



	/*
	* 查看考勤  checkAttendance
	* 这个方法还没有是实现
	* */
	@ResponseBody
	@RequestMapping(value = "checkAttendance")
	public Map<String,Object>  checkAttendance(){
		Map<String,Object> map=new HashMap<String, Object>();
		return  map;
	}

	/*
	*
	* 查询所有的员工   queryEmployees
	* */

	@ResponseBody
	@RequestMapping(value = "queryEmployees")
	public Map<String,Object> queryEmployees(){
		Map<String,Object> map=new HashMap<String,Object>();
		List<Employees> list = employeesServiceImpl.getEmployeesByDefault();
		map.put("employees",list);


		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName());
		}


		return  map;
	}

	/*
	*
	* 重置密码：  resetPassword
	*
	* */
	@ResponseBody
	@RequestMapping(value = "resetPassword")
	public Map<String,Object>  resetPassword(@RequestBody Map<String,String> map){
		Map<String ,Object> map1=new HashMap<String, Object>();
		String employeeId=map.get("employeeId");
		int i=0;
		int result=0;
		Employees employ = employeesServiceImpl.getEmployById(employeeId);
		if(employ!=null){
			i=employeesServiceImpl.resetEmployeePwdById(employeeId);
			if(i!=0){
				result=1;
			}
		}
		map1.put("status",result);
		return  map1;
	}
}
