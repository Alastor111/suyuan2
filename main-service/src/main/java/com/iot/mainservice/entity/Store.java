package com.iot.mainservice.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 仓库
 */
@Table(name = "store")
@Entity
public class Store implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private String name;

    private String address;

    private Integer factory_id;
    @JoinColumn(name = "factory_id",referencedColumnName = "id",insertable = false,updatable = false)
    @OneToOne
    private Factory factory;

    private Integer user_id;//管理员

    private String phone;

    @Column(name = "org_id")
    private Integer orgId;

    @Column(name = "area_id")
    private String areaId;


    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", factory_id=" + factory_id +
                ", factory=" + factory +
                ", user_id=" + user_id +
                ", phone='" + phone + '\'' +
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Integer factory_id) {
        this.factory_id = factory_id;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
