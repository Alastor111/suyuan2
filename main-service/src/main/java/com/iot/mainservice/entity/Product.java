package com.iot.mainservice.entity;

import javax.persistence.*;

/**
 * 产品管理
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;
    private String name;

    private Integer product_id;

    private Integer field_id;

    private String description;
    private String imgurl;

    private Integer isGMO;

    private String seedsource;

    private String quality_standard_id;

    @Column(name = "org_id")
    private Integer orgId;

    @Column(name = "area_id")
    private String areaId;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", product_id=" + product_id +
                ", field_id=" + field_id +
                ", description='" + description + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", isGMO=" + isGMO +
                ", seedsource='" + seedsource + '\'' +
                ", quality_standard_id='" + quality_standard_id + '\'' +
                ", orgId=" + orgId +
                ", areaId='" + areaId + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getField_id() {
        return field_id;
    }

    public void setField_id(Integer field_id) {
        this.field_id = field_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getIsGMO() {
        return isGMO;
    }

    public void setIsGMO(Integer isGMO) {
        this.isGMO = isGMO;
    }

    public String getSeedsource() {
        return seedsource;
    }

    public void setSeedsource(String seedsource) {
        this.seedsource = seedsource;
    }

    public String getQuality_standard_id() {
        return quality_standard_id;
    }

    public void setQuality_standard_id(String quality_standard_id) {
        this.quality_standard_id = quality_standard_id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }


    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }


}
