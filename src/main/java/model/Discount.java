package model;




/*
* 折扣类
* */
public class Discount {
    private  float  discount;     //折扣数



    public Discount() {

    }
    public Discount(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
