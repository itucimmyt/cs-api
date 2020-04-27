///////////////////////////////////////////////////////////
//  CustomerModel.java
//  Macromedia ActionScript Implementation of the Class CustomerModel
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:37 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
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
 * @created 27-Apr-2020 9:47:37 AM
 */
@Entity @Table(name="Customer",schema="tnt")
public class CustomerModel extends Auditable {

	@Column(name="alternateEmail")
	private String alternateEmail;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@Column(name="isActive")
	private String isActive;
	@Column(name="jobTitle")
	private String jobTitle;
	@Column(name="languagePreference")
	private String languagePreference;
	@Column(name="name")
	private String name;
	@Column(name="officialEmail")
	private String officialEmail;
	@ManyToOne(fetch=FetchType.EAGER, optional =false) @JoinColumn(name="organization_id")
	OrganizationModel organization;
	@OneToMany(mappedBy = "customer",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<OrganizationModel> Organizations;
	@Column(name="phone")
	private String phone;
	@Column(name="phoneExtension")
	private String phoneExtension;
	@OneToMany(mappedBy = "customer",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Set<TenantModel> Tenants;

	public String getalternateEmail(){
		return alternateEmail;
	}

	public int getId(){
		return id;
	}

	public String getisActive(){
		return isActive;
	}

	public String getjobTitle(){
		return jobTitle;
	}

	public String getlanguagePreference(){
		return languagePreference;
	}

	public String getname(){
		return name;
	}

	public String getofficialEmail(){
		return officialEmail;
	}

	public OrganizationModel getOrganization(){
		 return organization;
	}

	public Set<OrganizationModel> getOrganizations(){
		return Organizations;
	}

	public String getphone(){
		return phone;
	}

	public String getphoneExtension(){
		return phoneExtension;
	}

	public Set<TenantModel> getTenants(){
		return Tenants;
	}

	/**
	 * 
	 * @param alternateemail
	 */
	public void setalternateEmail(String alternateemail){
		this.alternateEmail = alternateemail;
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
	 * @param isactive
	 */
	public void setisActive(String isactive){
		this.isActive = isactive;
	}

	/**
	 * 
	 * @param jobtitle
	 */
	public void setjobTitle(String jobtitle){
		this.jobTitle = jobtitle;
	}

	/**
	 * 
	 * @param languagepreference
	 */
	public void setlanguagePreference(String languagepreference){
		this.languagePreference = languagepreference;
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
	 * @param officialemail
	 */
	public void setofficialEmail(String officialemail){
		this.officialEmail = officialemail;
	}

	/**
	 * 
	 * @param organization
	 */
	public void setOrganization(OrganizationModel organization){
		this.organization = organization;
	}

	/**
	 * 
	 * @param organization
	 */
	public void setOrganizations(Set<OrganizationModel> organization){
		this.Organizations =organization;
	}

	/**
	 * 
	 * @param phone
	 */
	public void setphone(String phone){
		this.phone = phone;
	}

	/**
	 * 
	 * @param phoneextension
	 */
	public void setphoneExtension(String phoneextension){
		this.phoneExtension = phoneextension;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void setTenants(Set<TenantModel> tenant){
		this.Tenants =tenant;
	}

}