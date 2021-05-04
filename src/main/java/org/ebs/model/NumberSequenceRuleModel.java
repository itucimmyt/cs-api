///////////////////////////////////////////////////////////
//  NumberSequenceRuleModel.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleModel
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:53 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

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
import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:19:53 AM
 */
@Entity @Table(name="number_sequence_rule",schema="core") @Getter @Setter
public class NumberSequenceRuleModel extends Auditable {

	private static final long serialVersionUID = 329876914;
	@Column(name="name")
	private String name;
	@Column(name="lowest")
	private int lowest;
	@Column(name="next_rec")
	private int nextRec;
	@Column(name="format")
	private String format;
	@Column(name="last_code")
	private String lastCode;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "numbersequencerule",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<NumberSequenceRuleSegmentModel> numbersequencerulesegments;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="tenant_id")
	private TenantModel tenant;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "numbersequencerule_entityreference", schema="core", joinColumns  = @JoinColumn(name="numbersequencerule_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="entityreference_id",referencedColumnName="id"))
	private Set<EntityReferenceModel> entityreferences;

	@Override
	public String toString(){
		return "NumberSequenceRuleModel [lowest=" + lowest + ",nextRec=" + nextRec + ",id=" + id + ",]";
	}

}