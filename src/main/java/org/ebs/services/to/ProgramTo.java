///////////////////////////////////////////////////////////
//  ProgramTo.java
//  Macromedia ActionScript Implementation of the Class ProgramTo
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:14 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:14 PM
 */
public class ProgramTo implements Serializable {

	private static final long serialVersionUID = 38452143;
	private int id;
	private String program_code;
	private String program_name;
	private String program_type;
	private String program_status;
	private String description;
	Set<ProjectTo> projects;
	TenantTo tenant;
	Set<TeamTo> teams;
	CropTo crop;

	public CropTo getcrop(){
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

	public Set<ProjectTo> getprojects(){
		return projects;
	}

	public Set<TeamTo> getteams(){
		return teams;
	}

	public TenantTo gettenant(){
		return tenant;
	}

	/**
	 * 
	 * @param crop
	 */
	public void setcrop(CropTo crop){
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
		this.id=id;
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
	public void setprojects(Set<ProjectTo> project){
		this.projects =project;
	}

	/**
	 * 
	 * @param team
	 */
	public void setteams(Set<TeamTo> team){
		this.teams =team;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void settenant(TenantTo tenant){
		this.tenant =tenant;
	}

	@Override
	public String toString(){
		return "ProgramTo []";
	}

}