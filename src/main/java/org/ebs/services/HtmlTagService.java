///////////////////////////////////////////////////////////
//  HtmlTagService.java
//  Macromedia ActionScript Implementation of the Interface HtmlTagService
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:40 AM
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
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.Input.HtmlTagInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:40 AM
 */
public interface HtmlTagService {

	/**
	 * 
	 * @param HtmlTag
	 */
	public HtmlTagTo createHtmlTag(HtmlTagInput HtmlTag);

	/**
	 * 
	 * @param idhtmltag
	 */
	public int deleteHtmlTag(int idhtmltag);

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
	 * @param htmltag
	 */
	public HtmlTagTo modifyHtmlTag(HtmlTagInput htmltag);

}