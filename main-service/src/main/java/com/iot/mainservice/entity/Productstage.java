package com.iot.mainservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Productstage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "batch_id", nullable = true)
    private Integer batchId;
    @Basic
    @Column(name = "timeslot", nullable = true, length = 100)
    private String timeslot;
    @Basic
    @Column(name = "img", nullable = true, length = 100)
    private String img;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    @Basic
    @Column(name = "area_id", nullable = false, length = 11)
    private String areaId;
    @JoinColumn(name = "batch_id",referencedColumnName = "id",insertable = false,updatable = false)
    @OneToOne
    private Productbatch productbatch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }


    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Productstage that = (Productstage) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(batchId, that.batchId) &&
                Objects.equals(timeslot, that.timeslot) &&
                Objects.equals(img, that.img) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(areaId, that.areaId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, batchId, timeslot, img, orgId, areaId);
    }

    public Productbatch getProductbatch() {
        return productbatch;
    }

    public void setProductbatch(Productbatch productbatch) {
        this.productbatch = productbatch;
    }
}
