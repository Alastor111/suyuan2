package com.iot.mainservice.entity;

import javax.persistence.*;
/**
 * 生产车间
 */
@Entity
@Table(name = "farm")
public class Farm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column
    
    private  String code;
    @Column
    
    private  String name;
    @Column
    private  Integer factory_id;
    @Column
    private  Integer ispfield_id;
    @Column
    private  Integer collector_ids;
    @Column
    private  Integer baseinfo_id;
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
        return "Farm{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", factory_id=" + factory_id +
                ", ispfield_id=" + ispfield_id +
                ", collector_ids=" + collector_ids +
                ", baseinfo_id=" + baseinfo_id +
                ", orgId=" + orgId +
                ", org=" + org +
                ", areaId='" + areaId + '\'' +
                ", area=" + area +
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

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    public Integer getIspfield_id() {
        return ispfield_id;
    }

    public void setIspfield_id(Integer ispfield_id) {
        this.ispfield_id = ispfield_id;
    }

    public Integer getCollector_ids() {
        return collector_ids;
    }

    public void setCollector_ids(Integer collector_ids) {
        this.collector_ids = collector_ids;
    }

    public Integer getBaseinfo_id() {
        return baseinfo_id;
    }

    public void setBaseinfo_id(Integer baseinfo_id) {
        this.baseinfo_id = baseinfo_id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
