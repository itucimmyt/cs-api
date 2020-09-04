///////////////////////////////////////////////////////////
//  ProjectModel.java
//  Macromedia ActionScript Implementation of the Class ProjectModel
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:44 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
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
 * @created 04-Sep-2020 10:05:44 AM
 */
@Entity @Table(name="Project",schema="tenant") @Getter @Setter
public class ProjectModel extends Auditable {

	private static final long serialVersionUID = -474217841;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="leader_id")
	private int leaderid;
	@Column(name="project_code")
	private String projectcode;
	@Column(name="project_name")
	private String projectname;
	@Column(name="project_status")
	private String projectstatus;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="program_id")
	private ProgramModel program;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="person_id")
	private PersonModel person;

	@Override
	public String toString(){
		return "ProjectModel [leader_id=" + leaderid + ",id=" + id + ",]";
	}

}