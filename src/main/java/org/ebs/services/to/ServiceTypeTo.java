///////////////////////////////////////////////////////////
//  ServiceTypeTo.java
//  Macromedia ActionScript Implementation of the Class ServiceTypeTo
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:18 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.ServiceProviderModel;
import org.ebs.model.PurposeModel;
import org.ebs.model.CropModel;
import org.ebs.model.ServiceModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:18 PM
 */
public class ServiceTypeTo implements Serializable {

	private static final long serialVersionUID = 448915363;
	private int id;
	private int tenant_id;
	private String name;
	private String code;
	private String description;
	ServiceProviderTo serviceprovider;
	Set<PurposeTo> purpose;
	CropTo crop;
	Set<ServiceTo> services;

	public String getcode(){
		return code;
	}

	public CropTo getCrop(){
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

	public Set<PurposeTo> getPurpose(){
		return purpose;
	}

	public ServiceProviderTo getServiceProvider(){
		return serviceprovider;
	}

	public Set<ServiceTo> getServices(){
		return services;
	}

	public int getTenantId(){
		return tenant_id;
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
	public void setCrop(CropTo crop){
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
		this.id=id;
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
	public void setPurpose(Set<PurposeTo> purpose){
		this.purpose =purpose;
	}

	/**
	 * 
	 * @param serviceprovider
	 */
	public void setServiceProvider(ServiceProviderTo serviceprovider){
		this.serviceprovider =serviceprovider;
	}

	/**
	 * 
	 * @param service
	 */
	public void setServices(Set<ServiceTo> service){
		this.services =service;
	}

	/**
	 * 
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}