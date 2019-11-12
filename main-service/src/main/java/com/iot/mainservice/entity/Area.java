package com.iot.mainservice.entity;

import javax.persistence.*;
/**
 * 区域
 */
@Entity
@Table(name = "area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String name;
    private  Integer pid;
    private  Integer lv;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getId() {
        return this.id;
    }

    public  String getName() {
        return this.name;
    }

    public  Integer getPid() {
        return this.pid;
    }

    public  Integer getLv() {
        return this.lv;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", lv=" + lv +
                '}';
    }
}
