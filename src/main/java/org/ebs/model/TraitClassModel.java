///////////////////////////////////////////////////////////
//  TraitClassModel.java
//  Macromedia ActionScript Implementation of the Class TraitClassModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:49 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import lombok.Getter;
import lombok.Setter;
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
 * @created 10-Sep-2020 10:44:49 PM
 */
@Entity @Table(name="TraitClass",schema="analyticalsampling") @Getter @Setter
public class TraitClassModel extends Auditable {

	private static final long serialVersionUID = -166944128;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "traitclass",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<TraitModel> traits;

	@Override
	public String toString(){
		return "TraitClassModel [id=" + id + ",]";
	}

}