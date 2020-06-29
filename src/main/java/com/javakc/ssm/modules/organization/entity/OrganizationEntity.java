package com.javakc.ssm.modules.organization.entity;

import com.javakc.ssm.base.entity.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 数据字典模块实体类
 * @author javakc
 * @version 0.1
 */
public class OrganizationEntity extends BaseEntity<OrganizationEntity>{
    private  int id;
    /** 机构名称 */
    private String organizationName;
    /** 机构地址 */
    private String organizationAddress ;
    /** 手机 */
    private int phone ;
    /** 电话 */
    private String telephone ;
    /** 国家 */
    private int country ;
    /** 省份 */
    private String province ;
    /** 市名 */
    private String city ;
    /** 邮编 */
    private String zipCode ;
    /** 网站 */
    private String website ;
    /** 机构级别 */
    private int organizationLevel ;
    /** 行业类别 */
    private int industryCategory ;
    /** 重要级别 */
    private int importanceLevel ;
    /** 单位等级 */
    private int companyLevel ;
    /** 区域等级 */
    private int areaLevel ;


}
