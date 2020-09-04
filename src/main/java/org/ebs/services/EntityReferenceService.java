///////////////////////////////////////////////////////////
//  EntityReferenceService.java
//  Macromedia ActionScript Implementation of the Interface EntityReferenceService
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:05:06 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import java.util.Set;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.Input.EntityReferenceInput;
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.ebs.services.to.EmailTemplateTo;
import org.ebs.services.to.WorkflowTo;
import org.ebs.services.to.SegmentTo;
import org.ebs.services.to.WorkflowNodeTo;
import org.ebs.services.to.NumberSequenceRuleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:05:06 AM
 */
public interface EntityReferenceService {

	/**
	 * 
	 * @param EntityReference
	 */
	public EntityReferenceTo createentityreference(EntityReferenceInput EntityReference);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public int deleteentityreference(int entityreferenceId);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<AttributesTo> findattributess(int entityreferenceId);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<EmailTemplateTo> findemailtemplates(int entityreferenceId);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Optional<EntityReferenceTo> findentityreference(int entityreferenceId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<EntityReferenceTo> findentityreferences(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<NumberSequenceRuleTo> findnumbersequencerules(int entityreferenceId);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<SegmentTo> findsegments(int entityreferenceId);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<WorkflowNodeCFTo> findworkflownodecfs(int entityreferenceId);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<WorkflowNodeTo> findworkflownodes(int entityreferenceId);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<WorkflowTo> findworkflows(int entityreferenceId);

	/**
	 * 
	 * @param entityreference
	 */
	public EntityReferenceTo modifyentityreference(EntityReferenceInput entityreference);

}