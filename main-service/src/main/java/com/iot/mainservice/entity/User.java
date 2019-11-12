package com.iot.mainservice.entity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
/**
 * 登录用户
 */
public class User {
    private  Integer id;
    
    private  String login_id;

    private  Integer orgwl_id;
    private Integer orgId;
    @OneToOne(targetEntity = Org.class)
    @JoinColumn(name="orgId",referencedColumnName="id",insertable = false,updatable = false)
    private Org org;
    private String areaId;
    @OneToOne(targetEntity = Area.class)
    @JoinColumn(name = "areaId",referencedColumnName = "id",insertable = false,updatable = false)
    private Area area;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login_id='" + login_id + '\'' +
                ", orgwl_id=" + orgwl_id +
                ", orgId=" + orgId +
                ", org=" + org +
                ", areaId='" + areaId + '\'' +
                ", area=" + area +
                '}';
    }

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public void setOrgwl_id(Integer orgwl_id) {
        this.orgwl_id = orgwl_id;
    }

    public  Integer getId() {
        return this.id;
    }

    
    public  String getLogin_id() {
        return this.login_id;
    }

    public  Integer getOrgId() {
        return this.orgId;
    }

    public  Integer getOrgwl_id() {
        return this.orgwl_id;
    }

}
