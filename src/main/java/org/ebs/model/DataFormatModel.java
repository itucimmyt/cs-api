///////////////////////////////////////////////////////////
//  DataFormatModel.java
//  Macromedia ActionScript Implementation of the Class DataFormatModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:08 AM
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
 * @created 10-Sep-2020 12:19:08 AM
 */
@Entity @Table(name="DataFormat",schema="analyticalsampling") @Getter @Setter
public class DataFormatModel extends Auditable {

	private static final long serialVersionUID = 429493301;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "dataformat",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<VendorModel> vendors;

	@Override
	public String toString(){
		return "DataFormatModel [id=" + id + ",]";
	}

}