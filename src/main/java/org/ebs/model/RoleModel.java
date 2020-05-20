///////////////////////////////////////////////////////////
//  RoleModel.java
//  Macromedia ActionScript Implementation of the Class RoleModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:09 PM
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
 * @created 17-May-2020 3:10:09 PM
 */
@Entity @Table(name="Role",schema="tenant")
public class RoleModel extends Auditable {

	private int tenant_id;
	@Column(name="description")
	private String description;
	@Column(name="securityGroup")
	private String securityGroup;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "role",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<RoleActionModel> roleactions;
	@ManyToMany(mappedBy="roles")
	Set<UserModel> user;

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Set<RoleActionModel> getRoleActions(){
		return roleactions;
	}

	public String getsecurityGroup(){
		return securityGroup;
	}

	public int getTenantId(){
		return tenant_id;
	}

	public Set<UserModel> getUser(){
		return user;
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
	 * @param roleaction
	 */
	public void setRoleActions(Set<RoleActionModel> roleaction){
		this.roleactions =roleaction;
	}

	/**
	 * 
	 * @param securitygroup
	 */
	public void setsecurityGroup(String securitygroup){
		this.securityGroup = securitygroup;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

	/**
	 * 
	 * @param user
	 */
	public void setUser(Set<UserModel> user){
		this.user =user;
	}

}