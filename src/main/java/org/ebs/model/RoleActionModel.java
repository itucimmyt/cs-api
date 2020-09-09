///////////////////////////////////////////////////////////
//  RoleActionModel.java
//  Macromedia ActionScript Implementation of the Class RoleActionModel
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:59 AM
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
 * @created 07-Sep-2020 8:11:59 AM
 */
@Entity @Table(name="RoleAction",schema="tenant") @Getter @Setter
public class RoleActionModel extends Auditable {

	private static final long serialVersionUID = 79184285;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="allow")
	private int allow;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="action_id")
	private ActionModel action;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="role_id")
	private RoleModel role;

	@Override
	public String toString(){
		return "RoleActionModel [allow=" + allow + ",id=" + id + ",]";
	}

}