///////////////////////////////////////////////////////////
//  DataFormatService.java
//  Macromedia ActionScript Implementation of the Interface DataFormatService
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:09:31 PM
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
import org.ebs.model.repos.DataFormatRepository;
import org.ebs.services.to.DataFormatTo;
import org.ebs.services.to.Input.DataFormatInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:09:31 PM
 */
public interface DataFormatService {

	/**
	 * 
	 * @param DataFormat
	 */
	public DataFormatTo createDataFormat(DataFormatInput DataFormat);

	/**
	 * 
	 * @param iddataformat
	 */
	public int deleteDataFormat(int iddataformat);

	/**
	 * 
	 * @param dataformatId
	 */
	public Optional<DataFormatTo> findDataFormat(int dataformatId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<DataFormatTo> findDataFormats(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param dataformat
	 */
	public DataFormatTo modifyDataFormat(DataFormatInput dataformat);

}