///////////////////////////////////////////////////////////
//  CfValueService.java
//  Macromedia ActionScript Implementation of the Interface CfValueService
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:23 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import org.ebs.services.to.CfValueTo;
import org.ebs.services.to.Input.CfValueInput;
import org.ebs.services.to.RequestTo;
import org.ebs.services.to.NodeCfTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:23 AM
 */
public interface CfValueService {

	/**
	 * 
	 * @param CfValue
	 */
	public CfValueTo createCfValue(CfValueInput CfValue);

	/**
	 * 
	 * @param cfValueId
	 */
	public int deleteCfValue(int cfValueId);

	/**
	 * 
	 * @param cfValueId
	 */
	public Optional<CfValueTo> findCfValue(int cfValueId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<CfValueTo> findCfValues(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param cfvalueId
	 */
	public Optional<NodeCfTo> findNodeCf(int cfvalueId);

	/**
	 * 
	 * @param cfvalueId
	 */
	public Optional<RequestTo> findRequest(int cfvalueId);

	/**
	 * 
	 * @param cfValue
	 */
	public CfValueTo modifyCfValue(CfValueInput cfValue);

}