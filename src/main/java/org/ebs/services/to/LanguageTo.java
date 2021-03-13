///////////////////////////////////////////////////////////
//  LanguageTo.java
//  Macromedia ActionScript Implementation of the Class LanguageTo
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:34 AM
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
 * @created 13-Mar-2021 12:02:34 AM
 */
@Getter @Setter
public class LanguageTo implements Serializable {

	private static final long serialVersionUID = -441613590;
	private int id;
	private String name;
	private String codeISO;
	private String isBase;
	private Set<TranslationTo> translations;
	private Set<PersonTo> persons;

	@Override
	public String toString(){
		return "LanguageTo []";
	}

}