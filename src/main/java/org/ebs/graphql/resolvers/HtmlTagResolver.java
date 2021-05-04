///////////////////////////////////////////////////////////
//  HtmlTagResolver.java
//  Macromedia ActionScript Implementation of the Class HtmlTagResolver
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:50 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.HtmlTagTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.HtmlTagService;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.MessageTo;
import org.ebs.services.to.DomainTo;
import org.ebs.services.to.AlertTo;
import org.ebs.services.to.TranslationTo;
import org.ebs.services.to.ProductTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:19:50 AM
 */
@Component @Validated
public class HtmlTagResolver implements GraphQLResolver<HtmlTagTo> {

	private HtmlTagService htmltagService;

	/**
	 * 
	 * @param htmltag
	 */
	public Set<AlertTo> getAlerts(HtmlTagTo htmltag){
		return htmltagService.findAlerts(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<AttributesTo> getAttributess(HtmlTagTo htmltag){
		return htmltagService.findAttributess(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<DomainTo> getDomains(HtmlTagTo htmltag){
		return htmltagService.findDomains(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<MessageTo> getMessages(HtmlTagTo htmltag){
		return htmltagService.findMessages(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<ProductTo> getProducts(HtmlTagTo htmltag){
		return htmltagService.findProducts(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltag
	 */
	public Set<TranslationTo> getTranslations(HtmlTagTo htmltag){
		return htmltagService.findTranslations(htmltag.getId());
	}

	/**
	 * 
	 * @param htmltagService
	 */
	@Autowired
	public HtmlTagResolver(HtmlTagService htmltagService){
		this.htmltagService = htmltagService; 
	
	}

}