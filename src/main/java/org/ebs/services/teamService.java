///////////////////////////////////////////////////////////
//  teamService.java
//  Macromedia ActionScript Implementation of the Interface teamService
//  Generated by Enterprise Architect
//  Created on:      09-Aug-2020 4:51:36 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.ebs.services.to.PersonTo;
import org.ebs.services.to.ProgramTo;
import org.ebs.services.to.teamTo;
import org.ebs.services.to.Input.teamInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 09-Aug-2020 4:51:36 PM
 */
public interface teamService {

	/**
	 * 
	 * @param team
	 */
	public teamTo createteam(teamInput team);

	/**
	 * 
	 * @param teamId
	 */
	public int deleteteam(int teamId);

	/**
	 * 
	 * @param teamId
	 */
	public Set<PersonTo> findPersons(int teamId);

	/**
	 * 
	 * @param teamId
	 */
	public Set<ProgramTo> findPrograms(int teamId);

	/**
	 * 
	 * @param teamId
	 */
	public Optional<teamTo> findteam(int teamId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<teamTo> findteams(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param team
	 */
	public teamTo modifyteam(teamInput team);

}