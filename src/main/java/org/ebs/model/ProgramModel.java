///////////////////////////////////////////////////////////
//  ProgramModel.java
//  Macromedia ActionScript Implementation of the Class ProgramModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:01 PM
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
 * @created 17-May-2020 3:10:01 PM
 */
@Entity @Table(name="Program",schema="tenant")
public class ProgramModel extends Auditable {


	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="tenant_id")
	private TenantModel tenant;
	@Column(name="program_code")
	private String program_code;
	@Column(name="program_name")
	private String program_name;
	@Column(name="program_type")
	private String program_type;
	@Column(name="program_status")
	private String program_status;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "program",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<ProjectModel> projects;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="crop_id")
	CropModel crop;

	public CropModel getCrop(){
		return crop;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getprogram_code(){
		return program_code;
	}

	public String getprogram_name(){
		return program_name;
	}

	public String getprogram_status(){
		return program_status;
	}

	public String getprogram_type(){
		return program_type;
	}

	public Set<ProjectModel> getProjects(){
		return projects;
	}

	public TenantModel getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param crop
	 */
	public void setCrop(CropModel crop){
		this.crop =crop;
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
	 * @param program_code
	 */
	public void setprogram_code(String program_code){
		this.program_code = program_code;
	}

	/**
	 * 
	 * @param program_name
	 */
	public void setprogram_name(String program_name){
		this.program_name = program_name;
	}

	/**
	 * 
	 * @param program_status
	 */
	public void setprogram_status(String program_status){
		this.program_status = program_status;
	}

	/**
	 * 
	 * @param program_type
	 */
	public void setprogram_type(String program_type){
		this.program_type = program_type;
	}

	/**
	 * 
	 * @param project
	 */
	public void setProjects(Set<ProjectModel> project){
		this.projects =project;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenant(TenantModel tenant){
		this.tenant=tenant;
	}

}