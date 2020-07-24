///////////////////////////////////////////////////////////
//  InstanceInput.java
//  Macromedia ActionScript Implementation of the Class InstanceInput
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:28 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:28 PM
 */
public class InstanceInput implements Serializable {

	private static final long serialVersionUID = -374640508;
	private int id;
	private String server;
	private String port;
	private String health;
	ComponentInput component;
	TenantInput tenant;

	public ComponentInput getcomponent(){
		return component;
	}

	public String gethealth(){
		return health;
	}

	public int getId(){
		return id;
	}

	public String getport(){
		return port;
	}

	public String getserver(){
		return server;
	}

	public TenantInput gettenant(){
		return tenant;
	}

	/**
	 * 
	 * @param component
	 */
	public void setcomponent(ComponentInput component){
		this.component =component;
	}

	/**
	 * 
	 * @param health
	 */
	public void sethealth(String health){
		this.health = health;
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
	 * @param port
	 */
	public void setport(String port){
		this.port = port;
	}

	/**
	 * 
	 * @param server
	 */
	public void setserver(String server){
		this.server = server;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void settenant(TenantInput tenant){
		this.tenant =tenant;
	}

}