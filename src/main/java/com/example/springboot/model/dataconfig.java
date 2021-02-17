package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "dataconfig")
//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class dataconfig {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idval;
    private String name;
    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private boolean initialize;
    private String tenantid;
    private String tenantname;
    private String tenantcontactno;
    private String tenantaddress;
    private String tenantpincode;
    private String tenantcity;
    private String tenantstate;
    private String tenantcountry;
    private String archivename;
    private String archiveurl;
    private boolean isenable;
	
	public Long getIdval() {
		return idval;
	}
	public void setIdval(Long idval) {
		this.idval = idval;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public boolean isInitialize() {
		return initialize;
	}
	public void setInitialize(boolean initialize) {
		this.initialize = initialize;
	}
	public String getTenantid() {
		return tenantid;
	}
	public void setTenantid(String tenantid) {
		this.tenantid = tenantid;
	}
	public String getTenantname() {
		return tenantname;
	}
	public void setTenantname(String tenantname) {
		this.tenantname = tenantname;
	}
	public String getTenantcontactno() {
		return tenantcontactno;
	}
	public void setTenantcontactno(String tenantcontactno) {
		this.tenantcontactno = tenantcontactno;
	}
	public String getTenantaddress() {
		return tenantaddress;
	}
	public void setTenantaddress(String tenantaddress) {
		this.tenantaddress = tenantaddress;
	}
	public String getTenantpincode() {
		return tenantpincode;
	}
	public void setTenantpincode(String tenantpincode) {
		this.tenantpincode = tenantpincode;
	}
	public String getTenantcity() {
		return tenantcity;
	}
	public void setTenantcity(String tenantcity) {
		this.tenantcity = tenantcity;
	}
	public String getTenantstate() {
		return tenantstate;
	}
	public void setTenantstate(String tenantstate) {
		this.tenantstate = tenantstate;
	}
	public String getTenantcountry() {
		return tenantcountry;
	}
	public void setTenantcountry(String tenantcountry) {
		this.tenantcountry = tenantcountry;
	}
	public String getArchivename() {
		return archivename;
	}
	public void setArchivename(String archivename) {
		this.archivename = archivename;
	}
	public String getArchiveurl() {
		return archiveurl;
	}
	public void setArchiveurl(String archiveurl) {
		this.archiveurl = archiveurl;
	}
	public boolean isIsenable() {
		return isenable;
	}
	public void setIsenable(boolean isenable) {
		this.isenable = isenable;
	}

    
}
