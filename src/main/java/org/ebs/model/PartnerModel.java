///////////////////////////////////////////////////////////
//  PartnerModel.java
//  Macromedia ActionScript Implementation of the Class PartnerModel
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:59 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:59 AM
 */
@Entity @Table(name="Partner",schema="tenant")
public class PartnerModel extends Auditable {

	private static final long serialVersionUID = -307195621;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="affiliation")
	private String affiliation;
	@Column(name="contactPoint")
	private String contactPoint;
	@Column(name="indentifier")
	private String indentifier;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="person_id")
	PersonModel person;

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

	public PersonModel getperson(){
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
		this.id = id;
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
	public void setperson(PersonModel person){
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
		return "PartnerModel [id=" + id + ",]";
	}

}