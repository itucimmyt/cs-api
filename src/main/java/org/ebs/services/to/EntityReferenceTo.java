///////////////////////////////////////////////////////////
//  EntityReferenceTo.java
//  Macromedia ActionScript Implementation of the Class EntityReferenceTo
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:50:42 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.util.Set;
import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:50:42 PM
 */
public class EntityReferenceTo implements Serializable {

	private static final long serialVersionUID = 132977899;
	private int id;
	private int tenant;
	private String entity;
	private String textfield;
	private String valuefield;
	private String storefield;
	private String entityschema;
	Set<AttributesTo> attributess;
	Set<EmailTemplateTo> emailtemplates;
	Set<WorkflowTo> workflows;
	Set<SegmentTo> segments;
	Set<WorkflowNodeTo> workflownodes;
	Set<NumberSequenceRuleTo> numbersequencerules;
	Set<WorkflowNodeCFTo> workflownodecfs;

	public Set<AttributesTo> getattributess(){
		return attributess;
	}

	public Set<EmailTemplateTo> getemailtemplates(){
		return emailtemplates;
	}

	public String getentity(){
		return entity;
	}

	public String getentityschema(){
		return entityschema;
	}

	public int getId(){
		return id;
	}

	public Set<NumberSequenceRuleTo> getnumbersequencerules(){
		return numbersequencerules;
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

	public Set<WorkflowNodeCFTo> getworkflownodecfs(){
		return workflownodecfs;
	}

	public Set<WorkflowNodeTo> getworkflownodes(){
		return workflownodes;
	}

	public Set<WorkflowTo> getworkflows(){
		return workflows;
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
	public void setemailtemplates(Set<EmailTemplateTo> emailtemplate){
		this.emailtemplates =emailtemplate;
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
	 * @param entityschema
	 */
	public void setentityschema(String entityschema){
		this.entityschema = entityschema;
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
	public void setnumbersequencerules(Set<NumberSequenceRuleTo> numbersequencerule){
		this.numbersequencerules =numbersequencerule;
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

	/**
	 * 
	 * @param workflownodecf
	 */
	public void setworkflownodecfs(Set<WorkflowNodeCFTo> workflownodecf){
		this.workflownodecfs =workflownodecf;
	}

	/**
	 * 
	 * @param workflownode
	 */
	public void setworkflownodes(Set<WorkflowNodeTo> workflownode){
		this.workflownodes =workflownode;
	}

	/**
	 * 
	 * @param workflow
	 */
	public void setworkflows(Set<WorkflowTo> workflow){
		this.workflows =workflow;
	}

	@Override
	public String toString(){
		return "EntityReferenceTo []";
	}

}