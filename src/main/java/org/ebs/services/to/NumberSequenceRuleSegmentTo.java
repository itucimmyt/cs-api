///////////////////////////////////////////////////////////
//  NumberSequenceRuleSegmentTo.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleSegmentTo
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:51 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:51 PM
 */
public class NumberSequenceRuleSegmentTo implements Serializable {

	private static final long serialVersionUID = -73308840;
	private int id;
	private int tenant;
	private int Length;
	private String FieldOrigin;
	private int Position;
	NumberSequenceRuleTo numbersequencerule;
	SegmentTo segment;

	public String getFieldOrigin(){
		return FieldOrigin;
	}

	public int getId(){
		return id;
	}

	public int getLength(){
		return Length;
	}

	public NumberSequenceRuleTo getnumbersequencerule(){
		return numbersequencerule;
	}

	public int getPosition(){
		return Position;
	}

	public SegmentTo getsegment(){
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
	public void setnumbersequencerule(NumberSequenceRuleTo numbersequencerule){
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
	public void setsegment(SegmentTo segment){
		this.segment =segment;
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
		return "NumberSequenceRuleSegmentTo [Length=" + Length + ",Position=" + Position + ",]";
	}

}