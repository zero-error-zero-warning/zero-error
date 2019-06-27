package model;/**
 * @title: SalesOrderDetail
 * @projectName Zero_Error
 * @description: TODO
 * @author msi
 * @date 2019/6/221:50
 */

import java.io.PrintWriter;
import java.security.PrivateKey;

/**
 * @program: Zero_Error
 *
 * @description: 详细销售信息
 *
 * @author: Mr.Wang
 *
 * @create: 2019-06-22 01:50
 **/
public class SalesOrderDetail {
    private  int salesOrderId;
    private  int employeeId;
    private  int vip;
    private  int WaterNumId;
    private  float sumPrice;
    private  float discountSumPrice;
    private  String time;
    private  int ccmId;
    private  int goodsId;
    private  int num;
    private  String name;
    private  float price;
    private  int goodsCategoryId;
    private  String category;

    public int getSalesOrderId() {
        return salesOrderId;
    }

    public void setSalesOrderId(int salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public int getWaterNumId() {
        return WaterNumId;
    }

    public void setWaterNumId(int waterNumId) {
        WaterNumId = waterNumId;
    }

    public float getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(float sumPrice) {
        this.sumPrice = sumPrice;
    }

    public float getDiscountSumPrice() {
        return discountSumPrice;
    }

    public void setDiscountSumPrice(float discountSumPrice) {
        this.discountSumPrice = discountSumPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCcmId() {
        return ccmId;
    }

    public void setCcmId(int ccmId) {
        this.ccmId = ccmId;
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
}
