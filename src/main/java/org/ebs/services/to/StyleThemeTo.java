///////////////////////////////////////////////////////////
//  StyleThemeTo.java
//  Macromedia ActionScript Implementation of the Class StyleThemeTo
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:24 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:24 PM
 */
public class StyleThemeTo implements Serializable {

	private static final long serialVersionUID = 409818751;
	private int id;
	private int tenant;
	private String description;
	private String path;
	private String physicalName;
	private Boolean isDefault;
	Set<PreferenceTo> preferences;

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

	public Set<PreferenceTo> getpreferences(){
		return preferences;
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
	 * @param preference
	 */
	public void setpreferences(Set<PreferenceTo> preference){
		this.preferences =preference;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	@Override
	public String toString(){
		return "StyleThemeTo []";
	}

}