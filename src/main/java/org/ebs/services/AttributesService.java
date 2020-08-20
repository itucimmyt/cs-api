///////////////////////////////////////////////////////////
//  AttributesService.java
//  Macromedia ActionScript Implementation of the Interface AttributesService
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:26 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.Input.AttributesInput;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.HtmlTagTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:26 PM
 */
public interface AttributesService {

	/**
	 * 
	 * @param Attributes
	 */
	public AttributesTo createAttributes(AttributesInput Attributes);

	/**
	 * 
	 * @param attributesId
	 */
	public int deleteAttributes(int attributesId);

	/**
	 * 
	 * @param attributesId
	 */
	public Optional<AttributesTo> findAttributes(int attributesId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<AttributesTo> findAttributess(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param attributesId
	 */
	public Optional<EntityReferenceTo> findEntityReference(int attributesId);

	/**
	 * 
	 * @param attributesId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int attributesId);

	/**
	 * 
	 * @param attributes
	 */
	public AttributesTo modifyAttributes(AttributesInput attributes);

}