///////////////////////////////////////////////////////////
//  LanguageInput.java
//  Macromedia ActionScript Implementation of the Class LanguageInput
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:39 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:39 AM
 */
public class LanguageInput implements Serializable {

	private static final long serialVersionUID = -236665693;
	private int id;
	private String name;
	private String codeISO;
	private String isbase;

	public String getcodeISO(){
		return codeISO;
	}

	public int getId(){
		return id;
	}

	public String getisbase(){
		return isbase;
	}

	public String getname(){
		return name;
	}

	/**
	 * 
	 * @param codeiso
	 */
	public void setcodeISO(String codeiso){
		this.codeISO = codeiso;
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
	 * @param isbase
	 */
	public void setisbase(String isbase){
		this.isbase = isbase;
	}

	/**
	 * 
	 * @param name
	 */
	public void setname(String name){
		this.name = name;
	}

}