///////////////////////////////////////////////////////////
//  TechnologyPlatformModel.java
//  Macromedia ActionScript Implementation of the Class TechnologyPlatformModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:44 PM
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
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:44 PM
 */
@Entity @Table(name="TechnologyPlatform",schema="analyticalsampling") @Getter @Setter
public class TechnologyPlatformModel extends Auditable {

	private static final long serialVersionUID = -4525075;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "technologyplatform_assayclass", schema="analyticalsampling", joinColumns  = @JoinColumn(name="technologyplatform_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="assayclass_id",referencedColumnName = "id"))
	private Set<AssayclassModel> assayclasss;
	@OneToMany(mappedBy = "technologyplatform",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<VendorModel> vendors;

	@Override
	public String toString(){
		return "TechnologyPlatformModel [id=" + id + ",]";
	}

}