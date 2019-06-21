package mapper;

import model.Employees;

import java.util.List;


public interface EmployeesMapper {

    /**
     * @Description: 添加员工
     * @Param:  员工实体
     * @return:  受影响的行数
     * @Author: 陈泯全
     * @Date: 2019/6/22
     */
    public int addEmployee(Employees e);

    /**
     * @Description: 根据员工id删除员工
     * @Param:  员工id
     * @return:  受到影响的行数
     * @Author: 陈泯全
     * @Date: 2019/6/22
     */
    public int deleteEmployeeById(String id);

    /** 
    * @Description:  查询用户信息
    * @Param:  用户名，密码
    * @return: 返回这个用户
    * @Author: 陈泯全
    * @Date: 2019/6/22 
    */ 
    public Employees getEmployeesByAccount(String username, String password);

    /**
    * @Description: 查询所有的员工
    * @Param:  无
    * @return:  员工的集合
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public List<Employees> getEmployeesByDefault();

    /**
    * @Description: 根据员工Id查询员工信息
    * @Param:  员工id
    * @return:  员工实体
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public Employees getEmployById(String id);

    /**
    * @Description: 更具日期获取员工
    * @Param:  开始时间，结束时间
    * @return:  员工的集合
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public List<Employees> getEmployeesByTime(String startTime,String engTime);



    /**
    * @Description:  重置密码
    * @Param:  员工参数
    * @return:  受影响的行数
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public int resetEmployeePwdById(String id);

    /**
    * @Description: 通过id修改员工信息
    * @Param:  员工实体
    * @return:  首影响的行数
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public int updateEmployee(Employees e);






}
