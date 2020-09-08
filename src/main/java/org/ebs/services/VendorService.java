///////////////////////////////////////////////////////////
//  VendorService.java
//  Macromedia ActionScript Implementation of the Interface VendorService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:27 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.ebs.services.to.DataFormatTo;
import org.ebs.services.to.MarkerTo;
import org.ebs.services.to.PersonTo;
import org.ebs.services.to.ServiceTo;
import org.ebs.services.to.TechnologyPlatformTo;
import org.ebs.services.to.VendorTo;
import org.ebs.services.to.Input.VendorInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:27 AM
 */
public interface VendorService {

	/**
	 * 
	 * @param Vendor
	 */
	public VendorTo createvendor(VendorInput Vendor);

	/**
	 * 
	 * @param vendorId
	 */
	public int deletevendor(int vendorId);

	/**
	 * 
	 * @param vendorId
	 */
	public Optional<DataFormatTo> finddataformat(int vendorId);

	/**
	 * 
	 * @param vendorId
	 */
	public Set<MarkerTo> findmarkers(int vendorId);

	/**
	 * 
	 * @param vendorId
	 */
	public Optional<PersonTo> findperson(int vendorId);

	/**
	 * 
	 * @param vendorId
	 */
	public Set<ServiceTo> findservices(int vendorId);

	/**
	 * 
	 * @param vendorId
	 */
	public Optional<TechnologyPlatformTo> findtechnologyplatform(int vendorId);

	/**
	 * 
	 * @param vendorId
	 */
	public Optional<VendorTo> findvendor(int vendorId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<VendorTo> findvendors(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param vendor
	 */
	public VendorTo modifyvendor(VendorInput vendor);

}