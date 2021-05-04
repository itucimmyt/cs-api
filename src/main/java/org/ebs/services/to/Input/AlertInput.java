///////////////////////////////////////////////////////////
//  AlertInput.java
//  Macromedia ActionScript Implementation of the Class AlertInput
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:41 AM
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
 * @created 02-May-2021 6:19:41 AM
 */
@Getter @Setter
public class AlertInput implements Serializable {

	private static final long serialVersionUID = 51301187;
	private int id;
	private int tenant;
	private String description;
	private HtmlTagInput htmltag;

}