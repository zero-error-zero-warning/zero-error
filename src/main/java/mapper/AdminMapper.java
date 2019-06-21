package mapper;

import model.Admin;

public interface AdminMapper {
    /**
    * @Description: 获取管理员信息
    * @Param:  用户名，密码
    * @return:  管理员实体
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public Admin getAdminAccount(String uername, String password);
}
