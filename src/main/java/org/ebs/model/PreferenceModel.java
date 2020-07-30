///////////////////////////////////////////////////////////
//  PreferenceModel.java
//  Macromedia ActionScript Implementation of the Class PreferenceModel
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:06 AM
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
 * @created 27-Jul-2020 8:43:06 AM
 */
@Entity @Table(name="Preference",schema="tenant")
public class PreferenceModel extends Auditable {

	private static final long serialVersionUID = -171207007;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="comment")
	private String comment;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="user_id")
	UserModel user;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="alert_id")
	AlertModel alert;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="styletheme_id")
	StyleThemeModel styletheme;

	public AlertModel getalert(){
		return alert;
	}

	public String getcomment(){
		return comment;
	}

	public int getId(){
		return id;
	}

	public StyleThemeModel getstyletheme(){
		return styletheme;
	}

	public int getTenant(){
		return tenant;
	}

	public UserModel getuser(){
		return user;
	}

	/**
	 * 
	 * @param alert
	 */
	public void setalert(AlertModel alert){
		this.alert =alert;
	}

	/**
	 * 
	 * @param comment
	 */
	public void setcomment(String comment){
		this.comment = comment;
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
	public void setstyletheme(StyleThemeModel styletheme){
		this.styletheme =styletheme;
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
	public void setuser(UserModel user){
		this.user =user;
	}

	@Override
	public String toString(){
		return "PreferenceModel [id=" + id + ",]";
	}

}