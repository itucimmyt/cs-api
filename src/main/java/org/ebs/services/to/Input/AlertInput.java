///////////////////////////////////////////////////////////
//  AlertInput.java
//  Macromedia ActionScript Implementation of the Class AlertInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:10:48 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:10:48 AM
 */
@Getter @Setter
public class AlertInput implements Serializable {

	private static final long serialVersionUID = -154817801;
	private int id;
	private int tenant;
	private String description;
	private HtmlTagInput htmlTag;

}