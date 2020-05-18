///////////////////////////////////////////////////////////
//  PreferenceModel.java
//  Macromedia ActionScript Implementation of the Class PreferenceModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:58 PM
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
 * @created 17-May-2020 3:09:58 PM
 */
@Entity @Table(name="Preference",schema="tenant")
public class PreferenceModel extends Auditable {

	private int tenant_id;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="user_id")
	UserModel user;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="alert_id")
	AlertModel alert;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="styletheme_id")
	StyleThemeModel styletheme;

	public AlertModel getAlert(){
		return alert;
	}

	public int getId(){
		return id;
	}

	public StyleThemeModel getStyleTheme(){
		return styletheme;
	}

	public int getTenantId(){
		return tenant_id;
	}

	public UserModel getUser(){
		return user;
	}

	/**
	 * 
	 * @param alert
	 */
	public void setAlert(AlertModel alert){
		this.alert =alert;
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
	 * @param styletheme
	 */
	public void setStyleTheme(StyleThemeModel styletheme){
		this.styletheme =styletheme;
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