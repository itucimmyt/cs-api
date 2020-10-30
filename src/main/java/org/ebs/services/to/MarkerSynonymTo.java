///////////////////////////////////////////////////////////
//  MarkerSynonymTo.java
//  Macromedia ActionScript Implementation of the Class MarkerSynonymTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:55 PM
 */
@Getter @Setter
public class MarkerSynonymTo implements Serializable {

	private static final long serialVersionUID = 415253834;
	private int id;
	private int tenant;
	private Integer synonym;
	private MarkerTo marker;

	@Override
	public String toString(){
		return "MarkerSynonymTo []";
	}

}