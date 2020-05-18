///////////////////////////////////////////////////////////
//  TechnologyPlatformModel.java
//  Macromedia ActionScript Implementation of the Class TechnologyPlatformModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:23 PM
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
 * @created 17-May-2020 3:10:23 PM
 */
@Entity @Table(name="TechnologyPlatform",schema="analyticalsampling")
public class TechnologyPlatformModel extends Auditable {

	private int tenant_id;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "technologyplatform_assayclass", schema="analyticalsampling", joinColumns  = @JoinColumn(name="technologyplatform_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="assayclass_id",referencedColumnName = "id"))
	Set<AssayclassModel> assayclasss;
	@ManyToMany(mappedBy="technologyplatforms")
	Set<VendorModel> vendor;

	public Set<AssayclassModel> getAssayclasss(){
		return assayclasss;
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

	public int getTenantId(){
		return tenant_id;
	}

	public Set<VendorModel> getVendor(){
		return vendor;
	}

	/**
	 * 
	 * @param assayclass
	 */
	public void setAssayclasss(Set<AssayclassModel> assayclass){
		this.assayclasss =assayclass;
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
	 * @param vendor
	 */
	public void setVendor(Set<VendorModel> vendor){
		this.vendor =vendor;
	}

}