///////////////////////////////////////////////////////////
//  ActionModel.java
//  Macromedia ActionScript Implementation of the Class ActionModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:10 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ebs.util.Auditable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:10 PM
 */
@Entity @Table(name="Action",schema="tenant")
public class ActionModel extends Auditable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3819099597355658466L;
	@Column(name="description")
	private int description;
	@Column(name="actionType")
	private int actionType;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "action",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<RoleActionModel> roleactions;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="module_id")
	ModuleModel module;

	public int getactionType(){
		return actionType;
	}

	public int getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public ModuleModel getModule(){
		return module;
	}

	public Set<RoleActionModel> getRoleActions(){
		return roleactions;
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
	public void setdescription(int description){
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
	 * @param roleaction
	 */
	public void setRoleActions(Set<RoleActionModel> roleaction){
		this.roleactions =roleaction;
	}

}