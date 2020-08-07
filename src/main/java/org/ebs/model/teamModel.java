///////////////////////////////////////////////////////////
//  teamModel.java
//  Macromedia ActionScript Implementation of the Class teamModel
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:43 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:01:43 PM
 */
@Entity @Table(name="team",schema="tenant")
public class teamModel extends Auditable {

	private static final long serialVersionUID = 128999780;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="team_code")
	private String team_code;
	@Column(name="team_name")
	private String team_name;
	@Column(name="description")
	private String description;
	@Column(name="notes")
	private String notes;
	@Column(name="event_log")
	private String event_log;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(mappedBy="teams")
	Set<ProgramModel> program;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "team_person", schema="tenant", joinColumns  = @JoinColumn(name="team_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="person_id",referencedColumnName = "id"))
	Set<PersonModel> persons;

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

	public Set<PersonModel> getpersons(){
		return persons;
	}

	public Set<ProgramModel> getprogram(){
		return program;
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
		this.id = id;
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
	public void setpersons(Set<PersonModel> person){
		this.persons =person;
	}

	/**
	 * 
	 * @param program
	 */
	public void setprogram(Set<ProgramModel> program){
		this.program =program;
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
		return "teamModel [id=" + id + ",]";
	}

}