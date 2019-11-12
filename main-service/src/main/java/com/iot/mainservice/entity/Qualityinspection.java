package com.iot.mainservice.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * 质检信息
 */
@Entity
public class Qualityinspection {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "retrospect_id", nullable = true)
    private Integer retrospectId;
    @Basic
    @Column(name = "sendname", nullable = true, length = 100)
    private String sendName;
    @Basic
    @Column(name = "unitname", nullable = true, length = 100)
    private String unitName;
    @Basic
    @Column(name = "state", nullable = true)
    private Integer state;
    @Basic
    @Column(name = "imgurl", nullable = true, length = 255)
    private String imgUrl;
    @Basic
    @Column(name = "cardurl", nullable = true, length = 255)
    private String cardUrl;
    @Basic
    @Column(name = "workusername", nullable = true, length = 100)
    private Integer workUserName;

    @Basic
    @Column(name = "remain", nullable = true, length = 255)
    private String remain;
    @Basic
    @Column(name = "mouthfeel", nullable = true, length = 100)
    private String mouthFeel;

    @Basic
    @Column(name = "time", nullable = true)
    private Date time;

    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;
    @Basic
    @Column(name = "specttype", nullable = true, length = 255)
    private String spectType;
    @Basic
    @Column(name = "area_id", nullable = false, length = 11)
    private String areaId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getRetrospectId() {
        return retrospectId;
    }

    public void setRetrospectId(Integer retrospectId) {
        this.retrospectId = retrospectId;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }


    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCardUrl() {
        return cardUrl;
    }

    public void setCardUrl(String cardUrl) {
        this.cardUrl = cardUrl;
    }


    public Integer getWorkUserName() {
        return workUserName;
    }

    public void setWorkUserName(Integer workUserName) {
        this.workUserName = workUserName;
    }

    public String getRemain() {
        return remain;
    }

    public void setRemain(String remain) {
        this.remain = remain;
    }


    public String getMouthFeel() {
        return mouthFeel;
    }

    public void setMouthFeel(String mouthFeel) {
        this.mouthFeel = mouthFeel;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }


    public String getSpectType() {
        return spectType;
    }

    public void setSpectType(String spectType) {
        this.spectType = spectType;
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
        Qualityinspection that = (Qualityinspection) o;
        return id == that.id &&
                Objects.equals(retrospectId, that.retrospectId) &&
                Objects.equals(sendName, that.sendName) &&
                Objects.equals(unitName, that.unitName) &&
                Objects.equals(state, that.state) &&
                Objects.equals(imgUrl, that.imgUrl) &&
                Objects.equals(cardUrl, that.cardUrl) &&
                Objects.equals(workUserName, that.workUserName) &&
                Objects.equals(remain, that.remain) &&
                Objects.equals(mouthFeel, that.mouthFeel) &&
                Objects.equals(time, that.time) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(spectType, that.spectType) &&
                Objects.equals(areaId, that.areaId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, retrospectId, sendName, unitName, state, imgUrl, cardUrl, workUserName, remain, mouthFeel, time, orgId, spectType, areaId);
    }
}
