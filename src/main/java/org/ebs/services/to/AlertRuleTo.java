///////////////////////////////////////////////////////////
//  AlertRuleTo.java
//  Macromedia ActionScript Implementation of the Class AlertRuleTo
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:42 AM
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
 * @created 02-May-2021 6:19:42 AM
 */
@Getter @Setter
public class AlertRuleTo implements Serializable {

	private static final long serialVersionUID = -469802775;
	private int id;
	private int tenant;
	private String name;
	private String sql;
	private String filterClause;
	private AlertTo alert;

	@Override
	public String toString(){
		return "AlertRuleTo []";
	}

}