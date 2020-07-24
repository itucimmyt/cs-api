///////////////////////////////////////////////////////////
//  AlertModel.java
//  Macromedia ActionScript Implementation of the Class AlertModel
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:01 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
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
 * @created 23-Jul-2020 10:46:01 PM
 */
@Entity @Table(name="Alert",schema="tenant")
public class AlertModel extends Auditable {

	private static final long serialVersionUID = -70666702;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "alert",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<AlertRuleModel> alertrules;
	@OneToMany(mappedBy = "alert",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<TranslationModel> translations;
	@OneToMany(mappedBy = "alert",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<PreferenceModel> preferences;

	public Set<AlertRuleModel> getalertrules(){
		return alertrules;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Set<PreferenceModel> getpreferences(){
		return preferences;
	}

	public int getTenant(){
		return tenant;
	}

	public Set<TranslationModel> gettranslations(){
		return translations;
	}

	/**
	 * 
	 * @param alertrule
	 */
	public void setalertrules(Set<AlertRuleModel> alertrule){
		this.alertrules =alertrule;
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
	 * @param preference
	 */
	public void setpreferences(Set<PreferenceModel> preference){
		this.preferences =preference;
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
	 * @param translation
	 */
	public void settranslations(Set<TranslationModel> translation){
		this.translations =translation;
	}

	@Override
	public String toString(){
		return "AlertModel [id=" + id + ",]";
	}

}