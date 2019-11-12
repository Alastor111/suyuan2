package com.iot.mainservice.entity;

import javax.persistence.*;

/**
 * 质量标准类型
 */
@Entity
@Table(name = "dicts")
public class QualityStandardType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String value;
    private String object;
    private String field;
    private  String name;

    public  Integer getId() {
        return this.id;
    }

    
    public  String getValue() {
        return this.value;
    }

    
    public  String getName() {
        return this.name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "QualityStandardType{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", object='" + object + '\'' +
                ", field='" + field + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
