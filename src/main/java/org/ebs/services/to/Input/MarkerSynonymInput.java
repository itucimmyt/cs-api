///////////////////////////////////////////////////////////
//  MarkerSynonymInput.java
//  Macromedia ActionScript Implementation of the Class MarkerSynonymInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:26 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:26 AM
 */
@Getter @Setter
public class MarkerSynonymInput implements Serializable {

	private static final long serialVersionUID = -431393349;
	private int id;
	private int tenant;
	private Integer synonym;
	private MarkerInput marker;

}