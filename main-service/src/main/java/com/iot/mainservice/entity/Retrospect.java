package com.iot.mainservice.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * 溯源信息
 */
@Entity
public class Retrospect {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "backcode", nullable = true, length = 225)
    private String backCode;

    @Basic
    @Column(name = "local", nullable = true, length = 222)
    private String local;

    @Basic
    @Column(name = "isgmo", nullable = true)
    private Integer isGmo;

    @Basic
    @Column(name = "seedsource", nullable = true, length = 222)
    private String seedSource;

    @Basic
    @Column(name = "productiondate", nullable = true)
    private Date productionDate;
    @Basic
    @Column(name = "listedcompany", nullable = true)
    private Date listedCompany;
    @Basic
    @Column(name = "shelflife", nullable = true, length = 222)
    private String shelfLife;
    @Basic
    @Column(name = "isproduct", nullable = true)
    private Integer isProduct;
    @Basic
    @Column(name = "productproperty", nullable = true, length = 222)
    private String productProperty;
    @Basic
    @Column(name = "product_id", nullable = true)
    private Integer productId;
    @Basic
    @Column(name = "basicinfor_id", nullable = true)
    private Integer basicInforId;
    @Basic
    @Column(name = "label_type_id", nullable = true)
    private Integer labelTypeId;
    @Basic
    @Column(name = "productbatch_id", nullable = true)
    private Integer productBatchId;
    @Basic
    @Column(name = "freightage_id", nullable = true)
    private Integer freightageId;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;
    @Basic
    @Column(name = "address", nullable = true, length = 225)
    private String address;
    @Basic
    @Column(name = "url", nullable = true, length = 255)
    private String url;
    @Basic
    @Column(name = "area_id", nullable = false, length = 11)
    private String areaId;
    @Basic
    @Column(name = "browse_times", nullable = true)
    private Integer browseTimes;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getBackCode() {
        return backCode;
    }

    public void setBackCode(String backCode) {
        this.backCode = backCode;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getIsGmo() {
        return isGmo;
    }

    public void setIsGmo(Integer isGmo) {
        this.isGmo = isGmo;
    }

    public String getSeedSource() {
        return seedSource;
    }

    public void setSeedSource(String seedSource) {
        this.seedSource = seedSource;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }


    public Date getListedCompany() {
        return listedCompany;
    }

    public void setListedCompany(Date listedCompany) {
        this.listedCompany = listedCompany;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Integer getIsProduct() {
        return isProduct;
    }

    public void setIsProduct(Integer isProduct) {
        this.isProduct = isProduct;
    }

    public String getProductProperty() {
        return productProperty;
    }

    public void setProductProperty(String productProperty) {
        this.productProperty = productProperty;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBasicInforId() {
        return basicInforId;
    }

    public void setBasicInforId(Integer basicInforId) {
        this.basicInforId = basicInforId;
    }

    public Integer getLabelTypeId() {
        return labelTypeId;
    }

    public void setLabelTypeId(Integer labelTypeId) {
        this.labelTypeId = labelTypeId;
    }

    public Integer getProductBatchId() {
        return productBatchId;
    }

    public void setProductBatchId(Integer productBatchId) {
        this.productBatchId = productBatchId;
    }

    public Integer getFreightageId() {
        return freightageId;
    }

    public void setFreightageId(Integer freightageId) {
        this.freightageId = freightageId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }


    public Integer getBrowseTimes() {
        return browseTimes;
    }

    public void setBrowseTimes(Integer browseTimes) {
        this.browseTimes = browseTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Retrospect that = (Retrospect) o;
        return id == that.id &&
                Objects.equals(backCode, that.backCode) &&
                Objects.equals(local, that.local) &&
                Objects.equals(isGmo, that.isGmo) &&
                Objects.equals(seedSource, that.seedSource) &&
                Objects.equals(productionDate, that.productionDate) &&
                Objects.equals(listedCompany, that.listedCompany) &&
                Objects.equals(shelfLife, that.shelfLife) &&
                Objects.equals(isProduct, that.isProduct) &&
                Objects.equals(productProperty, that.productProperty) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(basicInforId, that.basicInforId) &&
                Objects.equals(labelTypeId, that.labelTypeId) &&
                Objects.equals(productBatchId, that.productBatchId) &&
                Objects.equals(freightageId, that.freightageId) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(address, that.address) &&
                Objects.equals(url, that.url) &&
                Objects.equals(areaId, that.areaId) &&
                Objects.equals(browseTimes, that.browseTimes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, backCode, local, isGmo, seedSource, productionDate, listedCompany, shelfLife, isProduct, productProperty, productId, basicInforId, labelTypeId, productBatchId, freightageId, orgId, address, url, areaId, browseTimes);
    }
}
