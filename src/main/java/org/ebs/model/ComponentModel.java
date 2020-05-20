///////////////////////////////////////////////////////////
//  ComponentModel.java
//  Macromedia ActionScript Implementation of the Class ComponentModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:25 PM
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
 * @created 17-May-2020 3:09:25 PM
 */
@Entity @Table(name="Component",schema="tenant")
public class ComponentModel extends Auditable {

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

	public Set<InstanceModel> getInstances(){
		return instances;
	}

	public Set<MessageModel> getMessages(){
		return messages;
	}

	public Set<ModuleModel> getModules(){
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
	public void setInstances(Set<InstanceModel> instance){
		this.instances =instance;
	}

	/**
	 * 
	 * @param message
	 */
	public void setMessages(Set<MessageModel> message){
		this.messages =message;
	}

	/**
	 * 
	 * @param module
	 */
	public void setModules(Set<ModuleModel> module){
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

}