///////////////////////////////////////////////////////////
//  TraitClassResolver.java
//  Macromedia ActionScript Implementation of the Class TraitClassResolver
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:22 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.TraitClassTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.TraitClassService;
import org.ebs.services.to.TraitTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:22 AM
 */
@Component @Validated
public class TraitClassResolver implements GraphQLResolver<TraitClassTo> {

	private TraitClassService traitClassService;

	/**
	 * 
	 * @param traitClass
	 */
	public Set<TraitTo> getTraits(TraitClassTo traitClass){
		return traitClassService.findTraits(traitClass.getId());
	}

	/**
	 * 
	 * @param traitclassService
	 */
	@Autowired
	public TraitClassResolver(TraitClassService traitclassService){
		this.traitClassService = traitclassService; 
	
	}

}