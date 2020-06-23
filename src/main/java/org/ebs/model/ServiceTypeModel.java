///////////////////////////////////////////////////////////
//  ServiceTypeModel.java
//  Macromedia ActionScript Implementation of the Class ServiceTypeModel
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:28 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:28 PM
 */
@Entity @Table(name="ServiceType",schema="analyticalsampling")
public class ServiceTypeModel extends Auditable {

	private static final long serialVersionUID = -372218480;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="code")
	private String code;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(mappedBy="servicetypes")
	Set<ServiceProviderModel> serviceprovider;
	@ManyToMany(mappedBy="servicetypes")
	Set<PurposeModel> purpose;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="crop_id")
	CropModel crop;

	public String getcode(){
		return code;
	}

	public CropModel getCrop(){
		return crop;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public Set<PurposeModel> getPurpose(){
		return purpose;
	}

	public Set<ServiceProviderModel> getServiceProvider(){
		return serviceprovider;
	}

	public int getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param code
	 */
	public void setcode(String code){
		this.code = code;
	}

	/**
	 * 
	 * @param crop
	 */
	public void setCrop(CropModel crop){
		this.crop =crop;
	}

	/**
	 * 
	 * @param description
	 */
	public void setdescription(String description){
		this.description = description;
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
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param purpose
	 */
	public void setPurpose(Set<PurposeModel> purpose){
		this.purpose =purpose;
	}

	/**
	 * 
	 * @param serviceprovider
	 */
	public void setServiceProvider(Set<ServiceProviderModel> serviceprovider){
		this.serviceprovider =serviceprovider;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	@Override
	public String toString(){
		return "ServiceTypeModel [id=" + id + ",]";
	}

}