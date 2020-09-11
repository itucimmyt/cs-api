///////////////////////////////////////////////////////////
//  TeamService.java
//  Macromedia ActionScript Implementation of the Interface TeamService
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:43 PM
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
import org.ebs.services.to.TeamTo;
import org.ebs.services.to.Input.TeamInput;
import org.ebs.services.to.ProgramTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:43 PM
 */
public interface TeamService {

	/**
	 * 
	 * @param Team
	 */
	public TeamTo createTeam(TeamInput Team);

	/**
	 * 
	 * @param teamId
	 */
	public int deleteTeam(int teamId);

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
	public Optional<TeamTo> findTeam(int teamId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<TeamTo> findTeams(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param team
	 */
	public TeamTo modifyTeam(TeamInput team);

}