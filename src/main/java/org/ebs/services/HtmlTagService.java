///////////////////////////////////////////////////////////
//  HtmlTagService.java
//  Macromedia ActionScript Implementation of the Interface HtmlTagService
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:35 PM
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
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.Input.HtmlTagInput;
import org.ebs.services.to.TranslationTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:35 PM
 */
public interface HtmlTagService {

	/**
	 * 
	 * @param HtmlTag
	 */
	public HtmlTagTo createHtmlTag(HtmlTagInput HtmlTag);

	/**
	 * 
	 * @param htmltagId
	 */
	public int deleteHtmlTag(int htmltagId);

	/**
	 * 
	 * @param htmltagId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int htmltagId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<HtmlTagTo> findHtmlTags(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param htmltagId
	 */
	public Set<TranslationTo> findTranslations(int htmltagId);

	/**
	 * 
	 * @param htmltag
	 */
	public HtmlTagTo modifyHtmlTag(HtmlTagInput htmltag);

}