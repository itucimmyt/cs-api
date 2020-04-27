///////////////////////////////////////////////////////////
//  HtmlTagInput.java
//  Macromedia ActionScript Implementation of the Class HtmlTagInput
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:40 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.TranslationModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:40 AM
 */
public class HtmlTagInput implements Serializable {

	private int id;
	private static final long serialVersionUID = -362778557;
	private String tagName;

	public int getId(){
		return id;
	}

	public String gettagName(){
		return tagName;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.id=id;
	}

	/**
	 * 
	 * @param tagname
	 */
	public void settagName(String tagname){
		this.tagName = tagname;
	}

}