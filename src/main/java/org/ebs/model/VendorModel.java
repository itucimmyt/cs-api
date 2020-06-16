///////////////////////////////////////////////////////////
//  VendorModel.java
//  Macromedia ActionScript Implementation of the Class VendorModel
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:14:48 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:14:48 PM
 */
@Entity @Table(name="Vendor",schema="tenant")
public class VendorModel extends Auditable {

	private static final long serialVersionUID = -121410613;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="code")
	private String code;
	@Column(name="reference")
	private String reference;
	@Column(name="status")
	private String status;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "vendor_technologyplatform", schema="tenant", joinColumns  = @JoinColumn(name="vendor_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="technologyplatform_id",referencedColumnName = "id"))
	Set<TechnologyPlatformModel> technologyplatforms;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "vendor_marker", schema="tenant", joinColumns  = @JoinColumn(name="vendor_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="marker_id",referencedColumnName = "id"))
	Set<MarkerModel> markers;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="dataformat_id")
	DataFormatModel dataformat;
	@ManyToMany(mappedBy="vendors")
	Set<ServiceModel> service;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="country_id")
	CountryModel country;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="person_id")
	PersonModel person;

	public String getcode(){
		return code;
	}

	public CountryModel getCountry(){
		return country;
	}

	public DataFormatModel getDataFormat(){
		return dataformat;
	}

	public int getId(){
		return id;
	}

	public Set<MarkerModel> getMarkers(){
		return markers;
	}

	public PersonModel getPerson(){
		return person;
	}

	public String getreference(){
		return reference;
	}

	public Set<ServiceModel> getService(){
		return service;
	}

	public String getstatus(){
		return status;
	}

	public Set<TechnologyPlatformModel> getTechnologyPlatforms(){
		return technologyplatforms;
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
	public void setCountry(CountryModel country){
		this.country =country;
	}

	/**
	 * 
	 * @param dataformat
	 */
	public void setDataFormat(DataFormatModel dataformat){
		this.dataformat =dataformat;
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
	 * @param marker
	 */
	public void setMarkers(Set<MarkerModel> marker){
		this.markers =marker;
	}

	/**
	 * 
	 * @param person
	 */
	public void setPerson(PersonModel person){
		this.person =person;
	}

	/**
	 * 
	 * @param reference
	 */
	public void setreference(String reference){
		this.reference = reference;
	}

	/**
	 * 
	 * @param service
	 */
	public void setService(Set<ServiceModel> service){
		this.service =service;
	}

	/**
	 * 
	 * @param status
	 */
	public void setstatus(String status){
		this.status = status;
	}

	/**
	 * 
	 * @param technologyplatform
	 */
	public void setTechnologyPlatforms(Set<TechnologyPlatformModel> technologyplatform){
		this.technologyplatforms =technologyplatform;
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
		return "VendorModel [id=" + id + ",]";
	}

}