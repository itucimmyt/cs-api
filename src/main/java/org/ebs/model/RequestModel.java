///////////////////////////////////////////////////////////
//  RequestModel.java
//  Macromedia ActionScript Implementation of the Class RequestModel
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:57 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import java.util.Date;
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
 * @created 07-Sep-2020 8:11:57 AM
 */
@Entity @Table(name="Request",schema="workflow") @Getter @Setter
public class RequestModel extends Auditable {

	private static final long serialVersionUID = -35472253;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="requester")
	private String requester;
	@Column(name="request_code")
	private String requestcode;
	@Column(name="submition_date")
	private Date submitiondate;
	@Column(name="admin_contact")
	private String admincontact;
	@Column(name="charge_account")
	private String chargeaccount;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "request",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<WorkflowCFValueModel> workflowCFValues;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="workflowInstance_id")
	private WorkflowInstanceModel workflowInstance;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="person_id")
	private PersonModel person;

	@Override
	public String toString(){
		return "RequestModel [id=" + id + ",]";
	}

}