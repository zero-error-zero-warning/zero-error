package service.impl;

import mapper.WorkAttendanceMapper;
import model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.WorkAttendanceService;

import java.util.List;

@Service
public class WorkAttendanceServiceImpl  implements WorkAttendanceService{

	@Autowired
	private WorkAttendanceMapper workAttendanceMapper;




	/*
		*   @Description: 获取某天出勤的员工
		*   @Author: 何袁辉
		*   @Date: 2019/6/22
		*   @Param:   日期
		*   @Return:   员工集合
		*
		* */
	public List<Employees> getWorkAttendance(String time) {
		return workAttendanceMapper.getWorkAttendance(time);
	}
}
