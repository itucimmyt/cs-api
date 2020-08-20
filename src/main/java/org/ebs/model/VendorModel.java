///////////////////////////////////////////////////////////
//  VendorModel.java
//  Macromedia ActionScript Implementation of the Class VendorModel
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:51 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import javax.persistence.Id;
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

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:51 PM
 */
@Entity @Table(name="Vendor",schema="tenant")
public class VendorModel extends Auditable {

	private static final long serialVersionUID = 395864426;
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
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="dataformat_id")
	DataFormatModel dataformat;
	@ManyToMany(mappedBy="vendors")
	Set<ServiceModel> services;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="technologyplatform_id")
	TechnologyPlatformModel technologyplatform;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "vendor_marker", schema="tenant", joinColumns  = @JoinColumn(name="vendor_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="marker_id",referencedColumnName = "id"))
	Set<MarkerModel> markers;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="person_id")
	PersonModel person;

	public String getcode(){
		return code;
	}

	public DataFormatModel getdataformat(){
		return dataformat;
	}

	public int getId(){
		return id;
	}

	public Set<MarkerModel> getmarkers(){
		return markers;
	}

	public PersonModel getperson(){
		return person;
	}

	public String getreference(){
		return reference;
	}

	public Set<ServiceModel> getservices(){
		return services;
	}

	public String getstatus(){
		return status;
	}

	public TechnologyPlatformModel gettechnologyplatform(){
		return technologyplatform;
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
	 * @param dataformat
	 */
	public void setdataformat(DataFormatModel dataformat){
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
	public void setmarkers(Set<MarkerModel> marker){
		this.markers =marker;
	}

	/**
	 * 
	 * @param person
	 */
	public void setperson(PersonModel person){
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
	public void setservices(Set<ServiceModel> service){
		this.services =service;
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
	public void settechnologyplatform(TechnologyPlatformModel technologyplatform){
		this.technologyplatform =technologyplatform;
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