///////////////////////////////////////////////////////////
//  CollaboratorTo.java
//  Macromedia ActionScript Implementation of the Class CollaboratorTo
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:23 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:23 PM
 */
public class CollaboratorTo implements Serializable {

	private static final long serialVersionUID = -217563221;
	private int id;
	private int tenant;
	private String affiliation;
	private String contactPoint;
	private String identifier;
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

	public String getidentifier(){
		return identifier;
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
	 * @param identifier
	 */
	public void setidentifier(String identifier){
		this.identifier = identifier;
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
		return "CollaboratorTo []";
	}

}