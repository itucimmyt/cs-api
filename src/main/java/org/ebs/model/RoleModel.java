///////////////////////////////////////////////////////////
//  RoleModel.java
//  Macromedia ActionScript Implementation of the Class RoleModel
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:13 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:13 PM
 */
@Entity @Table(name="Role",schema="tenant")
public class RoleModel extends Auditable {

	private static final long serialVersionUID = 324073487;
	@Column(name="tenant_id")
	private int tenant;
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

	public Set<RoleActionModel> getroleactions(){
		return roleactions;
	}

	public String getsecurityGroup(){
		return securityGroup;
	}

	public int getTenant(){
		return tenant;
	}

	public Set<UserModel> getuser(){
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
	public void setroleactions(Set<RoleActionModel> roleaction){
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
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	/**
	 * 
	 * @param user
	 */
	public void setuser(Set<UserModel> user){
		this.user =user;
	}

	@Override
	public String toString(){
		return "RoleModel [id=" + id + ",]";
	}

}