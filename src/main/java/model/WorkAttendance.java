package model;
/*
*
*员工考勤类
*
*
* */


public class WorkAttendance {
    private int workAttendanceId;          //考勤id
    private int employeeId;          //员工id             和员工类相关联
    private int startTime;   // 上班时间
    private int endTime;    //下班时间
    private int workTime;    //工作时长

    public WorkAttendance(int workAttendanceId, int employeeId, int startTime, int endTime, int workTime) {
        this.workAttendanceId = workAttendanceId;
        this.employeeId = employeeId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.workTime = workTime;
    }


    public WorkAttendance() {
        super();
    }

    public int getWorkAttendanceId() {
        return workAttendanceId;
    }

    public void setWorkAttendanceId(int workAttendanceId) {
        this.workAttendanceId = workAttendanceId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
