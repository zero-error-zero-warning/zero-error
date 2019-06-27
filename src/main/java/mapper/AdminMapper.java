package mapper;

import model.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

import java.util.Map;

public interface AdminMapper {
    /**
    * @Description: 跟账户信息获取管理员信息
    * @Param:  username,passwrd
    * @return:  管理员实体
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */

    public Admin getAdminByAccount(Map map);
}








