package model;

/*
*
* vip类
*
* */


public class Vip {

    private int vipId;    //会员id
    private String name;    //会员姓名
    private String phoneNum;   //会员手机号码
    private String gender;   //会员性别


	public Vip(String name, String phoneNum, String gender) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.gender = gender;
	}

	public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Vip() {
        super();
    }

    public Vip(int vipId, String name, String phoneNum) {
        this.vipId = vipId;
        this.name = name;
        this.phoneNum = phoneNum;
    }
    public int getVipId() {
        return vipId;
    }

    public void setVipId(int vipId) {
        this.vipId = vipId;
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

}
