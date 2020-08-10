///////////////////////////////////////////////////////////
//  DonorInput.java
//  Macromedia ActionScript Implementation of the Class DonorInput
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:36 PM
 */
public class DonorInput implements Serializable {

	private static final long serialVersionUID = -370410630;
	private int id;
	private int tenant;
	private String affiliation;
	private String contactPoint;
	private String indentifier;
	PersonInput person;

	public String getaffiliation(){
		return affiliation;
	}

	public String getcontactPoint(){
		return contactPoint;
	}

	public int getId(){
		return id;
	}

	public String getindentifier(){
		return indentifier;
	}

	public PersonInput getperson(){
		return person;
	}

	public int getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param affiliation
	 */
	public void setaffiliation(String affiliation){
		this.affiliation = affiliation;
	}

	/**
	 * 
	 * @param contactpoint
	 */
	public void setcontactPoint(String contactpoint){
		this.contactPoint = contactpoint;
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
	 * @param indentifier
	 */
	public void setindentifier(String indentifier){
		this.indentifier = indentifier;
	}

	/**
	 * 
	 * @param person
	 */
	public void setperson(PersonInput person){
		this.person =person;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

}