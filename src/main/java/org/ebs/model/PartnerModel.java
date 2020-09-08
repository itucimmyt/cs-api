///////////////////////////////////////////////////////////
//  PartnerModel.java
//  Macromedia ActionScript Implementation of the Class PartnerModel
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:33 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.ebs.util.Auditable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:33 AM
 */
@Entity @Table(name="Partner",schema="tenant") @Getter @Setter
public class PartnerModel extends Auditable {

	private static final long serialVersionUID = 350392154;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="affiliation")
	private String affiliation;
	@Column(name="contactPoint")
	private String contactpoint;
	@Column(name="indentifier")
	private String indentifier;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="person_id")
	private PersonModel person;

	@Override
	public String toString(){
		return "PartnerModel [id=" + id + ",]";
	}

}