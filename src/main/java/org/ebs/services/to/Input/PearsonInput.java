///////////////////////////////////////////////////////////
//  PearsonInput.java
//  Macromedia ActionScript Implementation of the Class PearsonInput
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:22 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:22 PM
 */
public class PearsonInput implements Serializable {

	private static final long serialVersionUID = 263411234;
	private int id;
	private String giveName;
	private String familyName;
	private String additionalName;
	private String email;
	private String officialEmail;
	private String gender;
	private boolean hasCredential;
	private String jobTitle;
	private String knowsAbout;
	private int language;
	private String phone;
	AddressInput address;
	TenantInput tenant;

	public String getadditionalName(){
		return additionalName;
	}

	public AddressInput getAddress(){
		return address;
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

	public String getphone(){
		return phone;
	}

	public TenantInput getTenant(){
		return tenant;
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
	public void setAddress(AddressInput address){
		this.address =address;
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
		this.id=id;
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
	 * @param phone
	 */
	public void setphone(String phone){
		this.phone = phone;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void setTenant(TenantInput tenant){
		this.tenant =tenant;
	}

}