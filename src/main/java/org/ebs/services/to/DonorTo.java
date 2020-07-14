///////////////////////////////////////////////////////////
//  DonorTo.java
//  Macromedia ActionScript Implementation of the Class DonorTo
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:31 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:31 PM
 */
public class DonorTo implements Serializable {

	private static final long serialVersionUID = 209715377;
	private int id;
	private int tenant;
	private String affiliation;
	private String contactPoint;
	private String indentifier;
	PersonTo person;

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

	public PersonTo getperson(){
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
	public void setperson(PersonTo person){
		this.person =person;
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
		return "DonorTo []";
	}

}