///////////////////////////////////////////////////////////
//  NumberSequenceRuleSegmentService.java
//  Macromedia ActionScript Implementation of the Interface NumberSequenceRuleSegmentService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:04 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.NumberSequenceRuleSegmentTo;
import org.ebs.services.to.Input.NumberSequenceRuleSegmentInput;
import org.ebs.services.to.SegmentTo;
import org.ebs.services.to.NumberSequenceRuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:04 PM
 */
public interface NumberSequenceRuleSegmentService {

	/**
	 * 
	 * @param NumberSequenceRuleSegment
	 */
	public NumberSequenceRuleSegmentTo createNumberSequenceRuleSegment(NumberSequenceRuleSegmentInput NumberSequenceRuleSegment);

	/**
	 * 
	 * @param numberSequenceRuleSegmentId
	 */
	public int deleteNumberSequenceRuleSegment(int numberSequenceRuleSegmentId);

	/**
	 * 
	 * @param numbersequencerulesegmentId
	 */
	public Optional<NumberSequenceRuleTo> findNumberSequenceRule(int numbersequencerulesegmentId);

	/**
	 * 
	 * @param numberSequenceRuleSegmentId
	 */
	public Optional<NumberSequenceRuleSegmentTo> findNumberSequenceRuleSegment(int numberSequenceRuleSegmentId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<NumberSequenceRuleSegmentTo> findNumberSequenceRuleSegments(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param numbersequencerulesegmentId
	 */
	public Optional<SegmentTo> findSegment(int numbersequencerulesegmentId);

	/**
	 * 
	 * @param numberSequenceRuleSegment
	 */
	public NumberSequenceRuleSegmentTo modifyNumberSequenceRuleSegment(NumberSequenceRuleSegmentInput numberSequenceRuleSegment);

}