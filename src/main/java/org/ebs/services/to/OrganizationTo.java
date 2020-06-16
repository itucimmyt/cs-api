///////////////////////////////////////////////////////////
//  OrganizationTo.java
//  Macromedia ActionScript Implementation of the Class OrganizationTo
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:53 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:53 PM
 */
public class OrganizationTo implements Serializable {

	private static final long serialVersionUID = -197927943;
	private int id;
	private String legalName;
	private String phone;
	private String webpage;
	private String slogan;
	private String name;
	private String taxID;
	private String logo;
	private String isActive;
	private int defaultAuthentication;
	private int defaultTheme;
	private int organization_code;
	Set<TenantTo> tenants;
	CustomerTo customer;
	Set<CustomerTo> customers;

	public CustomerTo getCustomer(){
		return customer;
	}

	public Set<CustomerTo> getCustomers(){
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

	public Set<TenantTo> getTenants(){
		return tenants;
	}

	public String getwebpage(){
		return webpage;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomer(CustomerTo customer){
		this.customer =customer;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomers(Set<CustomerTo> customer){
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
		this.id=id;
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
	public void setTenants(Set<TenantTo> tenant){
		this.tenants =tenant;
	}

	/**
	 * 
	 * @param webpage
	 */
	public void setwebpage(String webpage){
		this.webpage = webpage;
	}

	@Override
	public String toString(){
		return "OrganizationTo [defaultAuthentication=" + defaultAuthentication + ",defaultTheme=" + defaultTheme + ",organization_code=" + organization_code + ",]";
	}

}