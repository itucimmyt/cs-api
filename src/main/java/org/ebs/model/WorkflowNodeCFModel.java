///////////////////////////////////////////////////////////
//  WorkflowNodeCFModel.java
//  Macromedia ActionScript Implementation of the Class WorkflowNodeCFModel
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:38 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.ebs.util.Auditable;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:38 AM
 */
@Entity @Table(name="WorkflowNodeCF",schema="workflow") @Getter @Setter
public class WorkflowNodeCFModel extends Auditable {

	private static final long serialVersionUID = -452989212;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="help")
	private String help;
	@Column(name="required")
	private boolean required;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "workflownodecf",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<WorkflowCFValueModel> workflowcfvalues;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="workflowcftype_id")
	private WorkflowCFTypeModel workflowcftype;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="htmltag_id")
	private HtmlTagModel htmltag;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="entityreference_id")
	private EntityReferenceModel entityreference;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="workflownode_id")
	private WorkflowNodeModel workflownode;

	@Override
	public String toString(){
		return "WorkflowNodeCFModel [required=" + required + ",id=" + id + ",]";
	}

}