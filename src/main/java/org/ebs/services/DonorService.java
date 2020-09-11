///////////////////////////////////////////////////////////
//  DonorService.java
//  Macromedia ActionScript Implementation of the Interface DonorService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:40 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.DonorTo;
import org.ebs.services.to.Input.DonorInput;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:40 PM
 */
public interface DonorService {

	/**
	 * 
	 * @param Donor
	 */
	public DonorTo createDonor(DonorInput Donor);

	/**
	 * 
	 * @param donorId
	 */
	public int deleteDonor(int donorId);

	/**
	 * 
	 * @param donorId
	 */
	public Optional<DonorTo> findDonor(int donorId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<DonorTo> findDonors(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param donorId
	 */
	public Optional<PersonTo> findPerson(int donorId);

	/**
	 * 
	 * @param donor
	 */
	public DonorTo modifyDonor(DonorInput donor);

}