///////////////////////////////////////////////////////////
//  SessionInput.java
//  Macromedia ActionScript Implementation of the Class SessionInput
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:14 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:14 PM
 */
public class SessionInput implements Serializable {

	private static final long serialVersionUID = 432494319;
	private int id;
	private int tenant;
	private String webSession;
	private String remote_Address;
	private String remote_host;
	UserInput user;
	InstanceInput instance;

	public int getId(){
		return id;
	}

	public InstanceInput getinstance(){
		return instance;
	}

	public String getremote_Address(){
		return remote_Address;
	}

	public String getremote_host(){
		return remote_host;
	}

	public int getTenant(){
		return tenant;
	}

	public UserInput getuser(){
		return user;
	}

	public String getwebSession(){
		return webSession;
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
	 * @param instance
	 */
	public void setinstance(InstanceInput instance){
		this.instance =instance;
	}

	/**
	 * 
	 * @param remote_address
	 */
	public void setremote_Address(String remote_address){
		this.remote_Address = remote_address;
	}

	/**
	 * 
	 * @param remote_host
	 */
	public void setremote_host(String remote_host){
		this.remote_host = remote_host;
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
	 * @param user
	 */
	public void setuser(UserInput user){
		this.user =user;
	}

	/**
	 * 
	 * @param websession
	 */
	public void setwebSession(String websession){
		this.webSession = websession;
	}

}