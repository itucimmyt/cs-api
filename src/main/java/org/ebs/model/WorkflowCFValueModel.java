///////////////////////////////////////////////////////////
//  WorkflowCFValueModel.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFValueModel
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:53 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Date;
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
 * @created 09-Aug-2020 4:51:53 PM
 * modified by JAROJAS 2020-08-18
 */
@Entity @Table(name="WorkflowCFValue",schema="workflow")
@Getter @Setter
public class WorkflowCFValueModel extends Auditable {

	private static final long serialVersionUID = 303216545;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="flag_value")
	private Boolean flagValue;
	@Column(name="text_value")
	private String textValue;
	@Column(name="num_value")
	private Integer numValue;
	@Column(name="date_value")
	private Date dateValue;
	@Column(name="code_value")
	private Integer codeValue;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="request_id")
	private RequestModel request;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="workflowNodeCF_id")
	private WorkflowNodeCFModel workflowNodeCF;

	@Override
	public String toString(){
		return "WorkflowCFValueModel [FLAG_Value=" + flagValue + ",NUM_Value=" + numValue + ",CODE_Value=" + codeValue + ",id=" + id + ",]";
	}
}