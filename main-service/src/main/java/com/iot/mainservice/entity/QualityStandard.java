package com.iot.mainservice.entity;

import javax.persistence.*;

/**
 * 质量标准
 */
@Entity
@Table(name = "quality_standard")
public  class QualityStandard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String type;

    private String decribe;

    @Column(name = "org_id")
    private Integer orgId;
    @OneToOne(targetEntity = Org.class)
    @JoinColumn(name="org_id",referencedColumnName="id",insertable = false,updatable = false)
    private Org org;
    @Column(name = "area_id")
    private String areaId;
    @OneToOne(targetEntity = Area.class)
    @JoinColumn(name = "area_id",referencedColumnName = "id",insertable = false,updatable = false)
    private Area area;

    @Override
    public String toString() {
        return "QualityStandard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", decribe='" + decribe + '\'' +
                ", orgId=" + orgId +
                ", org=" + org +
                ", areaId='" + areaId + '\'' +
                ", area=" + area +
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDecribe(String decribe) {
        this.decribe = decribe;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Integer getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }


    public String getType() {
        return this.type;
    }


    public String getDecribe() {
        return this.decribe;
    }


    public Org getOrg() {
        return this.org;
    }


    public Area getArea() {
        return this.area;
    }

}
