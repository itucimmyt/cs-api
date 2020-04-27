///////////////////////////////////////////////////////////
//  SessionInput.java
//  Macromedia ActionScript Implementation of the Class SessionInput
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:52 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:52 AM
 */
public class SessionInput implements Serializable {

	private int id;
	InstanceInput instance;
	private String remote_Address;
	private String remote_host;
	private static final long serialVersionUID = 229803763;
	UserInput user;
	private String webSession;

	public int getId(){
		return id;
	}

	public InstanceInput getInstance(){
		 return instance;
	}

	public String getremote_Address(){
		return remote_Address;
	}

	public String getremote_host(){
		return remote_host;
	}

	public UserInput getUser(){
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
	public void setInstance(InstanceInput instance){
		this.instance = instance;
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
	 * @param user
	 */
	public void setUser(UserInput user){
		this.user = user;
	}

	/**
	 * 
	 * @param websession
	 */
	public void setwebSession(String websession){
		this.webSession = websession;
	}

}