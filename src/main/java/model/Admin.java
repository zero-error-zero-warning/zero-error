package model;


/*
* 管理员类
*
*
* */
public class Admin {

    private int adminId;    //管理员id
    private String name;    //管理员姓名
    private String phoneNum;   //管理员电话
    private String password;   //管理员密码

    public Admin() {
        super();
    }

    public Admin(int adminId, String name, String phoneNum, String password) {
        this.adminId = adminId;
        this.name = name;
        this.phoneNum = phoneNum;
        this.password = password;
    }


    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
