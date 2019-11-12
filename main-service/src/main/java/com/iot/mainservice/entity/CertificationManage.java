package com.iot.mainservice.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "certification_manage", schema = "eovademo_test3.27")
public class CertificationManage {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "certificate_number", nullable = true, length = 50)
    private String certificateNumber;

    @Basic
    @Column(name = "production_unit", nullable = true, length = 50)
    private String productionUnit;
    @Basic
    @Column(name = "name_of_origin", nullable = true, length = 50)
    private String nameOfOrigin;
    @Basic
    @Column(name = "address_of_origin", nullable = true, length = 50)
    private String addressOfOrigin;
    @Basic
    @Column(name = "contact_person", nullable = true, length = 50)
    private String contactPerson;
    @Basic
    @Column(name = "telephone", nullable = true, length = 50)
    private String telephone;
    @Basic
    @Column(name = "product_name", nullable = true, length = 50)
    private String productName;
    @Basic
    @Column(name = "scale_of_origin", nullable = true, length = 50)
    private String scaleOfOrigin;
    @Basic
    @Column(name = "date_of_issue", nullable = true)
    private Date dateOfIssue;
    @Basic
    @Column(name = "certificate_validity", nullable = true)
    private Date certificateValidity;
    @Basic
    @Column(name = "issuing_unit", nullable = true, length = 50)
    private String issuingUnit;
    @Basic
    @Column(name = "remarks", nullable = true, length = 255)
    private String remarks;
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


    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getProductionUnit() {
        return productionUnit;
    }

    public void setProductionUnit(String productionUnit) {
        this.productionUnit = productionUnit;
    }

    public String getNameOfOrigin() {
        return nameOfOrigin;
    }

    public void setNameOfOrigin(String nameOfOrigin) {
        this.nameOfOrigin = nameOfOrigin;
    }

    public String getAddressOfOrigin() {
        return addressOfOrigin;
    }

    public void setAddressOfOrigin(String addressOfOrigin) {
        this.addressOfOrigin = addressOfOrigin;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getScaleOfOrigin() {
        return scaleOfOrigin;
    }

    public void setScaleOfOrigin(String scaleOfOrigin) {
        this.scaleOfOrigin = scaleOfOrigin;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getCertificateValidity() {
        return certificateValidity;
    }

    public void setCertificateValidity(Date certificateValidity) {
        this.certificateValidity = certificateValidity;
    }

    public String getIssuingUnit() {
        return issuingUnit;
    }

    public void setIssuingUnit(String issuingUnit) {
        this.issuingUnit = issuingUnit;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        CertificationManage that = (CertificationManage) o;
        return id == that.id &&
                Objects.equals(certificateNumber, that.certificateNumber) &&
                Objects.equals(productionUnit, that.productionUnit) &&
                Objects.equals(nameOfOrigin, that.nameOfOrigin) &&
                Objects.equals(addressOfOrigin, that.addressOfOrigin) &&
                Objects.equals(contactPerson, that.contactPerson) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(scaleOfOrigin, that.scaleOfOrigin) &&
                Objects.equals(dateOfIssue, that.dateOfIssue) &&
                Objects.equals(certificateValidity, that.certificateValidity) &&
                Objects.equals(issuingUnit, that.issuingUnit) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(areaId, that.areaId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, certificateNumber, productionUnit, nameOfOrigin, addressOfOrigin, contactPerson, telephone, productName, scaleOfOrigin, dateOfIssue, certificateValidity, issuingUnit, remarks, orgId, areaId);
    }
}
