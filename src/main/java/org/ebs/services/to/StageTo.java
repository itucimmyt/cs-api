///////////////////////////////////////////////////////////
//  StageTo.java
//  Macromedia ActionScript Implementation of the Class StageTo
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:21 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.SchemeModel;
import org.ebs.model.SchemaModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:21 PM
 */
public class StageTo implements Serializable {

	private static final long serialVersionUID = 108615149;
	private int id;
	private int tenant_id;
	private String stage_code;
	private String stage_name;
	private String description;
	private int order_number;
	Set<SchemeTo> scheme;
	Set<SchemaTo> schema;

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public int getorder_number(){
		return order_number;
	}

	public Set<SchemaTo> getSchema(){
		return schema;
	}

	public Set<SchemeTo> getScheme(){
		return scheme;
	}

	public String getstage_code(){
		return stage_code;
	}

	public String getstage_name(){
		return stage_name;
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
		this.id=id;
	}

	/**
	 * 
	 * @param order_number
	 */
	public void setorder_number(int order_number){
		this.order_number = order_number;
	}

	/**
	 * 
	 * @param schema
	 */
	public void setSchema(Set<SchemaTo> schema){
		this.schema =schema;
	}

	/**
	 * 
	 * @param scheme
	 */
	public void setScheme(Set<SchemeTo> scheme){
		this.scheme =scheme;
	}

	/**
	 * 
	 * @param stage_code
	 */
	public void setstage_code(String stage_code){
		this.stage_code = stage_code;
	}

	/**
	 * 
	 * @param stage_name
	 */
	public void setstage_name(String stage_name){
		this.stage_name = stage_name;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}