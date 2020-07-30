///////////////////////////////////////////////////////////
//  NumberSequenceRuleSegmentResolver.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleSegmentResolver
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:54 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.NumberSequenceRuleSegmentTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.ebs.services.NumberSequenceRuleSegmentService;
import org.ebs.services.to.SegmentTo;
import org.ebs.services.to.NumberSequenceRuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:54 AM
 */
@Component @Validated
public class NumberSequenceRuleSegmentResolver implements GraphQLResolver<NumberSequenceRuleSegmentTo> {

	private NumberSequenceRuleSegmentService numbersequencerulesegmentService;

	/**
	 * 
	 * @param numbersequencerulesegmentTo
	 */
	public NumberSequenceRuleTo getNumbersequencerule(NumberSequenceRuleSegmentTo numbersequencerulesegmentTo){
		return numbersequencerulesegmentService.findNumberSequenceRule(numbersequencerulesegmentTo.getId()).get();
	}

	/**
	 * 
	 * @param numbersequencerulesegmentTo
	 */
	public SegmentTo getSegment(NumberSequenceRuleSegmentTo numbersequencerulesegmentTo){
		return numbersequencerulesegmentService.findSegment(numbersequencerulesegmentTo.getId()).get();
	}

	/**
	 * 
	 * @param numbersequencerulesegmentService
	 */
	@Autowired
	public NumberSequenceRuleSegmentResolver(NumberSequenceRuleSegmentService numbersequencerulesegmentService){
		this.numbersequencerulesegmentService = numbersequencerulesegmentService; 
	
	}

}