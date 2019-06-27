package service;

import model.Employees;
import model.WorkAttendance;

import java.util.List;

public interface WorkAttendanceService {


	/**
	 * @Description: 获取某天出勤的员工
	 * @Param:  时间
	 * @return:  出勤的员工
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public List<WorkAttendance> getWorkAttendance(String time);

	/**
	 * @Description: 打开上班，设置上班时间
	 * @Param:  员工id
	 * @return:  受影响的行数
	 * @Author: 何袁辉
	 * @Date: 2019/6/24
	 */
	public int setWorkAttendanceStart(String employId);

	/**
	 * @Description: 打卡下班，设置下班时间
	 * @Param:  员工id
	 * @return:  出勤实体
	 * @Author: 何袁辉
	 * @Date: 2019/6/24
	 */
	public int setWorkAttendanceEnd(String employId);

	/**
	 * @Description: 通过员工编号和时间获取员工
	 * @Param:  map 员工编号， 时间
	 * @return:
	 * @Author: 何袁辉
	 * @Date: 2019/6/24
	 */
	public WorkAttendance getWorkAttendanceById(String id);
}
