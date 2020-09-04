///////////////////////////////////////////////////////////
//  NotificationInput.java
//  Macromedia ActionScript Implementation of the Class NotificationInput
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:25 AM
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
 * @created 04-Sep-2020 10:05:25 AM
 */
@Getter @Setter
public class NotificationInput implements Serializable {

	private static final long serialVersionUID = -293252609;
	private int id;
	private int tenant;
	private String description;
	private String sql;
	private String filterclause;
	private HtmlTagInput htmltag;

}