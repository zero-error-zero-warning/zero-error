package service.impl;

import mapper.WorkAttendanceMapper;
import model.Employees;
import model.WorkAttendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.WorkAttendanceService;

import java.util.List;

@Service
public class WorkAttendanceServiceImpl  implements WorkAttendanceService{

	@Autowired
	private WorkAttendanceMapper workAttendanceMapper;


	/**
	 * @Description: 获取某天出勤的员工
	 * @Param:  时间
	 * @return:  出勤的员工
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public List<WorkAttendance> getWorkAttendance(String time) {
		return workAttendanceMapper.getWorkAttendance(time);
	}

	/**
	 * @Description: 打开上班，设置上班时间
	 * @Param:  员工id
	 * @return:  受影响的行数
	 * @Author: 何袁辉
	 * @Date: 2019/6/24
	 */
	public int setWorkAttendanceStart(String employId) {
		return  workAttendanceMapper.setWorkAttendanceStart(employId);

	}

	/**
	 * @Description: 打卡下班，设置下班时间
	 * @Param:  员工id
	 * @return:  出勤实体
	 * @Author: 何袁辉
	 * @Date: 2019/6/24
	 */
	public int setWorkAttendanceEnd(String employId) {
		return workAttendanceMapper.setWorkAttendanceEnd(employId);
	}

	/**
	 * @Description: 通过员工编号获取员工
	 * @Param:  map 员工编号， 时间
	 * @return:
	 * @Author: 何袁辉
	 * @Date: 2019/6/24
	 */
	public WorkAttendance getWorkAttendanceById(String id) {
		return workAttendanceMapper.getWorkAttendanceById(id);
	}
}
