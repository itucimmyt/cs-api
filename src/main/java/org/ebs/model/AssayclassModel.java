///////////////////////////////////////////////////////////
//  AssayclassModel.java
//  Macromedia ActionScript Implementation of the Class AssayclassModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:18:50 AM
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
 * @created 10-Sep-2020 12:18:50 AM
 */
@Entity @Table(name="Assayclass",schema="analyticalsampling") @Getter @Setter
public class AssayclassModel extends Auditable {

	private static final long serialVersionUID = 396802797;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(mappedBy="assayclasss")
	private Set<TechnologyPlatformModel> technologyplatforms;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="service_id")
	private ServiceModel service;

	@Override
	public String toString(){
		return "AssayclassModel [id=" + id + ",]";
	}

}