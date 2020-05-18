///////////////////////////////////////////////////////////
//  DonorModel.java
//  Macromedia ActionScript Implementation of the Class DonorModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:34 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import java.util.Date;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:34 PM
 */
@Entity @Table(name="Donor",schema="tenant")
public class DonorModel extends Auditable {

	private int tenant_id;
	@Column(name="affiliation")
	private String affiliation;
	@Column(name="contactPoint")
	private String contactPoint;
	@Column(name="indentifier")
	private String indentifier;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="person_id")
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

	public PersonModel getPerson(){
		return person;
	}

	public int getTenantId(){
		return tenant_id;
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
	public void setPerson(PersonModel person){
		this.person =person;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}