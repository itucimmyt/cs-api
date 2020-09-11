///////////////////////////////////////////////////////////
//  ProjectTo.java
//  Macromedia ActionScript Implementation of the Class ProjectTo
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:19 PM
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
 * @created 10-Sep-2020 10:44:19 PM
 */
@Getter @Setter
public class ProjectTo implements Serializable {

	private static final long serialVersionUID = -67626988;
	private int id;
	private int tenant;
	private int leaderid;
	private String projectcode;
	private String projectname;
	private String projectstatus;
	private String description;
	private ProgramTo program;
	private PersonTo person;

	@Override
	public String toString(){
		return "ProjectTo [leader_id=" + leaderid + ",]";
	}

}