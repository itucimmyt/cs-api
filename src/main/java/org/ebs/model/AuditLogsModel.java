///////////////////////////////////////////////////////////
//  AuditLogsModel.java
//  Macromedia ActionScript Implementation of the Class AuditLogsModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:18:55 AM
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
 * @created 10-Sep-2020 12:18:55 AM
 */
@Entity @Table(name="AuditLogs",schema="tenant") @Getter @Setter
public class AuditLogsModel extends Auditable {

	private static final long serialVersionUID = -105338872;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="correlationId")
	private String correlationId;
	@Column(name="message")
	private String message;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="instance_id")
	private InstanceModel instance;

	@Override
	public String toString(){
		return "AuditLogsModel [id=" + id + ",]";
	}

}