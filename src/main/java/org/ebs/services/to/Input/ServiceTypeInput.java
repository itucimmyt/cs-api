///////////////////////////////////////////////////////////
//  ServiceTypeInput.java
//  Macromedia ActionScript Implementation of the Class ServiceTypeInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:32 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:32 PM
 */
public class ServiceTypeInput implements Serializable {

	private static final long serialVersionUID = 183558742;
	private int id;
	private int tenant;
	private String name;
	private String code;
	private String description;
	Set<ServiceProviderInput> serviceproviders;

	public String getcode(){
		return code;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public Set<ServiceProviderInput> getserviceproviders(){
		return serviceproviders;
	}

	public int getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param code
	 */
	public void setcode(String code){
		this.code = code;
	}

	/**
	 * 
	 * @param description
	 */
	public void setdescription(String description){
		this.description = description;
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
	 * @param serviceprovider
	 */
	public void setserviceproviders(Set<ServiceProviderInput> serviceprovider){
		this.serviceproviders =serviceprovider;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

}