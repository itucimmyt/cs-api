///////////////////////////////////////////////////////////
//  AuthenticationTypeModel.java
//  Macromedia ActionScript Implementation of the Class AuthenticationTypeModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:21 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import java.util.Date;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:21 PM
 */
@Entity @Table(name="AuthenticationType",schema="tenant")
public class AuthenticationTypeModel extends Auditable {

	private int tenant_id;
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
	@OneToMany(mappedBy = "authenticationtype",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
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

	public String gettenantId(){
		return tenantId;
	}

	public int getTenantId(){
		return tenant_id;
	}

	public Set<TenantModel> getTenants(){
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
	public void setTenants(Set<TenantModel> tenant){
		this.tenants =tenant;
	}

}