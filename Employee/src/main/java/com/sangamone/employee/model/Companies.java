package com.sangamone.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companies")
public class Companies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="company_id")
	private Integer companyId;

	@Column(name="company_name")
	private String companyName;	
	
	@Column(name="company_groupname")
	private String companyGroupName;
	
	@Column(name="company_countrycode")
	private String companyCountryCode;
	
	@Column(name="company_pincode")
	private Long companyPincode;
	
	@Column(name="isCustomer")
    private Long iscustomer;
	
	@Column(name="shortcode")
    private String shortcode;
	
	@Column(name="isPartner")
    private Long ispartner;
	
	@Column(name="timeT1",insertable=false,updatable=false)
    private Long timeT1;
	
	@Column(name="timeT2")
    private Long timeT2;
	
	@Column(name="partner_id")
    private Integer partnerId;
	
	@Column(name="isSuperPartner")
    private Long isSuperPartner;
	
	@Column(name="super_partnerId")
    private Long superPartnerId;
	
	@Column(name="account_id")
    private String accountId;
	
	@Column(name="maxLocations")
    private Integer maxLocations;
	
	@Column(name="maxPatients")
    private Long maxPatients;
	
	@Column(name="videolocation_id")
    private Integer videoLocationId;
	
	@Column(name="has_opd")
    private Integer hasOpd;
	
	@Column(name="currency_code")
    private String currencyCode;
	
	@Column(name="maxLoginAttempts")
    private Integer maxLoginAttempts;

	public Companies(Integer companyId, String companyName, String companyGroupName, String companyCountryCode,
			Long companyPincode, Long iscustomer, String shortcode, Long ispartner, Long timeT1,Long timeT2,
			Integer partnerId, Long isSuperPartner, Long superPartnerId, String accountId, Integer maxLocations,
			Long maxPatients, Integer videoLocationId, Integer hasOpd, String currencyCode, Integer maxLoginAttempts) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyGroupName = companyGroupName;
		this.companyCountryCode = companyCountryCode;
		this.companyPincode = companyPincode;
		this.iscustomer = iscustomer;
		this.shortcode = shortcode;
		this.ispartner = ispartner;
		this.timeT1 = timeT1;
		this.timeT2 = timeT2;
		this.partnerId = partnerId;
		this.isSuperPartner = isSuperPartner;
		this.superPartnerId = superPartnerId;
		this.accountId = accountId;
		this.maxLocations = maxLocations;
		this.maxPatients = maxPatients;
		this.videoLocationId = videoLocationId;
		this.hasOpd = hasOpd;
		this.currencyCode = currencyCode;
		this.maxLoginAttempts = maxLoginAttempts;
	}

	public Companies() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyGroupName() {
		return companyGroupName;
	}

	public void setCompanyGroupName(String companyGroupName) {
		this.companyGroupName = companyGroupName;
	}

	public String getCompanyCountryCode() {
		return companyCountryCode;
	}

	public void setCompanyCountryCode(String companyCountryCode) {
		this.companyCountryCode = companyCountryCode;
	}

	public Long getCompanyPincode() {
		return companyPincode;
	}

	public void setCompanyPincode(Long companyPincode) {
		this.companyPincode = companyPincode;
	}

	public Long getIscustomer() {
		return iscustomer;
	}

	public void setIscustomer(Long iscustomer) {
		this.iscustomer = iscustomer;
	}

	public String getShortcode() {
		return shortcode;
	}

	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}

	public Long getIspartner() {
		return ispartner;
	}

	public void setIspartner(Long ispartner) {
		this.ispartner = ispartner;
	}



	

	
	  public Long getTimeT1() {
		  return timeT1;
		  }
	  
	  public void setTimeT1(Long timeT1) { 
		  this.timeT1 = timeT1;
		  }
	  
	  public Long getTimeT2() { 
		  return timeT2; 
		  }
	  
	  public void setTimeT2(Long timeT2) { 
		  this.timeT2 = timeT2; 
		  }
	 

	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}

	public Integer getPartnerId() {
		return partnerId;
	}




	public Long getIsSuperPartner() {
		return isSuperPartner;
	}

	public void setIsSuperPartner(Long isSuperPartner) {
		this.isSuperPartner = isSuperPartner;
	}

	public Long getSuperPartnerId() {
		return superPartnerId;
	}

	public void setSuperPartnerId(Long superPartnerId) {
		this.superPartnerId = superPartnerId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Integer getMaxLocations() {
		return maxLocations;
	}

	public void setMaxLocations(Integer maxLocations) {
		this.maxLocations = maxLocations;
	}

	public Long getMaxPatients() {
		return maxPatients;
	}

	public void setMaxPatients(Long maxPatients) {
		this.maxPatients = maxPatients;
	}

	public Integer getVideoLocationId() {
		return videoLocationId;
	}

	public void setVideoLocationId(Integer videoLocationId) {
		this.videoLocationId = videoLocationId;
	}

	public Integer getHasOpd() {
		return hasOpd;
	}

	public void setHasOpd(Integer hasOpd) {
		this.hasOpd = hasOpd;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Integer getMaxLoginAttempts() {
		return maxLoginAttempts;
	}

	public void setMaxLoginAttempts(Integer maxLoginAttempts) {
		this.maxLoginAttempts = maxLoginAttempts;
	}

	@Override
	public String toString() {
		return "Companies [companyId=" + companyId + ", companyName=" + companyName + ", companyGroupName="
				+ companyGroupName + ", companyCountryCode=" + companyCountryCode + ", companyPincode=" + companyPincode
				+ ", iscustomer=" + iscustomer + ", shortcode=" + shortcode + ", ispartner=" + ispartner + ", timeT1="
				+ timeT1 + ", timeT2=" + timeT2 + ", partnerId=" + partnerId + ", isSuperPartner=" + isSuperPartner
				+ ", superPartnerId=" + superPartnerId + ", accountId=" + accountId + ", maxLocations=" + maxLocations
				+ ", maxPatients=" + maxPatients + ", videoLocationId=" + videoLocationId + ", hasOpd=" + hasOpd
				+ ", currencyCode=" + currencyCode + ", maxLoginAttempts=" + maxLoginAttempts + "]";
	}




	
	
}
