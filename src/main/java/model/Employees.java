package model;


/*
*
*
*
*     员工类
*
*
*
* */
public class Employees {

    private int employeeId;     //员工编号
    private String name;      //员工姓名
    private String phoneNum;    //员工电话

	private String password;   //员工密码
    private String text;      //员工备注

	public Employees(String name, String phoneNum, String password, String text) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.password = password;
		this.text = text;
	}
    public Employees(int employeeId, String name, String phoneNum, String password, String text) {
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNum = phoneNum;
        this.password = password;
        this.text = text;
    }

    public Employees() {
        super();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
