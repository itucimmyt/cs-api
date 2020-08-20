///////////////////////////////////////////////////////////
//  StyleThemeInput.java
//  Macromedia ActionScript Implementation of the Class StyleThemeInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:36 PM
 */
public class StyleThemeInput implements Serializable {

	private static final long serialVersionUID = 70415220;
	private int id;
	private int tenant;
	private String description;
	private String path;
	private String physicalName;
	private Boolean isDefault;

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Boolean getisDefault(){
		return isDefault;
	}

	public String getpath(){
		return path;
	}

	public String getphysicalName(){
		return physicalName;
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
	 * @param isdefault
	 */
	public void setisDefault(Boolean isdefault){
		this.isDefault = isdefault;
	}

	/**
	 * 
	 * @param path
	 */
	public void setpath(String path){
		this.path = path;
	}

	/**
	 * 
	 * @param physicalname
	 */
	public void setphysicalName(String physicalname){
		this.physicalName = physicalname;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

}