///////////////////////////////////////////////////////////
//  AddressTo.java
//  Macromedia ActionScript Implementation of the Class AddressTo
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:01 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to;

import java.io.Serializable;
import java.util.Set;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:01 AM
 */
public class AddressTo implements Serializable {

	private static final long serialVersionUID = 358221740;
	private int id;
	private int tenant;
	private String locality;
	private String region;
	private String postOfficeBoxNumber;
	private String postalCode;
	private String streetAddress;
	CountryTo country;
	Set<PersonTo> persons;

	public CountryTo getcountry(){
		return country;
	}

	public int getId(){
		return id;
	}

	public String getlocality(){
		return locality;
	}

	public Set<PersonTo> getpersons(){
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
	public void setcountry(CountryTo country){
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
	 * @param person
	 */
	public void setpersons(Set<PersonTo> person){
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
		return "AddressTo []";
	}

}