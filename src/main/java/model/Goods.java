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
    private GoodsCategory category;   //商品类型     与商品类型类相关联

    public Goods(int goodsId, String name, float price, GoodsCategory category) {
        this.goodsId = goodsId;
        this.name = name;
        this.price = price;
        this.category = category;
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

    public GoodsCategory getCategory() {
        return category;
    }

    public void setCategory(GoodsCategory category) {
        this.category = category;
    }



}
