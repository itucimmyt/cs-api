///////////////////////////////////////////////////////////
//  PhaseModel.java
//  Macromedia ActionScript Implementation of the Class PhaseModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:54 PM
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
 * @created 17-May-2020 3:09:54 PM
 */
@Entity @Table(name="Phase",schema="breeding")
public class PhaseModel extends Auditable {

	private int tenant_id;
	@Column(name="phase_code")
	private String phase_code;
	@Column(name="phase_name")
	private String phase_name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "phase_scheme", schema="breeding", joinColumns  = @JoinColumn(name="phase_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="scheme_id",referencedColumnName = "id"))
	Set<SchemeModel> schemes;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="pipeline_id")
	PipelineModel pipeline;

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getphase_code(){
		return phase_code;
	}

	public String getphase_name(){
		return phase_name;
	}

	public PipelineModel getPipeline(){
		return pipeline;
	}

	public Set<SchemeModel> getSchemes(){
		return schemes;
	}

	public int getTenantId(){
		return tenant_id;
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
	 * @param phase_code
	 */
	public void setphase_code(String phase_code){
		this.phase_code = phase_code;
	}

	/**
	 * 
	 * @param phase_name
	 */
	public void setphase_name(String phase_name){
		this.phase_name = phase_name;
	}

	/**
	 * 
	 * @param pipeline
	 */
	public void setPipeline(PipelineModel pipeline){
		this.pipeline =pipeline;
	}

	/**
	 * 
	 * @param scheme
	 */
	public void setSchemes(Set<SchemeModel> scheme){
		this.schemes =scheme;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}