///////////////////////////////////////////////////////////
//  NumberSequenceRuleSegmentTo.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleSegmentTo
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:36 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:36 AM
 */
@Getter @Setter
public class NumberSequenceRuleSegmentTo implements Serializable {

	private static final long serialVersionUID = -304937604;
	private int id;
	private int tenant;
	private int length;
	private String fieldOrigin;
	private int position;
	private SegmentTo segment;
	private NumberSequenceRuleTo numberSequenceRule;

	@Override
	public String toString(){
		return "NumberSequenceRuleSegmentTo [length=" + length + ",position=" + position + ",]";
	}

}