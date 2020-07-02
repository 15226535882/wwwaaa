package com.javakc.ssm.modules.organization.entity;

import com.javakc.ssm.base.entity.BaseEntity;
import com.javakc.ssm.modules.business.entity.BusinessEntity;
import com.javakc.ssm.modules.org.tree.entity.OrgtreeEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

/**
 * 数据字典模块实体类
 * @author javakc
 * @version 0.1
 */
public class OrganizationEntity extends BaseEntity<OrganizationEntity>{
    private  int id;
    private List<BusinessEntity> businessEntity;

    public List<LiuContractEntity> getLiuContractEntities() {
        return liuContractEntities;
    }

    public void setLiuContractEntities(List<LiuContractEntity> liuContractEntities) {
        this.liuContractEntities = liuContractEntities;
    }

    private  List<LiuContractEntity> liuContractEntities;
    /** 机构名称 */
    private String organizationName;
    /** 机构地址 */
    private String organizationAddress;
    /** 手机 */

    /** 电话 */
    private String telephone ;
    /** 国家 */
    private int country ;


    public String getAhId() {
        return ahId;
    }

    public void setAhId(String ahId) {
        this.ahId = ahId;
    }
    private String province;
    private String city;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String ahId;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BusinessEntity> getBusinessEntity() {
        return businessEntity;
    }

    public void setBusinessEntity(List<BusinessEntity> businessEntity) {
        this.businessEntity = businessEntity;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }


    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getOrganizationLevel() {
        return organizationLevel;
    }

    public void setOrganizationLevel(int organizationLevel) {
        this.organizationLevel = organizationLevel;
    }

    public int getIndustryCategory() {
        return industryCategory;
    }

    public void setIndustryCategory(int industryCategory) {
        this.industryCategory = industryCategory;
    }

    public int getImportanceLevel() {
        return importanceLevel;
    }

    public void setImportanceLevel(int importanceLevel) {
        this.importanceLevel = importanceLevel;
    }

    public int getCompanyLevel() {
        return companyLevel;
    }

    public void setCompanyLevel(int companyLevel) {
        this.companyLevel = companyLevel;
    }

    public int getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(int areaLevel) {
        this.areaLevel = areaLevel;
    }
}
