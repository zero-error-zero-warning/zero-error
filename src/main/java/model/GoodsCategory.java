package model;



/*
*
* 食品类型类
*
* */

public class GoodsCategory {

    private int goodsCategoryId;   //商品类别id

    private  String category;     //  商品类别名称

    public GoodsCategory(int goodsCategoryId, String category) {

        this.goodsCategoryId = goodsCategoryId;
        this.category = category;
    }


    public int getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(int goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public GoodsCategory() {
        super();
    }
}
