package model;

/*
*
* 桌子类
*
* */


public class RestaurantTables {



    private int tableId;   //桌子编号
    private int status;   //桌子状态    1  表示占用   0  表示 未被占用


    public RestaurantTables() {

    }
    public RestaurantTables(int tableId, int status) {
        this.tableId = tableId;
        this.status = status;
    }



    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
