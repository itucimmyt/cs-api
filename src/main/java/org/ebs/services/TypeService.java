///////////////////////////////////////////////////////////
//  TypeService.java
//  Macromedia ActionScript Implementation of the Interface TypeService
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:03:00 AM
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
import org.ebs.services.to.TypeTo;
import org.ebs.services.to.Input.TypeInput;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:03:00 AM
 */
public interface TypeService {

	/**
	 * 
	 * @param Type
	 */
	public TypeTo createType(TypeInput Type);

	/**
	 * 
	 * @param typeId
	 */
	public int deleteType(int typeId);

	/**
	 * 
	 * @param typeId
	 */
	public Set<PersonTo> findPersons(int typeId);

	/**
	 * 
	 * @param typeId
	 */
	public Optional<TypeTo> findType(int typeId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<TypeTo> findTypes(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param type
	 */
	public TypeTo modifyType(TypeInput type);

}