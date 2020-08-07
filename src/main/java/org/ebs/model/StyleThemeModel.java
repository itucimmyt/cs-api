///////////////////////////////////////////////////////////
//  StyleThemeModel.java
//  Macromedia ActionScript Implementation of the Class StyleThemeModel
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:39 PM
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
 * @created 07-Aug-2020 3:01:39 PM
 */
@Entity @Table(name="StyleTheme",schema="tenant")
public class StyleThemeModel extends Auditable {

	private static final long serialVersionUID = 536402012;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="description")
	private String description;
	@Column(name="path")
	private String path;
	@Column(name="physicalName")
	private String physicalName;
	@Column(name="isDefault")
	private Boolean isDefault;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "styletheme",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<PreferenceModel> preferences;

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public Boolean getisDefault(){
		return isDefault;
	}

	public String getpath(){
		return path;
	}

	public String getphysicalName(){
		return physicalName;
	}

	public Set<PreferenceModel> getpreferences(){
		return preferences;
	}

	public int getTenant(){
		return tenant;
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
	 * @param isdefault
	 */
	public void setisDefault(Boolean isdefault){
		this.isDefault = isdefault;
	}

	/**
	 * 
	 * @param path
	 */
	public void setpath(String path){
		this.path = path;
	}

	/**
	 * 
	 * @param physicalname
	 */
	public void setphysicalName(String physicalname){
		this.physicalName = physicalname;
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

	@Override
	public String toString(){
		return "StyleThemeModel [id=" + id + ",]";
	}

}