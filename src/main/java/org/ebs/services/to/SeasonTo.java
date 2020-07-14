///////////////////////////////////////////////////////////
//  SeasonTo.java
//  Macromedia ActionScript Implementation of the Class SeasonTo
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:18 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:18 PM
 */
public class SeasonTo implements Serializable {

	private static final long serialVersionUID = -475509262;
	private int id;
	private int tenant;
	private String season_code;
	private String season_name;
	private String description;
	Set<CropTo> crop;

	public Set<CropTo> getcrop(){
		return crop;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getseason_code(){
		return season_code;
	}

	public String getseason_name(){
		return season_name;
	}

	public int getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param crop
	 */
	public void setcrop(Set<CropTo> crop){
		this.crop =crop;
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
	 * @param season_code
	 */
	public void setseason_code(String season_code){
		this.season_code = season_code;
	}

	/**
	 * 
	 * @param season_name
	 */
	public void setseason_name(String season_name){
		this.season_name = season_name;
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
		return "SeasonTo []";
	}

}