///////////////////////////////////////////////////////////
//  AuthenticationTypeTo.java
//  Macromedia ActionScript Implementation of the Class AuthenticationTypeTo
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:21 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:21 PM
 */
public class AuthenticationTypeTo implements Serializable {

	private static final long serialVersionUID = -423495923;
	private int id;
	private int tenant_id;
	private String name;
	private String protocol;
	private String clientId;
	private String tenantId;
	private String keySecret;
	private String objectId;
	private Boolean isDefault;
	Set<TenantTo> tenants;

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

	public String gettenantId(){
		return tenantId;
	}

	public int getTenantId(){
		return tenant_id;
	}

	public Set<TenantTo> getTenants(){
		return tenants;
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
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void settenantId(String tenantid){
		this.tenantId = tenantid;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void setTenants(Set<TenantTo> tenant){
		this.tenants =tenant;
	}

}