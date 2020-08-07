///////////////////////////////////////////////////////////
//  CustomerInput.java
//  Macromedia ActionScript Implementation of the Class CustomerInput
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 2:59:21 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 2:59:21 PM
 */
public class CustomerInput implements Serializable {

	private static final long serialVersionUID = -43089088;
	private int id;
	private String name;
	private String phone;
	private String officialEmail;
	private String alternateEmail;
	private String jobTitle;
	private String languagePreference;
	private String phoneExtension;
	private String isActive;
	OrganizationInput organization;

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

	public OrganizationInput getorganization(){
		return organization;
	}

	public String getphone(){
		return phone;
	}

	public String getphoneExtension(){
		return phoneExtension;
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
		this.id=id;
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
	public void setorganization(OrganizationInput organization){
		this.organization =organization;
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

}