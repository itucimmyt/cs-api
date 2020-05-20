///////////////////////////////////////////////////////////
//  BreedingZoneInput.java
//  Macromedia ActionScript Implementation of the Class BreedingZoneInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:22 PM
 */
public class BreedingZoneInput implements Serializable {

	private static final long serialVersionUID = -356524346;
	private int id;
	private int tenant_id;
	private int geospatial_object_id;
	PipelineInput pipeline;

	public int getgeospatial_object_id(){
		return geospatial_object_id;
	}

	public int getId(){
		return id;
	}

	public PipelineInput getPipeline(){
		return pipeline;
	}

	public int getTenantId(){
		return tenant_id;
	}

	/**
	 * 
	 * @param geospatial_object_id
	 */
	public void setgeospatial_object_id(int geospatial_object_id){
		this.geospatial_object_id = geospatial_object_id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.id=id;
	}

	/**
	 * 
	 * @param pipeline
	 */
	public void setPipeline(PipelineInput pipeline){
		this.pipeline =pipeline;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}