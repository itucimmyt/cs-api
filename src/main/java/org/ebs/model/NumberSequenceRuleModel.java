///////////////////////////////////////////////////////////
//  NumberSequenceRuleModel.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleModel
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:34 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:34 AM
 */
@Entity @Table(name="NumberSequenceRule",schema="tenant") @Getter @Setter
public class NumberSequenceRuleModel extends Auditable {

	private static final long serialVersionUID = 395976649;
	@Column(name="name")
	private String name;
	@Column(name="lowest")
	private int lowest;
	@Column(name="nextrec")
	private int nextrec;
	@Column(name="format")
	private String format;
	@Column(name="lastcode")
	private String lastcode;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "numberSequenceRule",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<NumberSequenceRuleSegmentModel> numberSequenceRuleSegments;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="tenant_id")
	private TenantModel tenant;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "numbersequencerule_entityreference", schema="tenant", joinColumns  = @JoinColumn(name="numbersequencerule_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="entityreference_id",referencedColumnName = "id"))
	private Set<EntityReferenceModel> entityReferences;

	@Override
	public String toString(){
		return "NumberSequenceRuleModel [lowest=" + lowest + ",nextrec=" + nextrec + ",id=" + id + ",]";
	}

}