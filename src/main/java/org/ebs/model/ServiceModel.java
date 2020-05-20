///////////////////////////////////////////////////////////
//  ServiceModel.java
//  Macromedia ActionScript Implementation of the Class ServiceModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:15 PM
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
 * @created 17-May-2020 3:10:15 PM
 */
@Entity @Table(name="Service",schema="analyticalsampling")
public class ServiceModel extends Auditable {

	private int tenant_id;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="servicetype_id")
	ServiceTypeModel servicetype;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "service_purpose", schema="analyticalsampling", joinColumns  = @JoinColumn(name="service_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="purpose_id",referencedColumnName = "id"))
	Set<PurposeModel> purposes;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="serviceprovider_id")
	ServiceProviderModel serviceprovider;
	@OneToMany(mappedBy = "service",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<AssayclassModel> assayclasss;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "service_vendor", schema="analyticalsampling", joinColumns  = @JoinColumn(name="service_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="vendor_id",referencedColumnName = "id"))
	Set<VendorModel> vendors;

	public Set<AssayclassModel> getAssayclasss(){
		return assayclasss;
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

	public Set<PurposeModel> getPurposes(){
		return purposes;
	}

	public ServiceProviderModel getServiceProvider(){
		return serviceprovider;
	}

	public ServiceTypeModel getServiceType(){
		return servicetype;
	}

	public int getTenantId(){
		return tenant_id;
	}

	public Set<VendorModel> getVendors(){
		return vendors;
	}

	/**
	 * 
	 * @param assayclass
	 */
	public void setAssayclasss(Set<AssayclassModel> assayclass){
		this.assayclasss =assayclass;
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
	public void setPurposes(Set<PurposeModel> purpose){
		this.purposes =purpose;
	}

	/**
	 * 
	 * @param serviceprovider
	 */
	public void setServiceProvider(ServiceProviderModel serviceprovider){
		this.serviceprovider =serviceprovider;
	}

	/**
	 * 
	 * @param servicetype
	 */
	public void setServiceType(ServiceTypeModel servicetype){
		this.servicetype =servicetype;
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
	 * @param vendor
	 */
	public void setVendors(Set<VendorModel> vendor){
		this.vendors =vendor;
	}

}