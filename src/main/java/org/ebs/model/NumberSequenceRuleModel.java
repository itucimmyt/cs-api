///////////////////////////////////////////////////////////
//  NumberSequenceRuleModel.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleModel
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:00 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
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
 * @created 20-Aug-2020 1:06:00 PM
 */
@Entity @Table(name="NumberSequenceRule",schema="tenant")
public class NumberSequenceRuleModel extends Auditable {

	private static final long serialVersionUID = -516724899;
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
	@OneToMany(mappedBy = "numbersequencerule",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<NumberSequenceRuleSegmentModel> numbersequencerulesegments;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="tenant_id")
	TenantModel tenant;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "numbersequencerule_entityreference", schema="tenant", joinColumns  = @JoinColumn(name="numbersequencerule_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="entityreference_id",
	Set<EntityReferenceModel> entityreferences;

	public Set<EntityReferenceModel> getentityreferences(){
		return entityreferences;
	}

	public String getformat(){
		return format;
	}

	public int getId(){
		return id;
	}

	public String getlastcode(){
		return lastcode;
	}

	public int getlowest(){
		return lowest;
	}

	public String getname(){
		return name;
	}

	public int getnextrec(){
		return nextrec;
	}

	public Set<NumberSequenceRuleSegmentModel> getnumbersequencerulesegments(){
		return numbersequencerulesegments;
	}

	public TenantModel gettenant(){
		return tenant;
	}

	/**
	 * 
	 * @param entityreference
	 */
	public void setentityreferences(Set<EntityReferenceModel> entityreference){
		this.entityreferences =entityreference;
	}

	/**
	 * 
	 * @param format
	 */
	public void setformat(String format){
		this.format = format;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * 
	 * @param lastcode
	 */
	public void setlastcode(String lastcode){
		this.lastcode = lastcode;
	}

	/**
	 * 
	 * @param lowest
	 */
	public void setlowest(int lowest){
		this.lowest = lowest;
	}

	/**
	 * 
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * 
	 * @param nextrec
	 */
	public void setnextrec(int nextrec){
		this.nextrec = nextrec;
	}

	/**
	 * 
	 * @param numbersequencerulesegment
	 */
	public void setnumbersequencerulesegments(Set<NumberSequenceRuleSegmentModel> numbersequencerulesegment){
		this.numbersequencerulesegments =numbersequencerulesegment;
	}

	/**
	 * 
	 * @param tenant
	 */
	public void settenant(TenantModel tenant){
		this.tenant =tenant;
	}

	@Override
	public String toString(){
		return "NumberSequenceRuleModel [lowest=" + lowest + ",nextrec=" + nextrec + ",id=" + id + ",]";
	}

}