///////////////////////////////////////////////////////////
//  PartnerService.java
//  Macromedia ActionScript Implementation of the Interface PartnerService
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.PartnerTo;
import org.ebs.services.to.Input.PartnerInput;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:55 PM
 */
public interface PartnerService {

	/**
	 * 
	 * @param Partner
	 */
	public PartnerTo createPartner(PartnerInput Partner);

	/**
	 * 
	 * @param partnerId
	 */
	public int deletePartner(int partnerId);

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
	 * @param partnerId
	 */
	public Optional<PersonTo> findPerson(int partnerId);

	/**
	 * 
	 * @param partner
	 */
	public PartnerTo modifyPartner(PartnerInput partner);

}