///////////////////////////////////////////////////////////
//  AddressInput.java
//  Macromedia ActionScript Implementation of the Class AddressInput
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:17 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:17 PM
 */
public class AddressInput implements Serializable {

	private static final long serialVersionUID = -164164337;
	private int id;
	private int tenant;
	private String locality;
	private String region;
	private String postOfficeBoxNumber;
	private String postalCode;
	private String streetAddress;
	CountryInput country;

	public CountryInput getcountry(){
		return country;
	}

	public int getId(){
		return id;
	}

	public String getlocality(){
		return locality;
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
	public void setcountry(CountryInput country){
		this.country =country;
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

}