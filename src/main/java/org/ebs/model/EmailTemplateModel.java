///////////////////////////////////////////////////////////
//  EmailTemplateModel.java
//  Macromedia ActionScript Implementation of the Class EmailTemplateModel
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:27 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.ebs.util.Auditable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:27 AM
 */
@Entity @Table(name="EmailTemplate",schema="core") @Getter @Setter
public class EmailTemplateModel extends Auditable {

	private static final long serialVersionUID = -424359425;
	@Column(name="name")
	private String name;
	@Column(name="subject")
	private String subject;
	@Column(name="template")
	private String template;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "emailtemplate_entityreference", schema="core", joinColumns  = @JoinColumn(name="emailtemplate_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="entityreference_id",referencedColumnName="id"))
	private Set<EntityReferenceModel> entityreferences;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="tenant_id")
	private TenantModel tenant;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="person_id")
	private PersonModel person;

	@Override
	public String toString(){
		return "EmailTemplateModel [id=" + id + ",]";
	}

}