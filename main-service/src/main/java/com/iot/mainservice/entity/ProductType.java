package com.iot.mainservice.entity;

import javax.persistence.*;

/**
 * 产品类型
 */
@Entity
@Table(name = "producttype")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private String name;

    private String description;
    @Column(name = "org_id")
    private Integer orgId;

    @Column(name = "area_id")
    private String areaId;


    @Override
    public String toString() {
        return "ProductType{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", orgId=" + orgId +
                ", areaId='" + areaId + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
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


    public Integer getId() {
        return this.id;
    }


    public String getCode() {
        return this.code;
    }


    public String getName() {
        return this.name;
    }


    public String getDescription() {
        return this.description;
    }



}
