///////////////////////////////////////////////////////////
//  NumberSequenceRuleTo.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:06 PM
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
 * @created 10-Sep-2020 10:44:06 PM
 */
@Getter @Setter
public class NumberSequenceRuleTo implements Serializable {

	private static final long serialVersionUID = 60212437;
	private int id;
	private String name;
	private int lowest;
	private int nextrec;
	private String format;
	private String lastcode;
	private Set<NumberSequenceRuleSegmentTo> numbersequencerulesegments;
	private TenantTo tenant;
	private Set<EntityReferenceTo> entityreferences;

	@Override
	public String toString(){
		return "NumberSequenceRuleTo [lowest=" + lowest + ",nextrec=" + nextrec + ",]";
	}

}