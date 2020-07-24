///////////////////////////////////////////////////////////
//  TenantInput.java
//  Macromedia ActionScript Implementation of the Class TenantInput
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:18 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.util.Date;
import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:18 PM
 */
public class TenantInput implements Serializable {

	private static final long serialVersionUID = -344956651;
	private int id;
	private String name;
	private Date expiration;
	private boolean expire;
	OrganizationInput organization;
	AuthenticationTypeInput authenticationtype;
	CustomerInput customer;

	public AuthenticationTypeInput getauthenticationtype(){
		return authenticationtype;
	}

	public CustomerInput getcustomer(){
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

	public OrganizationInput getorganization(){
		return organization;
	}

	/**
	 * 
	 * @param authenticationtype
	 */
	public void setauthenticationtype(AuthenticationTypeInput authenticationtype){
		this.authenticationtype =authenticationtype;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setcustomer(CustomerInput customer){
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
	public void setorganization(OrganizationInput organization){
		this.organization =organization;
	}

}