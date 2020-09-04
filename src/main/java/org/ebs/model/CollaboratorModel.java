///////////////////////////////////////////////////////////
//  CollaboratorModel.java
//  Macromedia ActionScript Implementation of the Class CollaboratorModel
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:04:48 AM
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
 * @created 04-Sep-2020 10:04:48 AM
 */
@Entity @Table(name="Collaborator",schema="tenant") @Getter @Setter
public class CollaboratorModel extends Auditable {

	private static final long serialVersionUID = -389745204;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="affiliation")
	private String affiliation;
	@Column(name="contactPoint")
	private String contactpoint;
	@Column(name="identifier")
	private String identifier;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="person_id")
	private PersonModel person;

	@Override
	public String toString(){
		return "CollaboratorModel [id=" + id + ",]";
	}

}