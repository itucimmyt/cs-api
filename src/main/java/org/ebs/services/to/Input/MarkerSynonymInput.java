///////////////////////////////////////////////////////////
//  MarkerSynonymInput.java
//  Macromedia ActionScript Implementation of the Class MarkerSynonymInput
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:42 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:42 PM
 */
public class MarkerSynonymInput implements Serializable {

	private static final long serialVersionUID = -146262137;
	private int id;
	private int tenant;
	private Integer synonym;
	MarkerInput marker;

	public int getId(){
		return id;
	}

	public MarkerInput getMarker(){
		return marker;
	}

	public Integer getsynonym(){
		return synonym;
	}

	public int getTenant(){
		return tenant;
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
	 * @param marker
	 */
	public void setMarker(MarkerInput marker){
		this.marker =marker;
	}

	/**
	 * 
	 * @param synonym
	 */
	public void setsynonym(Integer synonym){
		this.synonym = synonym;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

}