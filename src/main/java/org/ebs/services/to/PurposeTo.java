///////////////////////////////////////////////////////////
//  PurposeTo.java
//  Macromedia ActionScript Implementation of the Class PurposeTo
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:05 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:05 PM
 */
public class PurposeTo implements Serializable {

	private static final long serialVersionUID = -507910397;
	private int id;
	private int tenant_id;
	private String name;
	private String code;
	private String description;
	Set<ServiceTypeTo> servicetypes;
	Set<ServiceTo> service;

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

	public Set<ServiceTo> getService(){
		return service;
	}

	public Set<ServiceTypeTo> getServiceTypes(){
		return servicetypes;
	}

	public int getTenantId(){
		return tenant_id;
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
	 * @param service
	 */
	public void setService(Set<ServiceTo> service){
		this.service =service;
	}

	/**
	 * 
	 * @param servicetype
	 */
	public void setServiceTypes(Set<ServiceTypeTo> servicetype){
		this.servicetypes =servicetype;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}