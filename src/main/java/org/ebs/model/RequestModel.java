///////////////////////////////////////////////////////////
//  RequestModel.java
//  Macromedia ActionScript Implementation of the Class RequestModel
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:20 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.ebs.util.Auditable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:20 PM
 */
@Entity @Table(name="Request",schema="workflow")
public class RequestModel extends Auditable {

	private static final long serialVersionUID = 461784254;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="requester")
	private String requester;
	@Column(name="request_code")
	private String request_code;
	@Column(name="submition_date")
	private Date submition_date;
	@Column(name="admin_contact")
	private String admin_contact;
	@Column(name="charge_account")
	private String charge_account;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="purpose_id")
	PurposeModel purpose;
	@OneToMany(mappedBy = "request",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowCFValueModel> workflowcfvalues;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="workflowinstance_id")
	WorkflowInstanceModel workflowinstance;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="person_id")
	PersonModel person;

	public String getadmin_contact(){
		return admin_contact;
	}

	public String getcharge_account(){
		return charge_account;
	}

	public String getdescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public PersonModel getperson(){
		return person;
	}

	public PurposeModel getpurpose(){
		return purpose;
	}

	public String getrequest_code(){
		return request_code;
	}

	public String getrequester(){
		return requester;
	}

	public Date getsubmition_date(){
		return submition_date;
	}

	public int getTenant(){
		return tenant;
	}

	public Set<WorkflowCFValueModel> getworkflowcfvalues(){
		return workflowcfvalues;
	}

	public WorkflowInstanceModel getworkflowinstance(){
		return workflowinstance;
	}

	/**
	 * 
	 * @param admin_contact
	 */
	public void setadmin_contact(String admin_contact){
		this.admin_contact = admin_contact;
	}

	/**
	 * 
	 * @param charge_account
	 */
	public void setcharge_account(String charge_account){
		this.charge_account = charge_account;
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
	 * @param person
	 */
	public void setperson(PersonModel person){
		this.person =person;
	}

	/**
	 * 
	 * @param purpose
	 */
	public void setpurpose(PurposeModel purpose){
		this.purpose =purpose;
	}

	/**
	 * 
	 * @param request_code
	 */
	public void setrequest_code(String request_code){
		this.request_code = request_code;
	}

	/**
	 * 
	 * @param requester
	 */
	public void setrequester(String requester){
		this.requester = requester;
	}

	/**
	 * 
	 * @param submition_date
	 */
	public void setsubmition_date(Date submition_date){
		this.submition_date = submition_date;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	/**
	 * 
	 * @param workflowcfvalue
	 */
	public void setworkflowcfvalues(Set<WorkflowCFValueModel> workflowcfvalue){
		this.workflowcfvalues =workflowcfvalue;
	}

	/**
	 * 
	 * @param workflowinstance
	 */
	public void setworkflowinstance(WorkflowInstanceModel workflowinstance){
		this.workflowinstance =workflowinstance;
	}

	@Override
	public String toString(){
		return "RequestModel [id=" + id + ",]";
	}

}