///////////////////////////////////////////////////////////
//  InstanceModel.java
//  Macromedia ActionScript Implementation of the Class InstanceModel
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:50 AM
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
 * @created 02-May-2021 6:19:50 AM
 */
@Entity @Table(name="instance",schema="core") @Getter @Setter
public class InstanceModel extends Auditable {

	private static final long serialVersionUID = 211447525;
	@Column(name="name")
	private String name;
	@Column(name="server")
	private String server;
	@Column(name="port")
	private String port;
	@Column(name="notes")
	private String notes;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "instance",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<AuditLogsModel> auditlogss;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="tenant_id")
	private TenantModel tenant;
	@OneToMany(mappedBy = "instance",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<DomainInstanceModel> domaininstances;

	@Override
	public String toString(){
		return "InstanceModel [id=" + id + ",]";
	}

}