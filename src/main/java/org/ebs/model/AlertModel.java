///////////////////////////////////////////////////////////
//  AlertModel.java
//  Macromedia ActionScript Implementation of the Class AlertModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:12 PM
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ebs.util.Auditable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:12 PM
 */
@Entity @Table(name="Alert",schema="tenant")
public class AlertModel extends Auditable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tenant_id;
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

	public Set<AlertRuleModel> getAlertRules(){
		return alertrules;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Set<PreferenceModel> getPreferences(){
		return preferences;
	}

	public int getTenantId(){
		return tenant_id;
	}

	public Set<TranslationModel> getTranslations(){
		return translations;
	}

	/**
	 * 
	 * @param alertrule
	 */
	public void setAlertRules(Set<AlertRuleModel> alertrule){
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
	public void setPreferences(Set<PreferenceModel> preference){
		this.preferences =preference;
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
	 * @param translation
	 */
	public void setTranslations(Set<TranslationModel> translation){
		this.translations =translation;
	}

}