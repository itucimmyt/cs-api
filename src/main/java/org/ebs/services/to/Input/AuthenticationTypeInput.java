///////////////////////////////////////////////////////////
//  AuthenticationTypeInput.java
//  Macromedia ActionScript Implementation of the Class AuthenticationTypeInput
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:17 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:17 PM
 */
public class AuthenticationTypeInput implements Serializable {

	private static final long serialVersionUID = 453054399;
	private int id;
	private int tenant;
	private String name;
	private String protocol;
	private String clientId;
	private String tenantId;
	private String keySecret;
	private String objectId;
	private Boolean isDefault;

	public String getclientId(){
		return clientId;
	}

	public int getId(){
		return id;
	}

	public Boolean getisDefault(){
		return isDefault;
	}

	public String getkeySecret(){
		return keySecret;
	}

	public String getname(){
		return name;
	}

	public String getobjectId(){
		return objectId;
	}

	public String getprotocol(){
		return protocol;
	}

	public int getTenant(){
		return tenant;
	}

	public String gettenantId(){
		return tenantId;
	}

	/**
	 * 
	 * @param clientid
	 */
	public void setclientId(String clientid){
		this.clientId = clientid;
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
	 * @param isdefault
	 */
	public void setisDefault(Boolean isdefault){
		this.isDefault = isdefault;
	}

	/**
	 * 
	 * @param keysecret
	 */
	public void setkeySecret(String keysecret){
		this.keySecret = keysecret;
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
	 * @param objectid
	 */
	public void setobjectId(String objectid){
		this.objectId = objectid;
	}

	/**
	 * 
	 * @param protocol
	 */
	public void setprotocol(String protocol){
		this.protocol = protocol;
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
	 * @param tenantid
	 */
	public void settenantId(String tenantid){
		this.tenantId = tenantid;
	}

}