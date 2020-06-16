///////////////////////////////////////////////////////////
//  AssayGeneModel.java
//  Macromedia ActionScript Implementation of the Class AssayGeneModel
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:12 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.JoinColumn;
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

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:12 PM
 */
@Entity @Table(name="AssayGene",schema="analyticalsampling")
public class AssayGeneModel extends Auditable {

	private static final long serialVersionUID = 477185001;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="trait_id")
	TraitModel trait;
	@OneToMany(mappedBy = "assaygene",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<MarkerModel> markers;

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Set<MarkerModel> getMarkers(){
		return markers;
	}

	public String getname(){
		return name;
	}

	public int getTenant(){
		return tenant;
	}

	public TraitModel getTrait(){
		return trait;
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
	 * @param marker
	 */
	public void setMarkers(Set<MarkerModel> marker){
		this.markers =marker;
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
	 * @param trait
	 */
	public void setTrait(TraitModel trait){
		this.trait =trait;
	}

	@Override
	public String toString(){
		return "AssayGeneModel [id=" + id + ",]";
	}

}