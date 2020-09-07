///////////////////////////////////////////////////////////
//  AssayGeneResolver.java
//  Macromedia ActionScript Implementation of the Class AssayGeneResolver
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:10:54 AM
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
 * @created 07-Sep-2020 8:10:54 AM
 */
@Component @Validated
public class AssayGeneResolver implements GraphQLResolver<AssayGeneTo> {

	private AssayGeneService assayGeneService;

	/**
	 * 
	 * @param assaygeneService
	 */
	@Autowired
	public AssayGeneResolver(AssayGeneService assaygeneService){
		this.assayGeneService = assaygeneService; 
	
	}

	/**
	 * 
	 * @param assayGene
	 */
	public Set<MarkerTo> getMarkers(AssayGeneTo assayGene){
		return assayGeneService.findMarkers(assayGene.getId());
	}

	/**
	 * 
	 * @param assayGeneTo
	 */
	public TraitTo getTrait(AssayGeneTo assayGeneTo){
		return assayGeneService.findTrait(assayGeneTo.getId()).get();
	}

}