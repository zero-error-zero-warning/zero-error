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

	private String pictureUrl;   //商品图片的路径
	private GoodsCategory category;   //商品类型     与商品类型类相关联
	private int goodsCategoryId;   //商品类型id

	public Goods(String name, float price, String pictureUrl, int goodsCategoryId) {
		this.name = name;
		this.price = price;
		this.pictureUrl = pictureUrl;
		this.goodsCategoryId = goodsCategoryId;
	}

	public Goods(int goodsId, String name, float price, String pictureUrl, GoodsCategory category) {
		this.goodsId = goodsId;
		this.name = name;
		this.price = price;
		this.pictureUrl = pictureUrl;
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

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public GoodsCategory getCategory() {
		return category;
	}

	public void setCategory(GoodsCategory category) {
		this.category = category;
	}

	public int getGoodsCategoryId() {
		return goodsCategoryId;
	}

	public void setGoodsCategoryId(int goodsCategoryId) {
		this.goodsCategoryId = goodsCategoryId;
	}
}
