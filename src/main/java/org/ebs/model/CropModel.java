///////////////////////////////////////////////////////////
//  CropModel.java
//  Macromedia ActionScript Implementation of the Class CropModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:28 PM
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ebs.util.Auditable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:28 PM
 */
@Entity @Table(name="Crop",schema="tenant")
public class CropModel extends Auditable {

	/**
	 * 
	 */
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	
	private static final long serialVersionUID = 1L;
	@Column(name="crop_code")
	private String crop_code;
	@Column(name="crop_name")
	private String crop_name;
	@Column(name="description")
	private String description;
	
	
	@OneToMany(mappedBy = "crop",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<ProgramModel> programs;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "crop_season", schema="tenant", joinColumns  = @JoinColumn(name="crop_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="season_id",referencedColumnName = "id"))
	Set<SeasonModel> seasons;
	 

	@ManyToMany(cascade =CascadeType.ALL) 
	@JoinTable(name = "crop_serviceprovider", schema="analyticalsampling", 
	joinColumns  = @JoinColumn(name="crop_id",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="serviceprovider_id",referencedColumnName = "id"))
	Set<ServiceProviderModel> serviceProviders;
 
	
	public String getcrop_code(){
		return crop_code;
	}

	public String getcrop_name(){
		return crop_name;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Set<ProgramModel> getPrograms(){
		return programs;
	}

	public Set<SeasonModel> getSeasons(){
		return seasons;
	}

	/**
	 * 
	 * @param crop_code
	 */
	public void setcrop_code(String crop_code){
		this.crop_code = crop_code;
	}

	/**
	 * 
	 * @param crop_name
	 */
	public void setcrop_name(String crop_name){
		this.crop_name = crop_name;
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
	 * @param program
	 */
	public void setPrograms(Set<ProgramModel> program){
		this.programs =program;
	}

	/**
	 * 
	 * @param season
	 */
	public void setSeasons(Set<SeasonModel> season){
		this.seasons =season;
	}

	public Set<ServiceProviderModel> getServiceProviders() {
		return serviceProviders;
	}

	public void setServiceProviders(Set<ServiceProviderModel> serviceProviders) {
		this.serviceProviders = serviceProviders;
	}

	

}