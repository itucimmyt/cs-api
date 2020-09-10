///////////////////////////////////////////////////////////
//  TraitModel.java
//  Macromedia ActionScript Implementation of the Class TraitModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:20:32 AM
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
 * @created 10-Sep-2020 12:20:32 AM
 */
@Entity @Table(name="Trait",schema="analyticalsampling") @Getter @Setter
public class TraitModel extends Auditable {

	private static final long serialVersionUID = -95364123;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =false) @JoinColumn(name="traitclass_id")
	private TraitClassModel traitclass;
	@OneToMany(mappedBy = "trait",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<AssayGeneModel> assaygenes;

	@Override
	public String toString(){
		return "TraitModel [id=" + id + ",]";
	}

}