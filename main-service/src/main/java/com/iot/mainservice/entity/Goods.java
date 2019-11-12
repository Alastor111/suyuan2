package com.iot.mainservice.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 农资入库
 */
@Entity
@Table(name = "goods")
public class Goods implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String imgurl;//图片
    private String code;//编号
    private String name;//名称
    private Integer totality;//总量
    private Integer num;//剩余数量
    private Integer alarmvalue;//预警值
    private String unit;//计量单位

    private Integer agriculturaltypeId;//农资类型
    @JoinColumn(name = "agriculturaltypeId",referencedColumnName = "id",insertable = false,updatable = false)
    @OneToOne
    private AgriculturalType agriculturalType;

    private String toxicity;//毒性
    private String usagemethod;//使用方法
    private String dosage;//剂型

    private String applysituation;//适用情况
    private String classification;//种类
    private String type;//类型
    private String category;//类别
    private String texture;//材质
    private String powertype;//动力类型
    private Integer price;//价格
    private Date buydate; //购买日期
    private String rfid; //RFID标签号

    private Integer store_id;
    @JoinColumn(name = "store_id",referencedColumnName = "id",insertable = false,updatable = false)
    @OneToOne
    private Store store;

    private Integer supplier_id;
    @JoinColumn(name = "supplier_id",referencedColumnName = "id",insertable = false,updatable = false)
    @OneToOne
    private Supplier supplier;

    private String quality_standard_id;
    @JoinColumn(name = "quality_standard_id",referencedColumnName = "id",insertable = false,updatable = false)
    @OneToOne
    private QualityStandard qualityStandard;

    @Column(name = "org_id")
    private Integer orgId;
    @OneToOne(targetEntity = Org.class)
    @JoinColumn(name="org_id",referencedColumnName="id",insertable = false,updatable = false)
    private Org org;
    @Column(name = "area_id")
    private String areaId;
    @OneToOne(targetEntity = Area.class)
    @JoinColumn(name = "area_id",referencedColumnName = "id",insertable = false,updatable = false)
    private Area area;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", imgurl='" + imgurl + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", totality=" + totality +
                ", num=" + num +
                ", alarmvalue=" + alarmvalue +
                ", unit='" + unit + '\'' +
                ", agriculturaltypeId=" + agriculturaltypeId +
                ", agriculturalType=" + agriculturalType +
                ", toxicity='" + toxicity + '\'' +
                ", usagemethod='" + usagemethod + '\'' +
                ", dosage='" + dosage + '\'' +
                ", applysituation='" + applysituation + '\'' +
                ", classification='" + classification + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", texture='" + texture + '\'' +
                ", powertype='" + powertype + '\'' +
                ", price=" + price +
                ", buydate=" + buydate +
                ", rfid='" + rfid + '\'' +
                ", store_id=" + store_id +
                ", store=" + store +
                ", supplier_id=" + supplier_id +
                ", supplier=" + supplier +
                ", quality_standard_id='" + quality_standard_id + '\'' +
                ", qualityStandard=" + qualityStandard +
                ", orgId=" + orgId +
                ", org=" + org +
                ", areaId='" + areaId + '\'' +
                ", area=" + area +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
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

    public Integer getTotality() {
        return totality;
    }

    public void setTotality(Integer totality) {
        this.totality = totality;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getAlarmvalue() {
        return alarmvalue;
    }

    public void setAlarmvalue(Integer alarmvalue) {
        this.alarmvalue = alarmvalue;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getAgriculturaltypeId() {
        return agriculturaltypeId;
    }

    public void setAgriculturaltypeId(Integer agriculturaltypeId) {
        this.agriculturaltypeId = agriculturaltypeId;
    }

    public AgriculturalType getAgriculturalType() {
        return agriculturalType;
    }

    public void setAgriculturalType(AgriculturalType agriculturalType) {
        this.agriculturalType = agriculturalType;
    }

    public String getToxicity() {
        return toxicity;
    }

    public void setToxicity(String toxicity) {
        this.toxicity = toxicity;
    }

    public String getUsagemethod() {
        return usagemethod;
    }

    public void setUsagemethod(String usagemethod) {
        this.usagemethod = usagemethod;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getApplysituation() {
        return applysituation;
    }

    public void setApplysituation(String applysituation) {
        this.applysituation = applysituation;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getPowertype() {
        return powertype;
    }

    public void setPowertype(String powertype) {
        this.powertype = powertype;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public Integer getStore_id() {
        return store_id;
    }

    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getQuality_standard_id() {
        return quality_standard_id;
    }

    public void setQuality_standard_id(String quality_standard_id) {
        this.quality_standard_id = quality_standard_id;
    }

    public QualityStandard getQualityStandard() {
        return qualityStandard;
    }

    public void setQualityStandard(QualityStandard qualityStandard) {
        this.qualityStandard = qualityStandard;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
