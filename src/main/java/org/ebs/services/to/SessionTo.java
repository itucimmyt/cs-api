///////////////////////////////////////////////////////////
//  SessionTo.java
//  Macromedia ActionScript Implementation of the Class SessionTo
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:28 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.UserModel;
import org.ebs.model.InstanceModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:28 PM
 */
public class SessionTo implements Serializable {

	private static final long serialVersionUID = -447619863;
	private int id;
	private String webSession;
	private String remote_Address;
	private String remote_host;
	UserTo user;
	InstanceTo instance;

	public int getId(){
		return id;
	}

	public InstanceTo getInstance(){
		return instance;
	}

	public String getremote_Address(){
		return remote_Address;
	}

	public String getremote_host(){
		return remote_host;
	}

	public UserTo getUser(){
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
	public void setInstance(InstanceTo instance){
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
	 * @param user
	 */
	public void setUser(UserTo user){
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