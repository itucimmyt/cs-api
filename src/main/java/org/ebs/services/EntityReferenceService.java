///////////////////////////////////////////////////////////
//  EntityReferenceService.java
//  Macromedia ActionScript Implementation of the Interface EntityReferenceService
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:06:34 PM
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
import org.ebs.services.to.SegmentTo;
import org.ebs.services.to.NumberSequenceRuleTo;
import org.ebs.services.to.EmailTemplateTo;
import org.ebs.services.to.AttributesTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:06:34 PM
 */
public interface EntityReferenceService {

	/**
	 * 
	 * @param EntityReference
	 */
	public EntityReferenceTo createEntityReference(EntityReferenceInput EntityReference);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public int deleteEntityReference(int entityreferenceId);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<AttributesTo> findAttributess(int entityreferenceId);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Optional<EntityReferenceTo> findEntityReference(int entityreferenceId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<EntityReferenceTo> findEntityReferences(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param entityreferenceId
	 */
	public Set<SegmentTo> findSegments(int entityreferenceId);

	/**
	 * 
	 * @param entityreference
	 */
	public EntityReferenceTo modifyEntityReference(EntityReferenceInput entityreference);

}