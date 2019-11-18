package com.iot.mainservice.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 农资出库
 */
@Entity
@Table(name = "purpose")
public class Purpose implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;//编号
    private String phone;
    private Date use_time;//领用时间
    private Integer num;//数量
    private Integer use_num;//领用数量
    private Integer used_num;//实用数量
    private String purpose;//单位
    private String todo;//用途
    private Integer state;//是否归还
    private Date return_time;//归还时间

    private Integer good_id;
    @JoinColumn(name = "good_id",referencedColumnName = "id",insertable = false,updatable = false)
    @OneToOne
    private Goods goods;

    private String user_name;//领用人


    @Column(name = "org_id")
    private Integer orgId;

    @Column(name = "area_id")
    private String areaId;


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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getUse_time() {
        return use_time;
    }

    public void setUse_time(Date use_time) {
        this.use_time = use_time;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUse_num() {
        return use_num;
    }

    public void setUse_num(Integer use_num) {
        this.use_num = use_num;
    }

    public Integer getUsed_num() {
        return used_num;
    }

    public void setUsed_num(Integer used_num) {
        this.used_num = used_num;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getReturn_time() {
        return return_time;
    }

    public void setReturn_time(Date return_time) {
        this.return_time = return_time;
    }

    public Integer getGood_id() {
        return good_id;
    }

    public void setGood_id(Integer good_id) {
        this.good_id = good_id;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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



    @Override
    public String toString() {
        return "Purpose{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", phone='" + phone + '\'' +
                ", use_time=" + use_time +
                ", num=" + num +
                ", use_num=" + use_num +
                ", used_num=" + used_num +
                ", purpose='" + purpose + '\'' +
                ", todo='" + todo + '\'' +
                ", state=" + state +
                ", return_time=" + return_time +
                ", good_id=" + good_id +
                ", goods=" + goods +
                ", user_name='" + user_name + '\'' +
                ", orgId=" + orgId +
                ", areaId='" + areaId + '\'' +
                '}';
    }
}
