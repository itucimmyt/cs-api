///////////////////////////////////////////////////////////
//  OrganizationModel.java
//  Macromedia ActionScript Implementation of the Class OrganizationModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:48 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import java.util.Date;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:48 PM
 */
@Entity @Table(name="Organization",schema="tenant")
public class OrganizationModel extends Auditable {

	@Column(name="legalName")
	private String legalName;
	@Column(name="phone")
	private String phone;
	@Column(name="webpage")
	private String webpage;
	@Column(name="slogan")
	private String slogan;
	@Column(name="name")
	private String name;
	@Column(name="taxID")
	private String taxID;
	@Column(name="logo")
	private String logo;
	@Column(name="isActive")
	private String isActive;
	@Column(name="defaultAuthentication")
	private int defaultAuthentication;
	@Column(name="defaultTheme")
	private int defaultTheme;
	@Column(name="organization_code")
	private int organization_code;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "organization",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<TenantModel> tenants;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="customer_id")
	CustomerModel customer;
	@OneToMany(mappedBy = "organization",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<CustomerModel> customers;

	public CustomerModel getCustomer(){
		return customer;
	}

	public Set<CustomerModel> getCustomers(){
		return customers;
	}

	public int getdefaultAuthentication(){
		return defaultAuthentication;
	}

	public int getdefaultTheme(){
		return defaultTheme;
	}

	public int getId(){
		return id;
	}

	public String getisActive(){
		return isActive;
	}

	public String getlegalName(){
		return legalName;
	}

	public String getlogo(){
		return logo;
	}

	public String getname(){
		return name;
	}

	public int getorganization_code(){
		return organization_code;
	}

	public String getphone(){
		return phone;
	}

	public String getslogan(){
		return slogan;
	}

	public String gettaxID(){
		return taxID;
	}

	public Set<TenantModel> getTenants(){
		return tenants;
	}

	public String getwebpage(){
		return webpage;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomer(CustomerModel customer){
		this.customer =customer;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomers(Set<CustomerModel> customer){
		this.customers =customer;
	}

	/**
	 * 
	 * @param defaultauthentication
	 */
	public void setdefaultAuthentication(int defaultauthentication){
		this.defaultAuthentication = defaultauthentication;
	}

	/**
	 * 
	 * @param defaulttheme
	 */
	public void setdefaultTheme(int defaulttheme){
		this.defaultTheme = defaulttheme;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * 
	 * @param isactive
	 */
	public void setisActive(String isactive){
		this.isActive = isactive;
	}

	/**
	 * 
	 * @param legalname
	 */
	public void setlegalName(String legalname){
		this.legalName = legalname;
	}

	/**
	 * 
	 * @param logo
	 */
	public void setlogo(String logo){
		this.logo = logo;
	}

	/**
	 * 
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param organization_code
	 */
	public void setorganization_code(int organization_code){
		this.organization_code = organization_code;
	}

	/**
	 * 
	 * @param phone
	 */
	public void setphone(String phone){
		this.phone = phone;
	}

	/**
	 * 
	 * @param slogan
	 */
	public void setslogan(String slogan){
		this.slogan = slogan;
	}

	/**
	 * 
	 * @param taxid
	 */
	public void settaxID(String taxid){
		this.taxID = taxid;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void setTenants(Set<TenantModel> tenant){
		this.tenants =tenant;
	}

	/**
	 * 
	 * @param webpage
	 */
	public void setwebpage(String webpage){
		this.webpage = webpage;
	}

}