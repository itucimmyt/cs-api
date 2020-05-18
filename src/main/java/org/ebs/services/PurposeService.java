///////////////////////////////////////////////////////////
//  PurposeService.java
//  Macromedia ActionScript Implementation of the Interface PurposeService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:05 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.util.Utils;
import org.ebs.model.repos.PurposeRepository;
import org.springframework.stereotype.Service;
import org.ebs.services.to.PurposeTo;
import org.ebs.services.to.Input.PurposeInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:05 PM
 */
public interface PurposeService {

	/**
	 * 
	 * @param Purpose
	 */
	public PurposeTo createPurpose(PurposeInput Purpose);

	/**
	 * 
	 * @param idpurpose
	 */
	public int deletePurpose(int idpurpose);

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
	 * @param purpose
	 */
	public PurposeTo modifyPurpose(PurposeInput purpose);

}