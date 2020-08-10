///////////////////////////////////////////////////////////
//  MarkerInput.java
//  Macromedia ActionScript Implementation of the Class MarkerInput
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:48 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:48 PM
 */
public class MarkerInput implements Serializable {

	private static final long serialVersionUID = 57246035;
	private int id;
	private int tenant;
	private String name;
	private String description;
	AssayGeneInput assaygene;
	Set<VendorInput> vendors;

	public AssayGeneInput getassaygene(){
		return assaygene;
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

	public int getTenant(){
		return tenant;
	}

	public Set<VendorInput> getvendors(){
		return vendors;
	}

	/**
	 * 
	 * @param assaygene
	 */
	public void setassaygene(AssayGeneInput assaygene){
		this.assaygene =assaygene;
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

	/**
	 * 
	 * @param vendor
	 */
	public void setvendors(Set<VendorInput> vendor){
		this.vendors =vendor;
	}

}