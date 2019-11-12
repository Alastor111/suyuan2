package com.iot.mainservice.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Productbatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "code", nullable = true, length = 255)
    private String code;
    @Basic
    @Column(name = "product_id", nullable = true)
    private Integer productId;
    @Basic
    @Column(name = "begindate", nullable = true)
    private Date beginDate;
    @Basic
    @Column(name = "enddate", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "state", nullable = true)
    private Integer state;
    @Basic
    @Column(name = "group_id", nullable = true)
    private Integer groupId;

    @Basic
    @Column(name = "user_id", nullable = true)
    private Integer userId;
    @Basic
    @Column(name = "yield", nullable = true)
    private Integer yield;
    @Basic
    @Column(name = "unit_id", nullable = true)
    private Integer unitId;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    @Basic
    @Column(name = "area_id", nullable = false, length = 11)
    private String areaId;

//    @OneToMany(targetEntity = Productplan.class)
//    @JoinColumn(name = "batch_id",referencedColumnName = "id",insertable = false,updatable = false)
//    private List<Productplan> productplans = new ArrayList<>();
//    @OneToMany(targetEntity = Productstage.class)
//    @JoinColumn(name = "batch_id",referencedColumnName = "id",insertable = false,updatable = false)
//    private List<Productstage> productstages = new ArrayList<>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }


    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }


    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }


    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public Integer getYield() {
        return yield;
    }

    public void setYield(Integer yield) {
        this.yield = yield;
    }


    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }


    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Productbatch that = (Productbatch) o;
        return id == that.id &&
                Objects.equals(code, that.code) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(beginDate, that.beginDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(state, that.state) &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(yield, that.yield) &&
                Objects.equals(unitId, that.unitId) &&
                Objects.equals(areaId, that.areaId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, code, productId, beginDate, endDate, state, groupId, orgId, userId, yield, unitId, areaId);
    }

}
