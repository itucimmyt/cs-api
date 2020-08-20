///////////////////////////////////////////////////////////
//  RoleActionModel.java
//  Macromedia ActionScript Implementation of the Class RoleActionModel
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:22 PM
 */
@Entity @Table(name="RoleAction",schema="tenant")
public class RoleActionModel extends Auditable {

	private static final long serialVersionUID = -287639202;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="allow")
	private int allow;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="action_id")
	ActionModel action;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="role_id")
	RoleModel role;

	public ActionModel getaction(){
		return action;
	}

	public int getallow(){
		return allow;
	}

	public int getId(){
		return id;
	}

	public RoleModel getrole(){
		return role;
	}

	public int getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param action
	 */
	public void setaction(ActionModel action){
		this.action =action;
	}

	/**
	 * 
	 * @param allow
	 */
	public void setallow(int allow){
		this.allow = allow;
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
	 * @param role
	 */
	public void setrole(RoleModel role){
		this.role =role;
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
		return "RoleActionModel [allow=" + allow + ",id=" + id + ",]";
	}

}