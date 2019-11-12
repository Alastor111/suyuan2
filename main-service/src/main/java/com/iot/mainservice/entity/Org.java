package com.iot.mainservice.entity;

import javax.persistence.*;

/**
 * 企业
 */
@Entity
@Table(name = "org")
public class Org {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String name;
    private  String fullname;
    private  String code;
    private  String contact;
    private  String phone;
    private  String telephone;
    private  String addr;
    private  String description;
    private  Integer orgwl_id;
    private  String filed_zy;
    private  String filed_lz;
    private  String filed_cb;
    @Column(name = "area_id")
    private String areaId;

    @Override
    public String toString() {
        return "Org{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", code='" + code + '\'' +
                ", contact='" + contact + '\'' +
                ", phone='" + phone + '\'' +
                ", telephone='" + telephone + '\'' +
                ", addr='" + addr + '\'' +
                ", description='" + description + '\'' +
                ", orgwl_id=" + orgwl_id +
                ", filed_zy='" + filed_zy + '\'' +
                ", filed_lz='" + filed_lz + '\'' +
                ", filed_cb='" + filed_cb + '\'' +
                ", areaId='" + areaId + '\'' +
                ", area=" + area +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrgwl_id(Integer orgwl_id) {
        this.orgwl_id = orgwl_id;
    }

    public void setFiled_zy(String filed_zy) {
        this.filed_zy = filed_zy;
    }

    public void setFiled_lz(String filed_lz) {
        this.filed_lz = filed_lz;
    }

    public void setFiled_cb(String filed_cb) {
        this.filed_cb = filed_cb;
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

    @OneToOne(targetEntity = Area.class)
    @JoinColumn(name = "area_id",referencedColumnName = "id",insertable = false,updatable = false)
    private Area area;

    public  Integer getId() {
        return this.id;
    }

    public  String getName() {
        return this.name;
    }

    public  String getFullname() {
        return this.fullname;
    }

    public  String getCode() {
        return this.code;
    }

    public  String getContact() {
        return this.contact;
    }

    public  String getPhone() {
        return this.phone;
    }

    public  String getTelephone() {
        return this.telephone;
    }

    public  String getAddr() {
        return this.addr;
    }

    public  String getDescription() {
        return this.description;
    }

    public  Integer getOrgwl_id() {
        return this.orgwl_id;
    }

    public  String getFiled_zy() {
        return this.filed_zy;
    }

    public  String getFiled_lz() {
        return this.filed_lz;
    }

    public  String getFiled_cb() {
        return this.filed_cb;
    }

    public  String getAreaId() {
        return this.areaId;
    }

}
