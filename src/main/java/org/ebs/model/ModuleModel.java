///////////////////////////////////////////////////////////
//  ModuleModel.java
//  Macromedia ActionScript Implementation of the Class ModuleModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:56 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import javax.persistence.Column;
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

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:56 PM
 */
@Entity @Table(name="Module",schema="tenant") @Getter @Setter
public class ModuleModel extends Auditable {

	private static final long serialVersionUID = 274018254;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="help")
	private String help;
	@Column(name="route")
	private String route;
	@Column(name="MainEntity")
	private String mainEntity;
	@Column(name="icon")
	private String icon;
	@Column(name="container")
	private String container;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "module",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<ActionModel> actions;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="component_id")
	private ComponentModel component;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="htmltag_id")
	private HtmlTagModel htmltag;
	@OneToMany(mappedBy = "module",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<WorkflowNodeModel> workflownodes;

	@Override
	public String toString(){
		return "ModuleModel [id=" + id + ",]";
	}

}