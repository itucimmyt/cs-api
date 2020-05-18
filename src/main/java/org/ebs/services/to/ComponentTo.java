///////////////////////////////////////////////////////////
//  ComponentTo.java
//  Macromedia ActionScript Implementation of the Class ComponentTo
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:26 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.InstanceModel;
import org.ebs.model.MessageModel;
import org.ebs.model.ModuleModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:26 PM
 */
public class ComponentTo implements Serializable {

	private static final long serialVersionUID = -216177676;
	private int id;
	private String name;
	private String version;
	private String releaseNo;
	private String info;
	Set<InstanceTo> instances;
	Set<MessageTo> messages;
	Set<ModuleTo> modules;

	public int getId(){
		return id;
	}

	public String getinfo(){
		return info;
	}

	public Set<InstanceTo> getInstances(){
		return instances;
	}

	public Set<MessageTo> getMessages(){
		return messages;
	}

	public Set<ModuleTo> getModules(){
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
		this.id=id;
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
	public void setInstances(Set<InstanceTo> instance){
		this.instances =instance;
	}

	/**
	 * 
	 * @param message
	 */
	public void setMessages(Set<MessageTo> message){
		this.messages =message;
	}

	/**
	 * 
	 * @param module
	 */
	public void setModules(Set<ModuleTo> module){
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