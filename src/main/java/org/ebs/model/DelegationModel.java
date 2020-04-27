///////////////////////////////////////////////////////////
//  DelegationModel.java
//  Macromedia ActionScript Implementation of the Class DelegationModel
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:38 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
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
 * @created 27-Apr-2020 9:47:38 AM
 */
@Entity @Table(name="Delegation",schema="")
public class DelegationModel extends Auditable {

	@Column(name="DelegateTo")
	private String DelegateTo;
	@Column(name="endDate")
	private Date endDate;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@Column(name="startDate")
	private Date startDate;
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
	 * @param user
	 */
	public void setUser(UserModel user){
		this.user = user;
	}

}