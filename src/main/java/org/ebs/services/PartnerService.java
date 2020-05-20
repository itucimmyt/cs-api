///////////////////////////////////////////////////////////
//  PartnerService.java
//  Macromedia ActionScript Implementation of the Interface PartnerService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:50 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.services.to.PartnerTo;
import org.ebs.services.to.Input.PartnerInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:50 PM
 */
public interface PartnerService {

	/**
	 * 
	 * @param Partner
	 */
	public PartnerTo createPartner(PartnerInput Partner);

	/**
	 * 
	 * @param idpartner
	 */
	public int deletePartner(int idpartner);

	/**
	 * 
	 * @param partnerId
	 */
	public Optional<PartnerTo> findPartner(int partnerId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<PartnerTo> findPartners(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param partner
	 */
	public PartnerTo modifyPartner(PartnerInput partner);

}