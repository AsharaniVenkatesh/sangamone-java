package com.sangamone.pincode6.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="allindiapincode")
public class Pincode {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	
	private int id;
	private String circleName;
	private String regionName;
	private String divisionName;
	private String officeName;
	private String pincode;
	private String officeType;
	private String delivery;
	private String district;
	private String stateName;
	public Pincode(int id, String circleName, String regionName, String divisionName, String officeName, String pincode,
			String officeType, String delivery, String district, String stateName) {
		super();
		this.id = id;
		this.circleName = circleName;
		this.regionName = regionName;
		this.divisionName = divisionName;
		this.officeName = officeName;
		this.pincode = pincode;
		this.officeType = officeType;
		this.delivery = delivery;
		this.district = district;
		this.stateName = stateName;
	}
	public Pincode() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getDivisionName() {
		return divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getOfficeType() {
		return officeType;
	}
	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}



}
