///////////////////////////////////////////////////////////
//  ComponentTo.java
//  Macromedia ActionScript Implementation of the Class ComponentTo
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:36 AM
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
 * @created 27-Apr-2020 9:47:36 AM
 */
public class ComponentTo implements Serializable {

	private int id;
	private String info;
	Set<InstanceTo> Instances;
	Set<MessageTo> Messages;
	Set<ModuleTo> Modules;
	private String name;
	private String releaseNo;
	private static final long serialVersionUID = 249538763;
	private String version;

	public int getId(){
		return id;
	}

	public String getinfo(){
		return info;
	}

	public Set<InstanceTo> getInstances(){
		return Instances;
	}

	public Set<MessageTo> getMessages(){
		return Messages;
	}

	public Set<ModuleTo> getModules(){
		return Modules;
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
		this.Instances =instance;
	}

	/**
	 * 
	 * @param message
	 */
	public void setMessages(Set<MessageTo> message){
		this.Messages =message;
	}

	/**
	 * 
	 * @param module
	 */
	public void setModules(Set<ModuleTo> module){
		this.Modules =module;
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