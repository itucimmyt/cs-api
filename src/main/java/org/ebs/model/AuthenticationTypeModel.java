///////////////////////////////////////////////////////////
//  AuthenticationTypeModel.java
//  Macromedia ActionScript Implementation of the Class AuthenticationTypeModel
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:10 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:10 PM
 */
@Entity @Table(name="AuthenticationType",schema="tenant")
public class AuthenticationTypeModel extends Auditable {

	private static final long serialVersionUID = -125663477;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="protocol")
	private String protocol;
	@Column(name="clientId")
	private String clientId;
	@Column(name="tenantId")
	private String tenantId;
	@Column(name="keySecret")
	private String keySecret;
	@Column(name="objectId")
	private String objectId;
	@Column(name="isDefault")
	private Boolean isDefault;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "authenticationtype",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<TenantModel> tenants;

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

	public Set<TenantModel> gettenants(){
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
		this.id = id;
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

	/**
	 * 
	 * @param tenant
	 */
	public void settenants(Set<TenantModel> tenant){
		this.tenants =tenant;
	}

	@Override
	public String toString(){
		return "AuthenticationTypeModel [id=" + id + ",]";
	}

}