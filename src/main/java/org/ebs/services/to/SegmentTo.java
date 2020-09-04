///////////////////////////////////////////////////////////
//  SegmentTo.java
//  Macromedia ActionScript Implementation of the Class SegmentTo
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:00 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:00 AM
 */
@Getter @Setter
public class SegmentTo implements Serializable {

	private static final long serialVersionUID = -199298762;
	private int id;
	private int tenant;
	private String name;
	private String tag;
	private boolean isapi;
	private boolean isdatabase;
	private boolean isautonum;
	private boolean isstatic;
	private boolean isformule;
	private String formule;
	private boolean isorigin;
	private EntityReferenceTo entityreference;
	private Set<NumberSequenceRuleSegmentTo> numbersequencerulesegments;

	@Override
	public String toString(){
		return "SegmentTo [isapi=" + isapi + ",isdatabase=" + isdatabase + ",isautonum=" + isautonum + ",isstatic=" + isstatic + ",isformule=" + isformule + ",isorigin=" + isorigin + ",]";
	}

}