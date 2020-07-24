///////////////////////////////////////////////////////////
//  ComponentModel.java
//  Macromedia ActionScript Implementation of the Class ComponentModel
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:13 PM
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
 * @created 23-Jul-2020 10:46:13 PM
 */
@Entity @Table(name="Component",schema="tenant")
public class ComponentModel extends Auditable {

	private static final long serialVersionUID = -383231452;
	@Column(name="name")
	private String name;
	@Column(name="version")
	private String version;
	@Column(name="releaseNo")
	private String releaseNo;
	@Column(name="info")
	private String info;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "component",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<InstanceModel> instances;
	@OneToMany(mappedBy = "component",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<MessageModel> messages;
	@OneToMany(mappedBy = "component",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<ModuleModel> modules;

	public int getId(){
		return id;
	}

	public String getinfo(){
		return info;
	}

	public Set<InstanceModel> getinstances(){
		return instances;
	}

	public Set<MessageModel> getmessages(){
		return messages;
	}

	public Set<ModuleModel> getmodules(){
		return modules;
	}

	public String getname(){
		return name;
	}

	public String getreleaseNo(){
		return releaseNo;
	}

	public String getversion(){
		return version;
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
	 * @param info
	 */
	public void setinfo(String info){
		this.info = info;
	}

	/**
	 * 
	 * @param instance
	 */
	public void setinstances(Set<InstanceModel> instance){
		this.instances =instance;
	}

	/**
	 * 
	 * @param message
	 */
	public void setmessages(Set<MessageModel> message){
		this.messages =message;
	}

	/**
	 * 
	 * @param module
	 */
	public void setmodules(Set<ModuleModel> module){
		this.modules =module;
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
	 * @param releaseno
	 */
	public void setreleaseNo(String releaseno){
		this.releaseNo = releaseno;
	}

	/**
	 * 
	 * @param version
	 */
	public void setversion(String version){
		this.version = version;
	}

	@Override
	public String toString(){
		return "ComponentModel [id=" + id + ",]";
	}

}