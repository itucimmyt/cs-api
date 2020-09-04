///////////////////////////////////////////////////////////
//  EmailTemplateTo.java
//  Macromedia ActionScript Implementation of the Class EmailTemplateTo
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:05 AM
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
 * @created 04-Sep-2020 10:05:05 AM
 */
@Getter @Setter
public class EmailTemplateTo implements Serializable {

	private static final long serialVersionUID = 389218659;
	private int id;
	private String name;
	private String subject;
	private String template;
	private Set<EntityReferenceTo> entityreferences;
	private TenantTo tenant;

	@Override
	public String toString(){
		return "EmailTemplateTo []";
	}

}