package com.javakc.ssm.modules.organization.entity;

import com.javakc.ssm.base.entity.BaseEntity;
import com.javakc.ssm.modules.employee.entity.EmployeeEntity;

public class LiuContractEntity extends BaseEntity<LiuContractEntity> {
    private int id ;
    private EmployeeEntity employeeEntity;

    /** 姓名 */
    private String name ;
    /** 性别 1男2女 */
    private int sex ;
    /** 职务 */
    private String duty ;
    /** 手机 */
    private String mobilePhone ;
    /** 电话 */
    private String phone ;
    /** 传真 */
    private String fax ;
    /** 邮箱 */
    private String mail ;
    /** QQ */
    private String qq ;
    /** 微信 */
    private String wechat ;
    /** 地址 */
    private String address ;
    /** 重要等级 1一般2重要3非常重要 */
    private String importantGrade ;
    /** 跟进状态 1未处理2有效3无效4放弃 */
    private int followStatus ;
    /** 经办人 */
    private String agent ;
    /** 是否认可 1是2否 */
    private String ifAccept ;
    /** 认可理由 */
    private String acceptReason ;
    /** 信息来源 */
    private String origin ;
    /** 备注 */
    private String rank ;
    /** 外键1：机构的id */
    private int organizationId ;
    /** 外键2：员工的id（经办人） */
    private int employeeId ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImportantGrade() {
        return importantGrade;
    }

    public void setImportantGrade(String importantGrade) {
        this.importantGrade = importantGrade;
    }

    public int getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(int followStatus) {
        this.followStatus = followStatus;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getIfAccept() {
        return ifAccept;
    }

    public void setIfAccept(String ifAccept) {
        this.ifAccept = ifAccept;
    }

    public String getAcceptReason() {
        return acceptReason;
    }

    public void setAcceptReason(String acceptReason) {
        this.acceptReason = acceptReason;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
