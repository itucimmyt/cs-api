///////////////////////////////////////////////////////////
//  TechnologyPlatformInput.java
//  Macromedia ActionScript Implementation of the Class TechnologyPlatformInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:39 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:39 PM
 */
public class TechnologyPlatformInput implements Serializable {

	private static final long serialVersionUID = -314102039;
	private int id;
	private int tenant;
	private String name;
	private String description;

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
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
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

}