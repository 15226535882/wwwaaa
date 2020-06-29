package com.javakc.ssm.modules.afterlog.entity;


import com.javakc.ssm.base.entity.BaseEntity;
import com.javakc.ssm.modules.organization.entity.OrganizationEntity;

import java.util.Date;

/**
 * 售后日志实体类
 */
public class AfterlogEntity extends BaseEntity<AfterlogEntity> {
      private String afterTitle;
      private String afterType;
      private String afterContent;
      private String processingStatus;
      private Date releaseDate;
      private Date closedDate;
//      OrganizationEntity organizationEntity;
//      EmployeeEntity employeeEntity;

     public String getAfterTitle() {
          return afterTitle;
     }

     public void setAfterTitle(String afterTitle) {
          this.afterTitle = afterTitle;
     }

     public String getAfterType() {
          return afterType;
     }

     public void setAfterType(String afterType) {
          this.afterType = afterType;
     }

     public String getAfterContent() {
          return afterContent;
     }

     public void setAfterContent(String afterContent) {
          this.afterContent = afterContent;
     }

     public String getProcessingStatus() {
          return processingStatus;
     }

     public void setProcessingStatus(String processingStatus) {
          this.processingStatus = processingStatus;
     }

     public Date getReleaseDate() {
          return releaseDate;
     }

     public void setReleaseDate(Date releaseDate) {
          this.releaseDate = releaseDate;
     }

     public Date getClosedDate() {
          return closedDate;
     }

     public void setClosedDate(Date closedDate) {
          this.closedDate = closedDate;
     }
}
