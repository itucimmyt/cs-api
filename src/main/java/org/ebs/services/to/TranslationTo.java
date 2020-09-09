///////////////////////////////////////////////////////////
//  TranslationTo.java
//  Macromedia ActionScript Implementation of the Class TranslationTo
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:26 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:26 AM
 */
@Getter @Setter
public class TranslationTo implements Serializable {

	private static final long serialVersionUID = 161669628;
	private int id;
	private String translation;
	private int languageTo;
	private LanguageTo language;
	private HtmlTagTo htmlTag;

	@Override
	public String toString(){
		return "TranslationTo [languageTo=" + languageTo + ",]";
	}

}