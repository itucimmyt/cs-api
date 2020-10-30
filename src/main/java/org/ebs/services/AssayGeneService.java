///////////////////////////////////////////////////////////
//  AssayGeneService.java
//  Macromedia ActionScript Implementation of the Interface AssayGeneService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:21 PM
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
import org.ebs.services.to.AssayGeneTo;
import org.ebs.services.to.Input.AssayGeneInput;
import org.ebs.services.to.TraitTo;
import org.ebs.services.to.MarkerTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:43:21 PM
 */
public interface AssayGeneService {

	/**
	 *
	 * @param AssayGene
	 */
	public AssayGeneTo createAssayGene(AssayGeneInput AssayGene);

	/**
	 *
	 * @param assayGeneId
	 */
	public int deleteAssayGene(int assayGeneId);

	/**
	 *
	 * @param assayGeneId
	 */
	public Optional<AssayGeneTo> findAssayGene(int assayGeneId);

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<AssayGeneTo> findAssayGenes(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters);

	/**
	 *
	 * @param assaygeneId
	 */
	public Set<MarkerTo> findMarkers(int assaygeneId);

	/**
	 *
	 * @param assaygeneId
	 */
	public Optional<TraitTo> findTrait(int assaygeneId);

	/**
	 *
	 * @param assayGene
	 */
	public AssayGeneTo modifyAssayGene(AssayGeneInput assayGene);

}