///////////////////////////////////////////////////////////
//  InstanceModel.java
//  Macromedia ActionScript Implementation of the Class InstanceModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:21 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
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
 * @created 10-Sep-2020 12:19:21 AM
 */
@Entity @Table(name="Instance",schema="tenant") @Getter @Setter
public class InstanceModel extends Auditable {

	private static final long serialVersionUID = -510045896;
	@Column(name="server")
	private String server;
	@Column(name="port")
	private String port;
	@Column(name="health")
	private String health;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "instance",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<SessionModel> sessions;
	@OneToMany(mappedBy = "instance",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<AuditLogsModel> auditlogss;
	@ManyToMany(mappedBy="instances")
	private Set<ComponentModel> components;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="tenant_id")
	private TenantModel tenant;

	@Override
	public String toString(){
		return "InstanceModel [id=" + id + ",]";
	}

}