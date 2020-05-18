///////////////////////////////////////////////////////////
//  MarkerSynonymTo.java
//  Macromedia ActionScript Implementation of the Class MarkerSynonymTo
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:41 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import org.ebs.model.MarkerModel;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:41 PM
 */
public class MarkerSynonymTo implements Serializable {

	private static final long serialVersionUID = 168813735;
	private int id;
	private int tenant_id;
	private Integer synonym;
	MarkerTo marker;

	public int getId(){
		return id;
	}

	public MarkerTo getMarker(){
		return marker;
	}

	public Integer getsynonym(){
		return synonym;
	}

	public int getTenantId(){
		return tenant_id;
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
	public void setMarker(MarkerTo marker){
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
	 * @param id
	 */
	public void setTenantId(int id){
		this.tenant_id=id;
	}

}