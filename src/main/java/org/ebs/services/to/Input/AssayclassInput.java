///////////////////////////////////////////////////////////
//  AssayclassInput.java
//  Macromedia ActionScript Implementation of the Class AssayclassInput
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:10 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:10 PM
 */
public class AssayclassInput implements Serializable {

	private static final long serialVersionUID = 43580941;
	private int id;
	private int tenant;
	private String name;
	private String description;
	Set<TechnologyPlatformInput> technologyplatform;
	ServiceInput service;

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public ServiceInput getService(){
		return service;
	}

	public Set<TechnologyPlatformInput> getTechnologyPlatform(){
		return technologyplatform;
	}

	public int getTenant(){
		return tenant;
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
	public void setService(ServiceInput service){
		this.service =service;
	}

	/**
	 * 
	 * @param technologyplatform
	 */
	public void setTechnologyPlatform(Set<TechnologyPlatformInput> technologyplatform){
		this.technologyplatform =technologyplatform;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

}