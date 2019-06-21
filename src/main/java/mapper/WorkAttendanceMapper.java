package mapper;

import model.Employees;

import java.util.List;

public interface WorkAttendanceMapper {

    /**
    * @Description: 获取某天出勤的员工
    * @Param:  时间
    * @return:  出勤的员工
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public List<Employees> getWorkAttendance(String time);
}
