///////////////////////////////////////////////////////////
//  WorkflowModel.java
//  Macromedia ActionScript Implementation of the Class WorkflowModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:45:07 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
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
 * @created 10-Sep-2020 10:45:07 PM
 */
@Entity @Table(name="Workflow",schema="workflow") @Getter @Setter
public class WorkflowModel extends Auditable {

	private static final long serialVersionUID = 326508427;
	@Column(name="title")
	private String title;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="help")
	private String help;
	@Column(name="sortno")
	private Integer sortno;
	@Column(name="definition")
	private String definition;
	@Column(name="icon")
	private String icon;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "workflow",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<WorkflowPhaseModel> workflowphases;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="entityreference_id")
	private EntityReferenceModel entityreference;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="tenant_id")
	private TenantModel tenant;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="htmltag_id")
	private HtmlTagModel htmltag;
	@OneToMany(mappedBy = "workflow",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<WorkflowInstanceModel> workflowinstances;
	@OneToMany(mappedBy = "workflow",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<WorkflowNodeModel> workflownodes;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="workflownode_id")
	private WorkflowNodeModel workflownode;

	@Override
	public String toString(){
		return "WorkflowModel [id=" + id + ",]";
	}

}