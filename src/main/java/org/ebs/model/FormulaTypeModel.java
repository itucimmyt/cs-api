///////////////////////////////////////////////////////////
//  FormulaTypeModel.java
//  Macromedia ActionScript Implementation of the Class FormulaTypeModel
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:48 AM
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
 * @created 02-May-2021 6:19:48 AM
 */
@Entity @Table(name="formula_type",schema="core") @Getter @Setter
public class FormulaTypeModel extends Auditable {

	private static final long serialVersionUID = -384596206;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "formulatype",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<SegmentModel> segments;

	@Override
	public String toString(){
		return "FormulaTypeModel [id=" + id + ",]";
	}

}