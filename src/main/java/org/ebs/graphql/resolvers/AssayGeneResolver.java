///////////////////////////////////////////////////////////
//  AssayGeneResolver.java
//  Macromedia ActionScript Implementation of the Class AssayGeneResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:20 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.AssayGeneTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.AssayGeneService;
import org.ebs.services.to.TraitTo;
import org.ebs.services.to.MarkerTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:20 PM
 */
@Component @Validated
public class AssayGeneResolver implements GraphQLResolver<AssayGeneTo> {

	private AssayGeneService assaygeneService;

	/**
	 * 
	 * @param assaygeneService
	 */
	@Autowired
	public AssayGeneResolver(AssayGeneService assaygeneService){
		this.assaygeneService = assaygeneService; 
	
	}

	/**
	 * 
	 * @param assaygene
	 */
	public Set<MarkerTo> getMarkers(AssayGeneTo assaygene){
		return assaygeneService.findMarkers(assaygene.getId());
	}

	/**
	 * 
	 * @param assaygeneTo
	 */
	public TraitTo getTrait(AssayGeneTo assaygeneTo){
		return assaygeneService.findTrait(assaygeneTo.getId()).get();
	}

}