///////////////////////////////////////////////////////////
//  NumberSequenceRuleSegmentInput.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleSegmentInput
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:41 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:41 PM
 */
public class NumberSequenceRuleSegmentInput implements Serializable {

	private static final long serialVersionUID = 412304555;
	private int id;
	private int tenant;
	private int Length;
	private String FieldOrigin;
	private int Position;
	SegmentInput segment;
	NumberSequenceRuleInput numbersequencerule;

	public String getFieldOrigin(){
		return FieldOrigin;
	}

	public int getId(){
		return id;
	}

	public int getLength(){
		return Length;
	}

	public NumberSequenceRuleInput getnumbersequencerule(){
		return numbersequencerule;
	}

	public int getPosition(){
		return Position;
	}

	public SegmentInput getsegment(){
		return segment;
	}

	public int getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param fieldorigin
	 */
	public void setFieldOrigin(String fieldorigin){
		this.FieldOrigin = fieldorigin;
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
	 * @param length
	 */
	public void setLength(int length){
		this.Length = length;
	}

	/**
	 * 
	 * @param numbersequencerule
	 */
	public void setnumbersequencerule(NumberSequenceRuleInput numbersequencerule){
		this.numbersequencerule =numbersequencerule;
	}

	/**
	 * 
	 * @param position
	 */
	public void setPosition(int position){
		this.Position = position;
	}

	/**
	 * 
	 * @param segment
	 */
	public void setsegment(SegmentInput segment){
		this.segment =segment;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

}