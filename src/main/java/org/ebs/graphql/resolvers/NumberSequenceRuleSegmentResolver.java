///////////////////////////////////////////////////////////
//  NumberSequenceRuleSegmentResolver.java
//  Macromedia ActionScript Implementation of the Class NumberSequenceRuleSegmentResolver
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:28 AM
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
 * @created 04-Sep-2020 10:05:28 AM
 */
@Component @Validated
public class NumberSequenceRuleSegmentResolver implements GraphQLResolver<NumberSequenceRuleSegmentTo> {

	private NumberSequenceRuleSegmentService numbersequencerulesegmentService;

	/**
	 * 
	 * @param numbersequencerulesegmentTo
	 */
	public NumberSequenceRuleTo getNumbersequencerule(NumberSequenceRuleSegmentTo numbersequencerulesegmentTo){
		return numbersequencerulesegmentService.findnumbersequencerule(numbersequencerulesegmentTo.getId()).get();
	}

	/**
	 * 
	 * @param numbersequencerulesegmentTo
	 */
	public SegmentTo getSegment(NumberSequenceRuleSegmentTo numbersequencerulesegmentTo){
		return numbersequencerulesegmentService.findsegment(numbersequencerulesegmentTo.getId()).get();
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