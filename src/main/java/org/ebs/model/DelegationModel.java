///////////////////////////////////////////////////////////
//  DelegationModel.java
//  Macromedia ActionScript Implementation of the Class DelegationModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:32 PM
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
 * @created 17-May-2020 3:09:32 PM
 */
@Entity @Table(name="Delegation",schema="tenant")
public class DelegationModel extends Auditable {

	private int tenant_id;
	@Column(name="startDate")
	private Date startDate;
	@Column(name="endDate")
	private Date endDate;
	@Column(name="DelegateTo")
	private String DelegateTo;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="user_id")
	UserModel user;

	public String getDelegateTo(){
		return DelegateTo;
	}

	public Date getendDate(){
		return endDate;
	}

	public int getId(){
		return id;
	}

	public Date getstartDate(){
		return startDate;
	}

	public int getTenantId(){
		return tenant_id;
	}

	public UserModel getUser(){
		return user;
	}

	/**
	 * 
	 * @param delegateto
	 */
	public void setDelegateTo(String delegateto){
		this.DelegateTo = delegateto;
	}

	/**
	 * 
	 * @param enddate
	 */
	public void setendDate(Date enddate){
		this.endDate = enddate;
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
	 * @param startdate
	 */
	public void setstartDate(Date startdate){
		this.startDate = startdate;
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
	public void setUser(UserModel user){
		this.user =user;
	}

}