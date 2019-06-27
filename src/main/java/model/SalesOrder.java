package model;


/*
*
* 用于储存销售单的信息
*
*
* */


public class SalesOrder {
    private int salesOrderId;  //销售单id
    private int employeeId;   //收营员
    private int  vipId; //会员号
    private int waterNumId;  //流水单号    和 CustomerChoosedMenu类的  waterNumId相对应
    private float sumPrice;        //总价
    private float discountSumPrice;   //折后价
    private String time;    //销售时间


	public SalesOrder(){}


	public SalesOrder(int salesOrderId, int employeeId, int vipId, int waterNumId, float sumPrice, float discountSumPrice, String time) {
		this.salesOrderId = salesOrderId;
		this.employeeId = employeeId;
		this.vipId = vipId;
		this.waterNumId = waterNumId;
		this.sumPrice = sumPrice;
		this.discountSumPrice = discountSumPrice;
		this.time = time;
	}

	public SalesOrder(int employeeId, int vipId, int waterNumId, float sumPrice, float discountSumPrice, String time) {
		this.employeeId = employeeId;
		this.vipId = vipId;
		this.waterNumId = waterNumId;
		this.sumPrice = sumPrice;
		this.discountSumPrice = discountSumPrice;
		this.time = time;
	}


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

	public int getVipId() {
		return vipId;
	}

	public void setVipId(int vipId) {
		this.vipId = vipId;
	}

	public int getWaterNumId() {
		return waterNumId;
	}

	public void setWaterNumId(int waterNumId) {
		this.waterNumId = waterNumId;
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
}
