///////////////////////////////////////////////////////////
//  teamTo.java
//  Macromedia ActionScript Implementation of the Class teamTo
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:37 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:37 PM
 */
public class teamTo implements Serializable {

	private static final long serialVersionUID = -342213898;
	private int id;
	private int tenant;
	private String team_code;
	private String team_name;
	private String description;
	private String notes;
	private String event_log;
	Set<ProgramTo> programs;
	Set<PersonTo> persons;

	public String getdescription(){
		return description;
	}

	public String getevent_log(){
		return event_log;
	}

	public int getId(){
		return id;
	}

	public String getnotes(){
		return notes;
	}

	public Set<PersonTo> getpersons(){
		return persons;
	}

	public Set<ProgramTo> getprograms(){
		return programs;
	}

	public String getteam_code(){
		return team_code;
	}

	public String getteam_name(){
		return team_name;
	}

	public int getTenant(){
		return tenant;
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
	 * @param event_log
	 */
	public void setevent_log(String event_log){
		this.event_log = event_log;
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
	 * @param notes
	 */
	public void setnotes(String notes){
		this.notes = notes;
	}

	/**
	 * 
	 * @param person
	 */
	public void setpersons(Set<PersonTo> person){
		this.persons =person;
	}

	/**
	 * 
	 * @param program
	 */
	public void setprograms(Set<ProgramTo> program){
		this.programs =program;
	}

	/**
	 * 
	 * @param team_code
	 */
	public void setteam_code(String team_code){
		this.team_code = team_code;
	}

	/**
	 * 
	 * @param team_name
	 */
	public void setteam_name(String team_name){
		this.team_name = team_name;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	@Override
	public String toString(){
		return "teamTo []";
	}

}