///////////////////////////////////////////////////////////
//  InstanceInput.java
//  Macromedia ActionScript Implementation of the Class InstanceInput
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:36 PM
 */
public class InstanceInput implements Serializable {

	private static final long serialVersionUID = 261722212;
	private int id;
	private String server;
	private String port;
	private String health;
	ComponentInput component;
	TenantInput tenant;

	public ComponentInput getComponent(){
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

	public TenantInput getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param component
	 */
	public void setComponent(ComponentInput component){
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
	public void setTenant(TenantInput tenant){
		this.tenant =tenant;
	}

}