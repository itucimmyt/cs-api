///////////////////////////////////////////////////////////
//  EmailTemplateModel.java
//  Macromedia ActionScript Implementation of the Class EmailTemplateModel
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:04 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:04 AM
 */
@Entity @Table(name="EmailTemplate",schema="tenant") @Getter @Setter
public class EmailTemplateModel extends Auditable {

	private static final long serialVersionUID = -205187992;
	@Column(name="name")
	private String name;
	@Column(name="subject")
	private String subject;
	@Column(name="template")
	private String template;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "emailtemplate_entityreference", schema="tenant", joinColumns  = @JoinColumn(name="emailtemplate_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="entityreference_id",referencedColumnName = "id"))
	private Set<EntityReferenceModel> entityreferences;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="tenant_id")
	private TenantModel tenant;

	@Override
	public String toString(){
		return "EmailTemplateModel [id=" + id + ",]";
	}

}