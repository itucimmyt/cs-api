///////////////////////////////////////////////////////////
//  ProgramModel.java
//  Macromedia ActionScript Implementation of the Class ProgramModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:49 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinTable;
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
 * @created 10-Sep-2020 12:19:49 AM
 */
@Entity @Table(name="Program",schema="tenant") @Getter @Setter
public class ProgramModel extends Auditable {

	private static final long serialVersionUID = 11558111;
	@Column(name="program_code")
	private String programcode;
	@Column(name="program_name")
	private String programname;
	@Column(name="program_type")
	private String programtype;
	@Column(name="program_status")
	private String programstatus;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "program",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<ProjectModel> projects;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="tenant_id")
	private TenantModel tenant;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "program_team", schema="tenant", joinColumns  = @JoinColumn(name="program_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="team_id",referencedColumnName = "id"))
	private Set<TeamModel> teams;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="crop_id")
	private CropModel crop;

	@Override
	public String toString(){
		return "ProgramModel [id=" + id + ",]";
	}

}