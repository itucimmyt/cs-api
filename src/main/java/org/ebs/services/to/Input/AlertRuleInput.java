///////////////////////////////////////////////////////////
//  AlertRuleInput.java
//  Macromedia ActionScript Implementation of the Class AlertRuleInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:16 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:16 PM
 */
@Getter @Setter
public class AlertRuleInput implements Serializable {

	private static final long serialVersionUID = -252210092;
	private int id;
	private int tenant;
	private String name;
	private String sql;
	private String filterClause;
	private AlertInput alert;

}