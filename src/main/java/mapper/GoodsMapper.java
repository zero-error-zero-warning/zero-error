package mapper;

import model.Goods;

import java.util.List;

public interface GoodsMapper {

    /**
    * @Description: 添加一个商品
    * @Param:  商品实体
    * @return:  受影响的行数
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public int addGoods(Goods g);

    /**
    * @Description: 根据id删除商品
    * @Param:  商品ID
    * @return:  受影响的行数
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public int deleteGoodsByDefault(String id);

    /**
    * @Description: 根据类别删除商品
    * @Param:  商品ID
    * @return:  受影响的行数
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public int deleteGoodsByCategory(String id);

    /**
    * @Description: 查询所有的商品
    * @Param:  无
    * @return:  商品集合
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public List<Goods> getGoodsByDefault();

    /**
    * @Description: 根据类别查询商品
    * @Param:  商品类别
    * @return:  商品实体
    * @Author: 陈泯全
    * @Date: 2019/6/22
    */
    public List<Goods> getGoodsByCategory(String id);

}
