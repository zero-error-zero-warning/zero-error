package mapper;

import model.Vip;

import java.util.List;

public interface VipMapper {

    /**
    * @Description: 添加会员
    * @Param:  会员实体
    * @return:  受影响的行数
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public int addVip(Vip vip);

    /**
    * @Description: 根据会员点话号码查询
    * @Param:  电话号码
    * @return:  vip实体
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public Vip getVipByNum(String num);


    /**
    * @Description: 查询所有的会员信息
    * @Param:  无
    * @return:  会员集合
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public List<Vip> getVipByDefault();


}
