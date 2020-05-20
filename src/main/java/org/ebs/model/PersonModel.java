///////////////////////////////////////////////////////////
//  PersonModel.java
//  Macromedia ActionScript Implementation of the Class PersonModel
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:53 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ebs.util.Auditable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:53 PM
 */
@SuppressWarnings("serial")
@Entity @Table(name="Person",schema="tenant")
public class PersonModel extends Auditable {

	
	@Column(name="giveName")
	private String giveName;
	@Column(name="familyName")
	private String familyName;
	@Column(name="additionalName")
	private String additionalName;
	@Column(name="email")
	private String email;
	@Column(name="officialEmail")
	private String officialEmail;
	@Column(name="gender")
	private String gender;
	@Column(name="hasCredential")
	private boolean hasCredential;
	@Column(name="jobTitle")
	private String jobTitle;
	@Column(name="knowsAbout")
	private String knowsAbout;
	@Column(name="language")
	private int language;
	@Column(name="phone")
	private String phone;
	@Column(name="status")
	private String status;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="address_id")
	AddressModel address;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="tenant_id")
	TenantModel tenant;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<CollaboratorModel> collaborators;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<DonorModel> donors;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<PartnerModel> partners;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<VendorModel> vendors;
	@OneToMany(mappedBy = "person",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<ProjectModel> projects;

	public String getadditionalName(){
		return additionalName;
	}

	public AddressModel getAddress(){
		return address;
	}

	public Set<CollaboratorModel> getCollaborators(){
		return collaborators;
	}

	public Set<DonorModel> getDonors(){
		return donors;
	}

	public String getemail(){
		return email;
	}

	public String getfamilyName(){
		return familyName;
	}

	public String getgender(){
		return gender;
	}

	public String getgiveName(){
		return giveName;
	}

	public boolean gethasCredential(){
		return hasCredential;
	}

	public int getId(){
		return id;
	}

	public String getjobTitle(){
		return jobTitle;
	}

	public String getknowsAbout(){
		return knowsAbout;
	}

	public int getlanguage(){
		return language;
	}

	public String getofficialEmail(){
		return officialEmail;
	}

	public Set<PartnerModel> getPartners(){
		return partners;
	}

	public String getphone(){
		return phone;
	}

	public Set<ProjectModel> getProjects(){
		return projects;
	}

	public String getstatus(){
		return status;
	}

	public TenantModel getTenant(){
		return tenant;
	}

	
	public Set<VendorModel> getVendors(){
		return vendors;
	}

	/**
	 * 
	 * @param additionalname
	 */
	public void setadditionalName(String additionalname){
		this.additionalName = additionalname;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(AddressModel address){
		this.address =address;
	}

	/**
	 * 
	 * @param collaborator
	 */
	public void setCollaborators(Set<CollaboratorModel> collaborator){
		this.collaborators =collaborator;
	}

	/**
	 * 
	 * @param donor
	 */
	public void setDonors(Set<DonorModel> donor){
		this.donors =donor;
	}

	/**
	 * 
	 * @param email
	 */
	public void setemail(String email){
		this.email = email;
	}

	/**
	 * 
	 * @param familyname
	 */
	public void setfamilyName(String familyname){
		this.familyName = familyname;
	}

	/**
	 * 
	 * @param gender
	 */
	public void setgender(String gender){
		this.gender = gender;
	}

	/**
	 * 
	 * @param givename
	 */
	public void setgiveName(String givename){
		this.giveName = givename;
	}

	/**
	 * 
	 * @param hascredential
	 */
	public void sethasCredential(boolean hascredential){
		this.hasCredential = hascredential;
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
	 * @param jobtitle
	 */
	public void setjobTitle(String jobtitle){
		this.jobTitle = jobtitle;
	}

	/**
	 * 
	 * @param knowsabout
	 */
	public void setknowsAbout(String knowsabout){
		this.knowsAbout = knowsabout;
	}

	/**
	 * 
	 * @param language
	 */
	public void setlanguage(int language){
		this.language = language;
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
	 * @param partner
	 */
	public void setPartners(Set<PartnerModel> partner){
		this.partners =partner;
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
	 * @param project
	 */
	public void setProjects(Set<ProjectModel> project){
		this.projects =project;
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
	 * @param tenant
	 */
	public void setTenant(TenantModel tenant){
		this.tenant =tenant;
	}

 
	/**
	 * 
	 * @param vendor
	 */
	public void setVendors(Set<VendorModel> vendor){
		this.vendors =vendor;
	}

}