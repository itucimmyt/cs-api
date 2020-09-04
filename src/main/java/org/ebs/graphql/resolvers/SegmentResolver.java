///////////////////////////////////////////////////////////
//  SegmentResolver.java
//  Macromedia ActionScript Implementation of the Class SegmentResolver
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:59 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.ebs.services.to.SegmentTo;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.Set;
import org.ebs.services.SegmentService;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.NumberSequenceRuleSegmentTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:59 AM
 */
@Component @Validated
public class SegmentResolver implements GraphQLResolver<SegmentTo> {

	private SegmentService segmentService;

	/**
	 * 
	 * @param segmentTo
	 */
	public EntityReferenceTo getEntityreference(SegmentTo segmentTo){
		return segmentService.findentityreference(segmentTo.getId()).get();
	}

	/**
	 * 
	 * @param segment
	 */
	public Set<NumberSequenceRuleSegmentTo> getNumbersequencerulesegments(SegmentTo segment){
		return segmentService.findnumbersequencerulesegments(segment.getId());
	}

	/**
	 * 
	 * @param segmentService
	 */
	@Autowired
	public SegmentResolver(SegmentService segmentService){
		this.segmentService = segmentService; 
	
	}

}