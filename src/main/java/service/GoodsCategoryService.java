package service;

import model.GoodsCategory;

import java.util.List;

public interface GoodsCategoryService {
	/**
	 * @Description: 增加一个类别
	 * @Param:  类别实体
	 * @return:  受影响的行数
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public int addGoodsCategory(GoodsCategory gc);

	/**
	 * @Description: 删除一个类别
	 * @Param:  类别id
	 * @return:  受影响的行数
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public int deleteGoodsCategory(String id);

	/**
	 * @Description: 查询所有的类别
	 * @Param:  无
	 * @return:  类别的集合
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public List<GoodsCategory> getGoodsCategoryByDefault();

	/**
	 * @Description: 通过ID查询商品类别
	 * @Param:  类别ID
	 * @return:  商品类别实体
	 * @Author: 何袁辉
	 * @Date: 2019/6/22
	 */
	public int getGoodsCategoryById(GoodsCategory gc);
}
