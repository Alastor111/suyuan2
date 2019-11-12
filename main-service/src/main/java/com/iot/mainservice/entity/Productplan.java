package com.iot.mainservice.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Productplan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "code", nullable = true, length = 255)
    private String code;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "type_id", nullable = true)
    private Integer typeId;
    @Basic
    @Column(name = "begindate", nullable = true)
    private Date beginDate;
    @Basic
    @Column(name = "enddate", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "batch_id", nullable = true)
    private Integer batchId;
    @JoinColumn(name = "batch_id",referencedColumnName = "id",insertable = false,updatable = false)
    @OneToOne
    private Productbatch productbatch;
    @Basic
    @Column(name = "img", nullable = true, length = 100)
    private String img;
    @Basic
    @Column(name = "state", nullable = true)
    private Integer state;

    @Basic
    @Column(name = "user_id", nullable = true)
    private Integer userId;
    @Basic
    @Column(name = "group_id", nullable = true)
    private Integer groupId;
    @Basic
    @Column(name = "good_id", nullable = true)
    private Integer goodId;
    @Basic
    @Column(name = "dosage", nullable = true, precision = 0)
    private Double dosage;
    @Basic
    @Column(name = "unit_id", nullable = true)
    private Integer unitId;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    @Basic
    @Column(name = "area_id", nullable = false, length = 11)
    private String areaId;



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




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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


    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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


    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }


    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }


    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
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
        Productplan that = (Productplan) o;
        return id == that.id &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(typeId, that.typeId) &&
                Objects.equals(beginDate, that.beginDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(batchId, that.batchId) &&
                Objects.equals(img, that.img) &&
                Objects.equals(state, that.state) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(goodId, that.goodId) &&
                Objects.equals(dosage, that.dosage) &&
                Objects.equals(unitId, that.unitId) &&
                Objects.equals(areaId, that.areaId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, code, name, typeId, beginDate, endDate, batchId, img, state, orgId, userId, groupId, goodId, dosage, unitId, areaId);
    }

    public Productbatch getProductbatch() {
        return productbatch;
    }

    public void setProductbatch(Productbatch productbatch) {
        this.productbatch = productbatch;
    }
}
