package service.impl;

import mapper.EmployeesMapper;
import model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.EmployeesService;

import java.util.List;

@Service
public class EmployeesServiceImpl  implements EmployeesService{

	@Autowired
	private EmployeesMapper employeesMapper;




	/*
			*   @Description:  添加员工
			*   @Author: 何袁辉
			*   @Date: 2019/6/22
			*   @Param:   员工实体
			*   @Return:    1： 成功   0：失败
			*
			* */
	public int addEmployee(Employees e) {
		return employeesMapper.addEmployee(e);
	}

	/*
			*   @Description:  根据id 删除员工
			*   @Author: 何袁辉
			*   @Date: 2019/6/22
			*   @Param:   员工id
			*   @Return:  1： 成功   0：失败
			*
			* */
	public int deleteEmployeeById(String id) {
		return employeesMapper.deleteEmployeeById(id);
	}



	/*
			*   @Description:  查询员工信息
			*   @Author: 何袁辉
			*   @Date: 2019/6/22
			*   @Param:   员工用户名  密码
			*   @Return: 员工信息
			*
			* */
	public Employees getEmployeesByAccount(String username, String password) {
		return employeesMapper.getEmployeesByAccount(username,password);
	}

	/*
			*   @Description:   查询所有的员工
			*   @Author: 何袁辉
			*   @Date: 2019/6/22
			*   @Param: 无
			*   @Return:  员工的集合
			*
			* */
	public List<Employees> getEmployeesByDefault() {
		return employeesMapper.getEmployeesByDefault();
	}


	/*
		*   @Description:   根据id获取员工信息
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 员工id
		*   @Return:  员工实体
		*
		* */
	public Employees getEmployById(String id) {
		return employeesMapper.getEmployById(id);
	}

	/*
			*   @Description:  根据上班日期获取员工
			*   @Author: 何袁辉
			*   @Date: 2019/6/22
			*   @Param:   上班开始时间  上班结束时间
			*   @Return:  员工集合
			*
			* */
	public List<Employees> getEmployeesByTime(String startTime, String engTime) {
		return employeesMapper.getEmployeesByTime(startTime,engTime);
	}

	/*
			*   @Description:  重置密码
			*   @Author: 何袁辉
			*   @Date: 2019/6/22
			*   @Param: 员工id
			*   @Return:   1： 成功   0：失败
			*
			* */
	public int resetEmployeePwdById(String id) {
		return employeesMapper.resetEmployeePwdById(id);
	}

	/*
		*   @Description:  修改员工信息
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param: 员工实体
		*   @Return:  1： 成功   0：失败
		*
		* */
	public int updateEmployee(Employees e) {
		return employeesMapper.updateEmployee(e);
	}
}
