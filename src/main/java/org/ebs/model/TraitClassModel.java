///////////////////////////////////////////////////////////
//  TraitClassModel.java
//  Macromedia ActionScript Implementation of the Class TraitClassModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:27 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ebs.util.Auditable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:27 PM
 */
@SuppressWarnings("serial")
@Entity @Table(name="TraitClass",schema="analyticalsampling")
public class TraitClassModel extends Auditable {

	private int tenant_id;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "traitclass",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<TraitModel> traits;

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

	public Set<TraitModel> getTraits(){
		return traits;
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
		this.id = id;
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

	/**
	 * 
	 * @param trait
	 */
	public void setTraits(Set<TraitModel> trait){
		this.traits =trait;
	}

}