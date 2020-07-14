///////////////////////////////////////////////////////////
//  EntityReferenceTo.java
//  Macromedia ActionScript Implementation of the Class EntityReferenceTo
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:35 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:35 PM
 */
public class EntityReferenceTo implements Serializable {

	private static final long serialVersionUID = -32553205;
	private int id;
	private int tenant;
	private String entity;
	private String textfield;
	private String valuefield;
	private String storefield;
	Set<SegmentTo> segments;
	Set<NumberSequenceRuleTo> numbersequencerule;
	Set<EmailTemplateTo> emailtemplate;
	Set<AttributesTo> attributess;

	public Set<AttributesTo> getattributess(){
		return attributess;
	}

	public Set<EmailTemplateTo> getemailtemplate(){
		return emailtemplate;
	}

	public String getentity(){
		return entity;
	}

	public int getId(){
		return id;
	}

	public Set<NumberSequenceRuleTo> getnumbersequencerule(){
		return numbersequencerule;
	}

	public Set<SegmentTo> getsegments(){
		return segments;
	}

	public String getstorefield(){
		return storefield;
	}

	public int getTenant(){
		return tenant;
	}

	public String gettextfield(){
		return textfield;
	}

	public String getvaluefield(){
		return valuefield;
	}

	/**
	 * 
	 * @param attributes
	 */
	public void setattributess(Set<AttributesTo> attributes){
		this.attributess =attributes;
	}

	/**
	 * 
	 * @param emailtemplate
	 */
	public void setemailtemplate(Set<EmailTemplateTo> emailtemplate){
		this.emailtemplate =emailtemplate;
	}

	/**
	 * 
	 * @param entity
	 */
	public void setentity(String entity){
		this.entity = entity;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.id=id;
	}

	/**
	 * 
	 * @param numbersequencerule
	 */
	public void setnumbersequencerule(Set<NumberSequenceRuleTo> numbersequencerule){
		this.numbersequencerule =numbersequencerule;
	}

	/**
	 * 
	 * @param segment
	 */
	public void setsegments(Set<SegmentTo> segment){
		this.segments =segment;
	}

	/**
	 * 
	 * @param storefield
	 */
	public void setstorefield(String storefield){
		this.storefield = storefield;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	/**
	 * 
	 * @param textfield
	 */
	public void settextfield(String textfield){
		this.textfield = textfield;
	}

	/**
	 * 
	 * @param valuefield
	 */
	public void setvaluefield(String valuefield){
		this.valuefield = valuefield;
	}

	@Override
	public String toString(){
		return "EntityReferenceTo []";
	}

}