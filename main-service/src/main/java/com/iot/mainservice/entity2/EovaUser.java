package com.iot.mainservice.entity2;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "eova_user")
public class EovaUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    @Column(name = "login_id", nullable = true, length = 30)
    private String loginId;
    @Basic
    @Column(name = "login_pwd", nullable = true, length = 50)
    private String loginPwd;
    @Basic
    @Column(name = "rid", nullable = false)
    private Integer rid;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;
    @Basic
    @Column(name = "orgwl_id", nullable = true)
    private Integer orgwlId;
    @Basic
    @Column(name = "area_id", nullable = true)
    private Integer areaId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }


    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }


    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }


    public Integer getOrgwlId() {
        return orgwlId;
    }

    public void setOrgwlId(Integer orgwlId) {
        this.orgwlId = orgwlId;
    }


    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EovaUser eovaUser = (EovaUser) o;
        return id == eovaUser.id &&
                rid == eovaUser.rid &&
                Objects.equals(loginId, eovaUser.loginId) &&
                Objects.equals(loginPwd, eovaUser.loginPwd) &&
                Objects.equals(orgId, eovaUser.orgId) &&
                Objects.equals(orgwlId, eovaUser.orgwlId) &&
                Objects.equals(areaId, eovaUser.areaId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, loginId, loginPwd, rid, orgId, orgwlId, areaId);
    }
}
