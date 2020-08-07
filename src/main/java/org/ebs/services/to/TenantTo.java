///////////////////////////////////////////////////////////
//  TenantTo.java
//  Macromedia ActionScript Implementation of the Class TenantTo
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:01:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:01:55 PM
 */
public class TenantTo implements Serializable {

	private static final long serialVersionUID = 235707515;
	private int id;
	private String name;
	private Date expiration;
	private boolean expire;
	Set<EmailTemplateTo> emailtemplates;
	Set<ProgramTo> programs;
	Set<UserTo> users;
	Set<InstanceTo> instances;
	Set<WorkflowTo> workflows;
	OrganizationTo organization;
	AuthenticationTypeTo authenticationtype;
	Set<NumberSequenceRuleTo> numbersequencerules;
	CustomerTo customer;
	Set<PersonTo> persons;

	public AuthenticationTypeTo getauthenticationtype(){
		return authenticationtype;
	}

	public CustomerTo getcustomer(){
		return customer;
	}

	public Set<EmailTemplateTo> getemailtemplates(){
		return emailtemplates;
	}

	public Date getexpiration(){
		return expiration;
	}

	public boolean getexpire(){
		return expire;
	}

	public int getId(){
		return id;
	}

	public Set<InstanceTo> getinstances(){
		return instances;
	}

	public String getname(){
		return name;
	}

	public Set<NumberSequenceRuleTo> getnumbersequencerules(){
		return numbersequencerules;
	}

	public OrganizationTo getorganization(){
		return organization;
	}

	public Set<PersonTo> getpersons(){
		return persons;
	}

	public Set<ProgramTo> getprograms(){
		return programs;
	}

	public Set<UserTo> getusers(){
		return users;
	}

	public Set<WorkflowTo> getworkflows(){
		return workflows;
	}

	/**
	 * 
	 * @param authenticationtype
	 */
	public void setauthenticationtype(AuthenticationTypeTo authenticationtype){
		this.authenticationtype =authenticationtype;
	}

	/**
	 * 
	 * @param customer
	 */
	public void setcustomer(CustomerTo customer){
		this.customer =customer;
	}

	/**
	 * 
	 * @param emailtemplate
	 */
	public void setemailtemplates(Set<EmailTemplateTo> emailtemplate){
		this.emailtemplates =emailtemplate;
	}

	/**
	 * 
	 * @param expiration
	 */
	public void setexpiration(Date expiration){
		this.expiration = expiration;
	}

	/**
	 * 
	 * @param expire
	 */
	public void setexpire(boolean expire){
		this.expire = expire;
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
	 * @param instance
	 */
	public void setinstances(Set<InstanceTo> instance){
		this.instances =instance;
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
	 * @param numbersequencerule
	 */
	public void setnumbersequencerules(Set<NumberSequenceRuleTo> numbersequencerule){
		this.numbersequencerules =numbersequencerule;
	}

	/**
	 * 
	 * @param organization
	 */
	public void setorganization(OrganizationTo organization){
		this.organization =organization;
	}

	/**
	 * 
	 * @param person
	 */
	public void setpersons(Set<PersonTo> person){
		this.persons =person;
	}

	/**
	 * 
	 * @param program
	 */
	public void setprograms(Set<ProgramTo> program){
		this.programs =program;
	}

	/**
	 * 
	 * @param user
	 */
	public void setusers(Set<UserTo> user){
		this.users =user;
	}

	/**
	 * 
	 * @param workflow
	 */
	public void setworkflows(Set<WorkflowTo> workflow){
		this.workflows =workflow;
	}

	@Override
	public String toString(){
		return "TenantTo [expire=" + expire + ",]";
	}

}