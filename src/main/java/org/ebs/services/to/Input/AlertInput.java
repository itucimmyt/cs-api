///////////////////////////////////////////////////////////
//  AlertInput.java
//  Macromedia ActionScript Implementation of the Class AlertInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:12 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:12 PM
 */
public class AlertInput implements Serializable {

	private static final long serialVersionUID = -385026012;
	private int id;
	private int tenant_id;
	private String description;

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
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
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}