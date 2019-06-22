package service;

import model.Employees;

import java.util.List;

public interface WorkAttendanceService {

	/**
	 * @Description: 获取某天出勤的员工
	 * @Param:  时间
	 * @return:  出勤的员工
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public List<Employees> getWorkAttendance(String time);
}
