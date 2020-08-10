///////////////////////////////////////////////////////////
//  MarkerModel.java
//  Macromedia ActionScript Implementation of the Class MarkerModel
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:49 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:49 PM
 */
@Entity @Table(name="Marker",schema="analyticalsampling")
public class MarkerModel extends Auditable {

	private static final long serialVersionUID = 476039220;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "marker",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<MarkerSynonymModel> markersynonyms;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="assaygene_id")
	AssayGeneModel assaygene;
	@ManyToMany(mappedBy="markers")
	Set<VendorModel> vendors;

	public AssayGeneModel getassaygene(){
		return assaygene;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Set<MarkerSynonymModel> getmarkersynonyms(){
		return markersynonyms;
	}

	public String getname(){
		return name;
	}

	public int getTenant(){
		return tenant;
	}

	public Set<VendorModel> getvendors(){
		return vendors;
	}

	/**
	 * 
	 * @param assaygene
	 */
	public void setassaygene(AssayGeneModel assaygene){
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
		this.id = id;
	}

	/**
	 * 
	 * @param markersynonym
	 */
	public void setmarkersynonyms(Set<MarkerSynonymModel> markersynonym){
		this.markersynonyms =markersynonym;
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
	public void setvendors(Set<VendorModel> vendor){
		this.vendors =vendor;
	}

	@Override
	public String toString(){
		return "MarkerModel [id=" + id + ",]";
	}

}