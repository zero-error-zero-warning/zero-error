package model;

/*
* 用于存储顾客的选菜品
*
* */


import java.util.List;

public class CustomerChoosedMenu {

    private int ccmId;    //  顾客所点菜的id     一个（桌）顾客可以点多个菜
    private int waterNumId;  //流水单号
    private int goodsId;   // 商品id
    private int num;   //商品数量


	public CustomerChoosedMenu(int waterNumId, int goodsId, int num) {
		this.waterNumId = waterNumId;
		this.goodsId = goodsId;
		this.num = num;
	}

	public int getCcmId() {
        return ccmId;
    }

    public void setCcmId(int ccmId) {
        this.ccmId = ccmId;
    }

    public CustomerChoosedMenu(int ccmId, int waterNumId, int goodsId, int num) {
        this.ccmId = ccmId;
        this.waterNumId = waterNumId;
        this.goodsId = goodsId;
        this.num = num;
    }

    public CustomerChoosedMenu() {
        super();
    }


    public int getWaterNumId() {
        return waterNumId;
    }

    public void setWaterNumId(int waterNumId) {
        this.waterNumId = waterNumId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
