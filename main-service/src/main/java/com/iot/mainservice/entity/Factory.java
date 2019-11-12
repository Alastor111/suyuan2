package com.iot.mainservice.entity;

import javax.persistence.*;

/**
 /* 生产厂区
 */

@Entity
@Table(name = "factory")
public class Factory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String code;
	private String address;
	private String description;
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
		return "Factory{" +
				"id=" + id +
				", name='" + name + '\'' +
				", code='" + code + '\'' +
				", address='" + address + '\'' +
				", description='" + description + '\'' +
				", orgId=" + orgId +
				", org=" + org +
				", areaId='" + areaId + '\'' +
				", area=" + area +
				'}';
	}

	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCode()
	{
		return code;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public Integer getOrgId()
	{
		return orgId;
	}
	public void setOrgId(Integer orgId)
	{
		this.orgId = orgId;
	}
	public String getAreaId()
	{
		return areaId;
	}
	public void setAreaId(String areaId)
	{
		this.areaId = areaId;
	}


	public Org getOrg() {
		return org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
}