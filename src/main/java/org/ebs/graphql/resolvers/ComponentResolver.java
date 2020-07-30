///////////////////////////////////////////////////////////
//  ComponentResolver.java
//  Macromedia ActionScript Implementation of the Class ComponentResolver
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:16 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.ComponentTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.ComponentService;
import org.ebs.services.to.ModuleTo;
import org.ebs.services.to.HtmlTagTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:16 AM
 */
@Component @Validated
public class ComponentResolver implements GraphQLResolver<ComponentTo> {

	private ComponentService componentService;

	/**
	 * 
	 * @param componentService
	 */
	@Autowired
	public ComponentResolver(ComponentService componentService){
		this.componentService = componentService; 
	
	}

	/**
	 * 
	 * @param componentTo
	 */
	public HtmlTagTo getHtmltag(ComponentTo componentTo){
		return componentService.findHtmlTag(componentTo.getId()).get();
	}

	/**
	 * 
	 * @param component
	 */
	public Set<ModuleTo> getModules(ComponentTo component){
		return componentService.findModules(component.getId());
	}

}