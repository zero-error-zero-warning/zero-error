package model;

/*
*
*  商品类
*
* */

public class Goods {

    private int goodsId;        //商品id
    private String name;     //商品名称
    private float price;     //商品价格
    private String goodsCategoryId;   //商品类型     与商品类型类相关联
    private String pictureUrl;

    public Goods(int goodsId, String name, float price, String goodsCategoryId) {
        this.goodsId = goodsId;
        this.name = name;
        this.price = price;
        this.goodsCategoryId = goodsCategoryId;
    }


    public Goods() {
        super();
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public String getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(String goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
