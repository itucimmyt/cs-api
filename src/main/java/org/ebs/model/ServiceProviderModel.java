///////////////////////////////////////////////////////////
//  ServiceProviderModel.java
//  Macromedia ActionScript Implementation of the Class ServiceProviderModel
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:10 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.CascadeType;
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
 * @created 23-Jul-2020 10:47:10 PM
 */
@Entity @Table(name="ServiceProvider",schema="analyticalsampling")
public class ServiceProviderModel extends Auditable {

	private static final long serialVersionUID = 198071096;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String name;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "serviceprovider_servicetype", schema="analyticalsampling", joinColumns  = @JoinColumn(name="serviceprovider_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="servicetype_id",referencedColumnName = "id"))
	Set<ServiceTypeModel> servicetypes;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="country_id")
	CountryModel country;
	@ManyToMany(mappedBy="serviceproviders")
	Set<CropModel> crop;

	public String getcode(){
		return code;
	}

	public CountryModel getcountry(){
		return country;
	}

	public Set<CropModel> getcrop(){
		return crop;
	}

	public int getId(){
		return id;
	}

	public String getname(){
		return name;
	}

	public Set<ServiceTypeModel> getservicetypes(){
		return servicetypes;
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
	 * @param country
	 */
	public void setcountry(CountryModel country){
		this.country =country;
	}

	/**
	 * 
	 * @param crop
	 */
	public void setcrop(Set<CropModel> crop){
		this.crop =crop;
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
	 * @param servicetype
	 */
	public void setservicetypes(Set<ServiceTypeModel> servicetype){
		this.servicetypes =servicetype;
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
		return "ServiceProviderModel [id=" + id + ",]";
	}

}