///////////////////////////////////////////////////////////
//  HtmlTagModel.java
//  Macromedia ActionScript Implementation of the Class HtmlTagModel
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:34 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
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
 * @created 27-Jul-2020 8:42:34 AM
 */
@Entity @Table(name="HtmlTag",schema="tenant")
public class HtmlTagModel extends Auditable {

	private static final long serialVersionUID = 43864931;
	@Column(name="tagName")
	private String tagName;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<TranslationModel> translations;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<AlertModel> alerts;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<AttributesModel> attributess;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<ModuleModel> modules;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<ComponentModel> components;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<MessageModel> messages;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowStageModel> workflowstages;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowPhaseModel> workflowphases;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowModel> workflows;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowNodeModel> workflownodes;
	@OneToMany(mappedBy = "htmltag",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	Set<WorkflowNodeCFModel> workflownodecfs;

	public Set<AlertModel> getalerts(){
		return alerts;
	}

	public Set<AttributesModel> getattributess(){
		return attributess;
	}

	public Set<ComponentModel> getcomponents(){
		return components;
	}

	public int getId(){
		return id;
	}

	public Set<MessageModel> getmessages(){
		return messages;
	}

	public Set<ModuleModel> getmodules(){
		return modules;
	}

	public String gettagName(){
		return tagName;
	}

	public Set<TranslationModel> gettranslations(){
		return translations;
	}

	public Set<WorkflowNodeCFModel> getworkflownodecfs(){
		return workflownodecfs;
	}

	public Set<WorkflowNodeModel> getworkflownodes(){
		return workflownodes;
	}

	public Set<WorkflowPhaseModel> getworkflowphases(){
		return workflowphases;
	}

	public Set<WorkflowModel> getworkflows(){
		return workflows;
	}

	public Set<WorkflowStageModel> getworkflowstages(){
		return workflowstages;
	}

	/**
	 * 
	 * @param alert
	 */
	public void setalerts(Set<AlertModel> alert){
		this.alerts =alert;
	}

	/**
	 * 
	 * @param attributes
	 */
	public void setattributess(Set<AttributesModel> attributes){
		this.attributess =attributes;
	}

	/**
	 * 
	 * @param component
	 */
	public void setcomponents(Set<ComponentModel> component){
		this.components =component;
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
	 * @param message
	 */
	public void setmessages(Set<MessageModel> message){
		this.messages =message;
	}

	/**
	 * 
	 * @param module
	 */
	public void setmodules(Set<ModuleModel> module){
		this.modules =module;
	}

	/**
	 * 
	 * @param tagname
	 */
	public void settagName(String tagname){
		this.tagName = tagname;
	}

	/**
	 * 
	 * @param translation
	 */
	public void settranslations(Set<TranslationModel> translation){
		this.translations =translation;
	}

	/**
	 * 
	 * @param workflownodecf
	 */
	public void setworkflownodecfs(Set<WorkflowNodeCFModel> workflownodecf){
		this.workflownodecfs =workflownodecf;
	}

	/**
	 * 
	 * @param workflownode
	 */
	public void setworkflownodes(Set<WorkflowNodeModel> workflownode){
		this.workflownodes =workflownode;
	}

	/**
	 * 
	 * @param workflowphase
	 */
	public void setworkflowphases(Set<WorkflowPhaseModel> workflowphase){
		this.workflowphases =workflowphase;
	}

	/**
	 * 
	 * @param workflow
	 */
	public void setworkflows(Set<WorkflowModel> workflow){
		this.workflows =workflow;
	}

	/**
	 * 
	 * @param workflowstage
	 */
	public void setworkflowstages(Set<WorkflowStageModel> workflowstage){
		this.workflowstages =workflowstage;
	}

	@Override
	public String toString(){
		return "HtmlTagModel [id=" + id + ",]";
	}

}