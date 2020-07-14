///////////////////////////////////////////////////////////
//  AttributesService.java
//  Macromedia ActionScript Implementation of the Interface AttributesService
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:13 PM
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
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.Input.AttributesInput;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.to.EntityReferenceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:13 PM
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
	public Set<TranslationTo> findTranslations(int attributesId);

	/**
	 * 
	 * @param attributes
	 */
	public AttributesTo modifyAttributes(AttributesInput attributes);

}