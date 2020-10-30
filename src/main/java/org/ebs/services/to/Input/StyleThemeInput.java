///////////////////////////////////////////////////////////
//  StyleThemeInput.java
//  Macromedia ActionScript Implementation of the Class StyleThemeInput
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:40 PM
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
 * @created 10-Sep-2020 10:44:40 PM
 */
@Getter @Setter
public class StyleThemeInput implements Serializable {

	private static final long serialVersionUID = -277769780;
	private int id;
	private int tenant;
	private String description;
	private String path;
	private String physicalName;
	private Boolean isDefault;

}