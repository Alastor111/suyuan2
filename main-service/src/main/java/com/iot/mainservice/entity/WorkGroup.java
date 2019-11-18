package com.iot.mainservice.entity;

import javax.persistence.*;
/**
 * 工作组
 */
@Entity
@Table(name = "workgroup")
public class WorkGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    
    private  String code;
    
    private  String name;
    
    private  String description;


    @Column(name = "org_id")
    private Integer orgId;

    @Column(name = "area_id")
    private String areaId;

    @Column(name = "factory_id")
    private Integer factoryId;
    @OneToOne
    @JoinColumn(name = "factory_id",referencedColumnName = "id",insertable = false,updatable = false)
    private  Factory factory;

    @Override
    public String toString() {
        return "WorkGroup{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", orgId=" + orgId +
                ", areaId='" + areaId + '\'' +
                ", factoryId=" + factoryId +
                ", factory=" + factory +
                '}';
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

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }
}
