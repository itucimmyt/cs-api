///////////////////////////////////////////////////////////
//  SegmentModel.java
//  Macromedia ActionScript Implementation of the Class SegmentModel
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:25 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
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
 * @created 27-Jul-2020 8:43:25 AM
 */
@Entity @Table(name="Segment",schema="tenant")
public class SegmentModel extends Auditable {

	private static final long serialVersionUID = 473054002;
	@Column(name="tenant_id")
	private int tenant;
	@Column(name="name")
	private String name;
	@Column(name="tag")
	private String tag;
	@Column(name="isAPI")
	private boolean isAPI;
	@Column(name="isDatabase")
	private boolean isDatabase;
	@Column(name="IsAutoNum")
	private boolean IsAutoNum;
	@Column(name="IsStatic")
	private boolean IsStatic;
	@Column(name="IsFormule")
	private boolean IsFormule;
	@Column(name="Formule")
	private String Formule;
	@Column(name="IsOrigin")
	private boolean IsOrigin;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="entityreference_id")
	EntityReferenceModel entityreference;
	@OneToMany(mappedBy = "segment",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<NumberSequenceRuleSegmentModel> numbersequencerulesegments;

	public EntityReferenceModel getentityreference(){
		return entityreference;
	}

	public String getFormule(){
		return Formule;
	}

	public int getId(){
		return id;
	}

	public boolean getisAPI(){
		return isAPI;
	}

	public boolean getIsAutoNum(){
		return IsAutoNum;
	}

	public boolean getisDatabase(){
		return isDatabase;
	}

	public boolean getIsFormule(){
		return IsFormule;
	}

	public boolean getIsOrigin(){
		return IsOrigin;
	}

	public boolean getIsStatic(){
		return IsStatic;
	}

	public String getname(){
		return name;
	}

	public Set<NumberSequenceRuleSegmentModel> getnumbersequencerulesegments(){
		return numbersequencerulesegments;
	}

	public String gettag(){
		return tag;
	}

	public int getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param entityreference
	 */
	public void setentityreference(EntityReferenceModel entityreference){
		this.entityreference =entityreference;
	}

	/**
	 * 
	 * @param formule
	 */
	public void setFormule(String formule){
		this.Formule = formule;
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
	 * @param isapi
	 */
	public void setisAPI(boolean isapi){
		this.isAPI = isapi;
	}

	/**
	 * 
	 * @param isautonum
	 */
	public void setIsAutoNum(boolean isautonum){
		this.IsAutoNum = isautonum;
	}

	/**
	 * 
	 * @param isdatabase
	 */
	public void setisDatabase(boolean isdatabase){
		this.isDatabase = isdatabase;
	}

	/**
	 * 
	 * @param isformule
	 */
	public void setIsFormule(boolean isformule){
		this.IsFormule = isformule;
	}

	/**
	 * 
	 * @param isorigin
	 */
	public void setIsOrigin(boolean isorigin){
		this.IsOrigin = isorigin;
	}

	/**
	 * 
	 * @param isstatic
	 */
	public void setIsStatic(boolean isstatic){
		this.IsStatic = isstatic;
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
	 * @param numbersequencerulesegment
	 */
	public void setnumbersequencerulesegments(Set<NumberSequenceRuleSegmentModel> numbersequencerulesegment){
		this.numbersequencerulesegments =numbersequencerulesegment;
	}

	/**
	 * 
	 * @param tag
	 */
	public void settag(String tag){
		this.tag = tag;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	@Override
	public String toString(){
		return "SegmentModel [isAPI=" + isAPI + ",isDatabase=" + isDatabase + ",IsAutoNum=" + IsAutoNum + ",IsStatic=" + IsStatic + ",IsFormule=" + IsFormule + ",IsOrigin=" + IsOrigin + ",id=" + id + ",]";
	}

}