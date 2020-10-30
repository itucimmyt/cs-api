///////////////////////////////////////////////////////////
//  NumberSequenceRuleResolver.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleResolver
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:03 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.NumberSequenceRuleTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.NumberSequenceRuleService;
import org.ebs.services.to.NumberSequenceRuleSegmentTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.EntityReferenceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:03 PM
 */
@Component @Validated
public class NumberSequenceRuleResolver implements GraphQLResolver<NumberSequenceRuleTo> {

	private NumberSequenceRuleService numbersequenceruleService;

	/**
	 * 
	 * @param numbersequenceruleTo
	 */
	public Set<EntityReferenceTo> getEntityreferences(NumberSequenceRuleTo numbersequenceruleTo){
		return numbersequenceruleService.findEntityReferences(numbersequenceruleTo.getId());
	}

	/**
	 * 
	 * @param numbersequencerule
	 */
	public Set<NumberSequenceRuleSegmentTo> getNumbersequencerulesegments(NumberSequenceRuleTo numbersequencerule){
		return numbersequenceruleService.findNumberSequenceRuleSegments(numbersequencerule.getId());
	}

	/**
	 * 
	 * @param numbersequenceruleTo
	 */
	public TenantTo getTenant(NumberSequenceRuleTo numbersequenceruleTo){
		return numbersequenceruleService.findTenant(numbersequenceruleTo.getId()).get();
	}

	/**
	 * 
	 * @param numbersequenceruleService
	 */
	@Autowired
	public NumberSequenceRuleResolver(NumberSequenceRuleService numbersequenceruleService){
		this.numbersequenceruleService = numbersequenceruleService; 
	
	}

}