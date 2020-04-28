///////////////////////////////////////////////////////////
//  ActionModel.java
//  Macromedia ActionScript Implementation of the Class ActionModel
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:06:49 AM
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
 * @created 28-Apr-2020 12:06:49 AM
 */
@Entity @Table(name="Action",schema="tnt")
public class ActionModel extends Auditable {

	@Column(name="description")
	private String description;
	@Column(name="actionType")
	private int actionType;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="module_id")
	ModuleModel module;
	@ManyToMany(mappedBy="actions")
	Set<RoleModel> role;

	public int getactionType(){
		return actionType;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public ModuleModel getModule(){
		return module;
	}

	public Set<RoleModel> getRole(){
		return role;
	}

	/**
	 * 
	 * @param actiontype
	 */
	public void setactionType(int actiontype){
		this.actionType = actiontype;
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
	 * @param module
	 */
	public void setModule(ModuleModel module){
		this.module =module;
	}

	/**
	 * 
	 * @param role
	 */
	public void setRole(Set<RoleModel> role){
		this.role =role;
	}

}