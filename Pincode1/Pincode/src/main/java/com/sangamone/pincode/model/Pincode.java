package com.sangamone.pincode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="pincode11")
public class Pincode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String circlename;
	private String regionname;
	private String divisionname;
	private String officename;
	private String pincode;
	private String officetype;
	private String delivery;
	private String district;
	private String statename;
	public Pincode(int id, String circlename, String regionname, String divisionname, String officename, String pincode,
			String officetype, String delivery, String district, String statename) {
		super();
		this.id = id;
		this.circlename = circlename;
		this.regionname = regionname;
		this.divisionname = divisionname;
		this.officename = officename;
		this.pincode = pincode;
		this.officetype = officetype;
		this.delivery = delivery;
		this.district = district;
		this.statename = statename;
	}
	public Pincode() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pincode [id=" + id + ", circlename=" + circlename + ", regionname=" + regionname + ", divisionname="
				+ divisionname + ", officename=" + officename + ", pincode=" + pincode + ", officetype=" + officetype
				+ ", delivery=" + delivery + ", district=" + district + ", statename=" + statename + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCirclename() {
		return circlename;
	}
	public void setCirclename(String circlename) {
		this.circlename = circlename;
	}
	public String getRegionname() {
		return regionname;
	}
	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}
	public String getDivisionname() {
		return divisionname;
	}
	public void setDivisionname(String divisionname) {
		this.divisionname = divisionname;
	}
	public String getOfficename() {
		return officename;
	}
	public void setOfficename(String officename) {
		this.officename = officename;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getOfficetype() {
		return officetype;
	}
	public void setOfficetype(String officetype) {
		this.officetype = officetype;
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
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	
	

}
