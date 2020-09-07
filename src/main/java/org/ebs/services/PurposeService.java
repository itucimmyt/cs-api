///////////////////////////////////////////////////////////
//  PurposeService.java
//  Macromedia ActionScript Implementation of the Interface PurposeService
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:53 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import java.util.Set;
import org.springframework.stereotype.Service;
import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.Input.PurposeInput;
import org.ebs.services.to.ServiceTypeTo;
import org.ebs.services.to.ServiceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:53 AM
 */
public interface PurposeService {

	/**
	 * 
	 * @param Purpose
	 */
	public PurposeTo createPurpose(PurposeInput Purpose);

	/**
	 * 
	 * @param purposeId
	 */
	public int deletePurpose(int purposeId);

	/**
	 * 
	 * @param purposeId
	 */
	public Optional<PurposeTo> findPurpose(int purposeId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<PurposeTo> findPurposes(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param purposeId
	 */
	public Set<ServiceTo> findServices(int purposeId);

	/**
	 * 
	 * @param purposeId
	 */
	public Optional<ServiceTypeTo> findServiceType(int purposeId);

	/**
	 * 
	 * @param purpose
	 */
	public PurposeTo modifyPurpose(PurposeInput purpose);

}