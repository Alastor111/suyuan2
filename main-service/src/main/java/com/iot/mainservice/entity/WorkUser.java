package com.iot.mainservice.entity;

import javax.persistence.*;
/**
 * 工作人员
 */
@Entity
@Table(name = "workuser")
public  class WorkUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    
    private  String name;
    @Column(name = "cardnum")
    private  String cardNum;
    
    private  String phone;
    private  Integer sex;
    @Column(name = "group_id")
    private Integer workGroupId;
//    @OneToOne(targetEntity = WorkGroup.class)
//    @JoinColumn(name="group_id",referencedColumnName="id",insertable = false,updatable = false)
//    private WorkGroup workGroup;
    
    private  String imgurl;

    @Column(name = "org_id")
    private Integer orgId;

    @Column(name = "area_id")
    private String areaId;


    @Override
    public String toString() {
        return "WorkUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardNum='" + cardNum + '\'' +
                ", phone='" + phone + '\'' +
                ", sex=" + sex +
                ", workGroupId=" + workGroupId +
                ", imgurl='" + imgurl + '\'' +
                ", orgId=" + orgId +
                ", areaId='" + areaId + '\'' +
                '}';
    }

    public Integer getWorkGroupId() {
        return workGroupId;
    }

    public void setWorkGroupId(Integer workGroupId) {
        this.workGroupId = workGroupId;
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

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }


    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }


    public  Integer getId() {
        return this.id;
    }


    public  String getName() {
        return this.name;
    }


    public  String getCardNum() {
        return this.cardNum;
    }


    public  String getPhone() {
        return this.phone;
    }

    public  Integer getSex() {
        return this.sex;
    }

    public  String getImgurl() {
        return this.imgurl;
    }


}
