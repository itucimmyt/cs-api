///////////////////////////////////////////////////////////
//  TenantInput.java
//  Macromedia ActionScript Implementation of the Class TenantInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:25 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:25 PM
 */
public class TenantInput implements Serializable {

	private static final long serialVersionUID = -70038716;
	private int id;
	private String name;
	private Date expiration;
	private boolean expire;
	OrganizationInput organization;
	AuthenticationTypeInput authenticationtype;
	CustomerInput customer;

	public AuthenticationTypeInput getAuthenticationType(){
		return authenticationtype;
	}

	public CustomerInput getCustomer(){
		return customer;
	}

	public Date getexpiration(){
		return expiration;
	}

	public boolean getexpire(){
		return expire;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public OrganizationInput getOrganization(){
		return organization;
	}

	/**
	 * 
	 * @param authenticationtype
	 */
	public void setAuthenticationType(AuthenticationTypeInput authenticationtype){
		this.authenticationtype =authenticationtype;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setCustomer(CustomerInput customer){
		this.customer =customer;
	}

	/**
	 * 
	 * @param expiration
	 */
	public void setexpiration(Date expiration){
		this.expiration = expiration;
	}

	/**
	 * 
	 * @param expire
	 */
	public void setexpire(boolean expire){
		this.expire = expire;
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
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param organization
	 */
	public void setOrganization(OrganizationInput organization){
		this.organization =organization;
	}

}