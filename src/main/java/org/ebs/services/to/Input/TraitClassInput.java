///////////////////////////////////////////////////////////
//  TraitClassInput.java
//  Macromedia ActionScript Implementation of the Class TraitClassInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:26 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:26 PM
 */
public class TraitClassInput implements Serializable {

	private static final long serialVersionUID = -163135800;
	private int id;
	private int tenant_id;
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

	public int getTenantId(){
		return tenant_id;
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
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}