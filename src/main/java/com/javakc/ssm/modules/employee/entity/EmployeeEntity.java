package com.javakc.ssm.modules.employee.entity;

import com.javakc.ssm.base.entity.BaseEntity;

/**
 * 数据字典模块实体类
 * @author javakc
 * @version 0.1
 */
public class EmployeeEntity extends BaseEntity<EmployeeEntity>{
    private int id ;
    /** 部门 */
    private int department ;
    /** 员工姓名 */
    private String employeeName ;
    /** 员工工号 */
    private String employeeCord ;
    /** 岗位名称 */
    private String positionName ;
    /** 岗位职责 */
    private String positionResponsibility ;
    /** 性别 */
    private int sex ;
    /** 工作电话 */
    private String jobPhone ;
    /** 手机号码 */
    private String phone ;
    /** 邮箱 */
    private String email ;
    /** 工作QQ */
    private String jobQq ;
    /** 短号 */
    private String shortCord ;
    /** 职责级别 */
    private int responsibilityLevel ;
    /** 职责类别 */
    private int responsibilityCategory ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCord() {
        return employeeCord;
    }

    public void setEmployeeCord(String employeeCord) {
        this.employeeCord = employeeCord;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionResponsibility() {
        return positionResponsibility;
    }

    public void setPositionResponsibility(String positionResponsibility) {
        this.positionResponsibility = positionResponsibility;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getJobPhone() {
        return jobPhone;
    }

    public void setJobPhone(String jobPhone) {
        this.jobPhone = jobPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobQq() {
        return jobQq;
    }

    public void setJobQq(String jobQq) {
        this.jobQq = jobQq;
    }

    public String getShortCord() {
        return shortCord;
    }

    public void setShortCord(String shortCord) {
        this.shortCord = shortCord;
    }

    public int getResponsibilityLevel() {
        return responsibilityLevel;
    }

    public void setResponsibilityLevel(int responsibilityLevel) {
        this.responsibilityLevel = responsibilityLevel;
    }

    public int getResponsibilityCategory() {
        return responsibilityCategory;
    }

    public void setResponsibilityCategory(int responsibilityCategory) {
        this.responsibilityCategory = responsibilityCategory;
    }

    public int getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(int employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public int getQuit() {
        return quit;
    }

    public void setQuit(int quit) {
        this.quit = quit;
    }

    public int getAllocationStatus() {
        return allocationStatus;
    }

    public void setAllocationStatus(int allocationStatus) {
        this.allocationStatus = allocationStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /** 员工状态 */
    private int employeeStatus ;
    /** 是否离职 */
    private int quit ;
    /** 分配状态 */
    private int allocationStatus ;
    /** 备注 */
    private String remark ;

}
