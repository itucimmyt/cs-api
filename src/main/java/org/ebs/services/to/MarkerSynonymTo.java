///////////////////////////////////////////////////////////
//  MarkerSynonymTo.java
//  Macromedia ActionScript Implementation of the Class MarkerSynonymTo
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:27 AM
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
 * @created 07-Sep-2020 8:11:27 AM
 */
@Getter @Setter
public class MarkerSynonymTo implements Serializable {

	private static final long serialVersionUID = -43616168;
	private int id;
	private int tenant;
	private Integer synonym;
	private MarkerTo marker;

	@Override
	public String toString(){
		return "MarkerSynonymTo []";
	}

}