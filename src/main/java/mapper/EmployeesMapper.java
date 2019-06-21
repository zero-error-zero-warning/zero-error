package mapper;

import model.Employees;

public interface EmployeesMapper {
 
    
    /** 
    * @Description:  查询用户信息
    * @Param:  用户名，密码
    * @return: 返回这个用户
    * @Author: 陈泯全
    * @Date: 2019/6/22 
    */ 
    public Employees GetEmployeesAccount(String username, String password);
}
