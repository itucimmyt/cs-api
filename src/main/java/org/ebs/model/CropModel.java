///////////////////////////////////////////////////////////
//  CropModel.java
//  Macromedia ActionScript Implementation of the Class CropModel
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:25 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:25 PM
 */
@Entity @Table(name="Crop",schema="tenant")
public class CropModel extends Auditable {

	private static final long serialVersionUID = -337209980;
	@Column(name="crop_code")
	private String crop_code;
	@Column(name="crop_name")
	private String crop_name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "crop",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<ProgramModel> programs;
	@OneToMany(mappedBy = "crop",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<ServiceTypeModel> servicetypes;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "crop_season", schema="tenant", joinColumns  = @JoinColumn(name="crop_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="season_id",referencedColumnName = "id"))
	Set<SeasonModel> seasons;

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

	public Set<ServiceTypeModel> getServiceTypes(){
		return servicetypes;
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

	/**
	 * 
	 * @param servicetype
	 */
	public void setServiceTypes(Set<ServiceTypeModel> servicetype){
		this.servicetypes =servicetype;
	}

	@Override
	public String toString(){
		return "CropModel [id=" + id + ",]";
	}

}