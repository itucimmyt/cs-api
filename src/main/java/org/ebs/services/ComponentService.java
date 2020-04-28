///////////////////////////////////////////////////////////
//  ComponentService.java
//  Macromedia ActionScript Implementation of the Interface ComponentService
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:06:56 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.util.Utils;
import org.ebs.services.to.ComponentTo;
import org.ebs.services.to.Input.ComponentInput;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:06:56 AM
 */
public interface ComponentService {

	/**
	 * 
	 * @param Component
	 */
	public ComponentTo createComponent(ComponentInput Component);

	/**
	 * 
	 * @param idcomponent
	 */
	public int deleteComponent(int idcomponent);

	/**
	 * 
	 * @param componentId
	 */
	public Optional<ComponentTo> findComponent(int componentId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ComponentTo> findComponents(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param component
	 */
	public ComponentTo modifyComponent(ComponentInput component);

}