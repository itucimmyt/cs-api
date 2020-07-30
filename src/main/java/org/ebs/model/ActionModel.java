///////////////////////////////////////////////////////////
//  ActionModel.java
//  Macromedia ActionScript Implementation of the Class ActionModel
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:41:58 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
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
 * @created 27-Jul-2020 8:41:58 AM
 */
@Entity @Table(name="Action",schema="tenant")
public class ActionModel extends Auditable {

	private static final long serialVersionUID = 112564025;
	@Column(name="description")
	private int description;
	@Column(name="actionType")
	private int actionType;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "action",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<RoleActionModel> roleactions;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="module_id")
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

	public ModuleModel getmodule(){
		return module;
	}

	public Set<RoleActionModel> getroleactions(){
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
	public void setmodule(ModuleModel module){
		this.module =module;
	}

	/**
	 * 
	 * @param roleaction
	 */
	public void setroleactions(Set<RoleActionModel> roleaction){
		this.roleactions =roleaction;
	}

	@Override
	public String toString(){
		return "ActionModel [description=" + description + ",actionType=" + actionType + ",id=" + id + ",]";
	}

}