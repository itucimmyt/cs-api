///////////////////////////////////////////////////////////
//  AddressTo.java
//  Macromedia ActionScript Implementation of the Class AddressTo
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:05 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:05 PM
 */
public class AddressTo implements Serializable {

	private static final long serialVersionUID = -447722836;
	private int id;
	private int tenant;
	private int country;
	private String locality;
	private String region;
	private String postOfficeBoxNumber;
	private String postalCode;
	private String streetAddress;
	Set<PersonTo> persons;

	public int getcountry(){
		return country;
	}

	public int getId(){
		return id;
	}

	public String getlocality(){
		return locality;
	}

	public Set<PersonTo> getPersons(){
		return persons;
	}

	public String getpostalCode(){
		return postalCode;
	}

	public String getpostOfficeBoxNumber(){
		return postOfficeBoxNumber;
	}

	public String getregion(){
		return region;
	}

	public String getstreetAddress(){
		return streetAddress;
	}

	public int getTenant(){
		return tenant;
	}

	/**
	 * 
	 * @param country
	 */
	public void setcountry(int country){
		this.country = country;
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
	 * @param locality
	 */
	public void setlocality(String locality){
		this.locality = locality;
	}

	/**
	 * 
	 * @param person
	 */
	public void setPersons(Set<PersonTo> person){
		this.persons =person;
	}

	/**
	 * 
	 * @param postalcode
	 */
	public void setpostalCode(String postalcode){
		this.postalCode = postalcode;
	}

	/**
	 * 
	 * @param postofficeboxnumber
	 */
	public void setpostOfficeBoxNumber(String postofficeboxnumber){
		this.postOfficeBoxNumber = postofficeboxnumber;
	}

	/**
	 * 
	 * @param region
	 */
	public void setregion(String region){
		this.region = region;
	}

	/**
	 * 
	 * @param streetaddress
	 */
	public void setstreetAddress(String streetaddress){
		this.streetAddress = streetaddress;
	}

	/**
	 * 
	 * @param tenantid
	 */
	public void setTenant(int tenantid){
		this.tenant=tenantid;
	}

	@Override
	public String toString(){
		return "AddressTo [country=" + country + ",]";
	}

}