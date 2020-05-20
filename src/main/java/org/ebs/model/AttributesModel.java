///////////////////////////////////////////////////////////
//  AttributesModel.java
//  Macromedia ActionScript Implementation of the Class AttributesModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:18 PM
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
 * @created 17-May-2020 3:09:18 PM
 */
@Entity @Table(name="Attributes",schema="tenant")
public class AttributesModel extends Auditable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="help")
	private String help;
	@Column(name="sortno")
	private int sortno;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "attributes",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<TranslationModel> translations;

	public String getdescription(){
		return description;
	}

	public String gethelp(){
		return help;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public int getsortno(){
		return sortno;
	}

	public Set<TranslationModel> getTranslations(){
		return translations;
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
	 * @param help
	 */
	public void sethelp(String help){
		this.help = help;
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
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param sortno
	 */
	public void setsortno(int sortno){
		this.sortno = sortno;
	}

	/**
	 * 
	 * @param translation
	 */
	public void setTranslations(Set<TranslationModel> translation){
		this.translations =translation;
	}

}