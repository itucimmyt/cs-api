///////////////////////////////////////////////////////////
//  SchemaModel.java
//  Macromedia ActionScript Implementation of the Class SchemaModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:10 PM
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
 * @created 17-May-2020 3:10:10 PM
 */
@Entity @Table(name="Schema",schema="breeding")
public class SchemaModel extends Auditable {

	private int tenant_id;
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="pipeline_id")
	PipelineModel pipeline;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "schema_stage", schema="breeding", joinColumns  = @JoinColumn(name="schema_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="stage_id",referencedColumnName = "id"))
	Set<StageModel> stages;

	public String getcode(){
		return code;
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

	public PipelineModel getPipeline(){
		return pipeline;
	}

	public Set<StageModel> getStages(){
		return stages;
	}

	public int getTenantId(){
		return tenant_id;
	}

	/**
	 * 
	 * @param code
	 */
	public void setcode(String code){
		this.code = code;
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
	 * @param pipeline
	 */
	public void setPipeline(PipelineModel pipeline){
		this.pipeline =pipeline;
	}

	/**
	 * 
	 * @param stage
	 */
	public void setStages(Set<StageModel> stage){
		this.stages =stage;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}