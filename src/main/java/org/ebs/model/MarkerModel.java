///////////////////////////////////////////////////////////
//  MarkerModel.java
//  Macromedia ActionScript Implementation of the Class MarkerModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:39 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

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
import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import java.util.Date;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:39 PM
 */
@Entity @Table(name="Marker",schema="analyticalsampling")
public class MarkerModel extends Auditable {

	private int tenant_id;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(mappedBy="markers")
	Set<VendorModel> vendor;
	@OneToMany(mappedBy = "marker",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<MarkerSynonymModel> markersynonyms;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="assaygene_id")
	AssayGeneModel assaygene;

	public AssayGeneModel getAssayGene(){
		return assaygene;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Set<MarkerSynonymModel> getMarkerSynonyms(){
		return markersynonyms;
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
	 * @param assaygene
	 */
	public void setAssayGene(AssayGeneModel assaygene){
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
	public void setMarkerSynonyms(Set<MarkerSynonymModel> markersynonym){
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