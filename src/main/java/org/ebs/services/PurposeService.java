///////////////////////////////////////////////////////////
//  PurposeService.java
//  Macromedia ActionScript Implementation of the Interface PurposeService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:47 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.ServiceTo;
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.Input.PurposeInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:47 AM
 */
public interface PurposeService {

	/**
	 * 
	 * @param Purpose
	 */
	public PurposeTo createpurpose(PurposeInput Purpose);

	/**
	 * 
	 * @param purposeId
	 */
	public int deletepurpose(int purposeId);

	/**
	 * 
	 * @param purposeId
	 */
	public Optional<PurposeTo> findpurpose(int purposeId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<PurposeTo> findpurposes(PageInput page, SortInput sort, List<FilterInput> filters);

	 
	/**
	 * 
	 * @param purposeId
	 */
	public Set<ServiceTo> findservices(int purposeId);

	/**
	 * 
	 * @param purposeId
	 */
	public Optional<ServiceTypeTo> findservicetype(int purposeId);

	/**
	 * 
	 * @param purpose
	 */
	public PurposeTo modifypurpose(PurposeInput purpose);

}