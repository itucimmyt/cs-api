///////////////////////////////////////////////////////////
//  DataFormatService.java
//  Macromedia ActionScript Implementation of the Interface DataFormatService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:04:59 AM
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
import org.ebs.services.to.DataFormatTo;
import org.ebs.services.to.Input.DataFormatInput;
import org.ebs.services.to.VendorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:04:59 AM
 */
public interface DataFormatService {

	/**
	 * 
	 * @param DataFormat
	 */
	public DataFormatTo createdataformat(DataFormatInput DataFormat);

	/**
	 * 
	 * @param dataformatId
	 */
	public int deletedataformat(int dataformatId);

	/**
	 * 
	 * @param dataformatId
	 */
	public Optional<DataFormatTo> finddataformat(int dataformatId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<DataFormatTo> finddataformats(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param dataformatId
	 */
	public Set<VendorTo> findvendors(int dataformatId);

	/**
	 * 
	 * @param dataformat
	 */
	public DataFormatTo modifydataformat(DataFormatInput dataformat);

}