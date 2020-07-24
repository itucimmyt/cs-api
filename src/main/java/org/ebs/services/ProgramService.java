///////////////////////////////////////////////////////////
//  ProgramService.java
//  Macromedia ActionScript Implementation of the Interface ProgramService
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:46:56 PM
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
import org.ebs.services.to.ProgramTo;
import org.ebs.services.to.Input.ProgramInput;
import org.ebs.services.to.ProjectTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.CropTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:46:56 PM
 */
public interface ProgramService {

	/**
	 * 
	 * @param Program
	 */
	public ProgramTo createProgram(ProgramInput Program);

	/**
	 * 
	 * @param programId
	 */
	public int deleteProgram(int programId);

	/**
	 * 
	 * @param programId
	 */
	public Optional<CropTo> findCrop(int programId);

	/**
	 * 
	 * @param programId
	 */
	public Optional<ProgramTo> findProgram(int programId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ProgramTo> findPrograms(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param programId
	 */
	public Set<ProjectTo> findProjects(int programId);

	/**
	 * 
	 * @param programId
	 */
	public Optional<TenantTo> findTenant(int programId);

	/**
	 * 
	 * @param program
	 */
	public ProgramTo modifyProgram(ProgramInput program);

}