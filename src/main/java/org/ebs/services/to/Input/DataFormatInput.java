///////////////////////////////////////////////////////////
//  DataFormatInput.java
//  Macromedia ActionScript Implementation of the Class DataFormatInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:19:08 AM
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
 * @created 10-Sep-2020 12:19:08 AM
 */
@Getter @Setter
public class DataFormatInput implements Serializable {

	private static final long serialVersionUID = 197068900;
	private int id;
	private int tenant;
	private String name;
	private String description;

}