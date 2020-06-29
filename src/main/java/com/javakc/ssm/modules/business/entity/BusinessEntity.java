package com.javakc.ssm.modules.business.entity;

import com.javakc.ssm.base.entity.BaseEntity;

import java.util.Date;

/**
 * 数据字典模块实体类
 * @author javakc
 * @version 0.1
 */
public class BusinessEntity extends BaseEntity<BusinessEntity>{
    /** id */

    private int id ;
    /** 年费 */
    private String annualFee ;
    /** 电子资源经费 */
    private String resourceFee ;
    /** 采购时间 */
    private Date purchaseTime ;
    /** 采购级别 1:不确定2:重要3:一般4:跟进 */
    private int purchaseRank ;
    /** 采购方式 1:不确定2:单独采购3:联合采购 */
    private int purchaseWay ;
    /** 采购途径 1:不确定2:直接采购3:招标采购4:代理采购 */
    private int purchaseApproach ;
    /** 审核状态 1:未审核2:审核中3:已审核 */
    private int auditCondition ;
    /** 跟进状态 1:初访2:意向3:潜在4:报价5:成交6:暂时搁置 */
    private int followCondition ;
    /** 阶段状态 1:初步接洽2:需求确定.3:方案/报价4:谈判/合同5:赢单 */
    private int stageCondition ;
    /** 商机提醒 1:是2:否 */
    private int businessRemind ;
    /** 备注信息 */
    private String remarkMessage ;
    /** 外键：机构的id */
    private int organizationId ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnnualFee() {
        return annualFee;
    }

    public void setAnnualFee(String annualFee) {
        this.annualFee = annualFee;
    }

    public String getResourceFee() {
        return resourceFee;
    }

    public void setResourceFee(String resourceFee) {
        this.resourceFee = resourceFee;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public int getPurchaseRank() {
        return purchaseRank;
    }

    public void setPurchaseRank(int purchaseRank) {
        this.purchaseRank = purchaseRank;
    }

    public int getPurchaseWay() {
        return purchaseWay;
    }

    public void setPurchaseWay(int purchaseWay) {
        this.purchaseWay = purchaseWay;
    }

    public int getPurchaseApproach() {
        return purchaseApproach;
    }

    public void setPurchaseApproach(int purchaseApproach) {
        this.purchaseApproach = purchaseApproach;
    }

    public int getAuditCondition() {
        return auditCondition;
    }

    public void setAuditCondition(int auditCondition) {
        this.auditCondition = auditCondition;
    }

    public int getFollowCondition() {
        return followCondition;
    }

    public void setFollowCondition(int followCondition) {
        this.followCondition = followCondition;
    }

    public int getStageCondition() {
        return stageCondition;
    }

    public void setStageCondition(int stageCondition) {
        this.stageCondition = stageCondition;
    }

    public int getBusinessRemind() {
        return businessRemind;
    }

    public void setBusinessRemind(int businessRemind) {
        this.businessRemind = businessRemind;
    }

    public String getRemarkMessage() {
        return remarkMessage;
    }

    public void setRemarkMessage(String remarkMessage) {
        this.remarkMessage = remarkMessage;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }
}
