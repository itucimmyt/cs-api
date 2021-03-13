///////////////////////////////////////////////////////////
//  CfValueServiceImpl.java
//  Macromedia ActionScript Implementation of the Class CfValueServiceImpl
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:23 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.RequestModel;
import org.ebs.model.repos.RequestRepository;
import org.ebs.model.NodeCfModel;
import org.ebs.model.repos.NodeCfRepository;
import org.ebs.model.repos.CfValueRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.services.to.CfValueTo;
import org.ebs.services.to.Input.CfValueInput;
import org.ebs.model.CfValueModel;
import org.ebs.services.to.RequestTo;
import org.ebs.services.to.NodeCfTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Mar-2021 12:02:23 AM
 */
@Service @Transactional(readOnly = true)
  class CfValueServiceImpl implements CfValueService {

	private CfValueRepository cfvalueRepository;
	private ConversionService converter;
	private RequestRepository requestRepository;
	private NodeCfRepository nodecfRepository;

	/**
	 * 
	 * @param nodecfRepository
	 * @param requestRepository
	 * @param converter
	 * @param cfvalueRepository
	 */
	@Autowired
	public CfValueServiceImpl(NodeCfRepository nodecfRepository, RequestRepository requestRepository, ConversionService converter, CfValueRepository cfvalueRepository){
		this.cfvalueRepository =cfvalueRepository; 
		 this.converter = converter;
		 this.requestRepository = requestRepository;
		 this.nodecfRepository = nodecfRepository;
	}

	/**
	 * 
	 * @param CfValue
	 */
	@Override @Transactional(readOnly = false)
	public CfValueTo createCfValue(CfValueInput CfValue){
		CfValueModel model = converter.convert(CfValue,CfValueModel.class); 
		 model.setId(0);
		 RequestModel requestModel = requestRepository.findById(CfValue.getRequest().getId()).get(); 
		model.setRequest(requestModel); 
		NodeCfModel nodecfModel = nodecfRepository.findById(CfValue.getNodecf().getId()).get(); 
		model.setNodecf(nodecfModel); 
		 
		 model= cfvalueRepository.save(model); 
		 return converter.convert(model, CfValueTo.class); 
	}

	/**
	 * 
	 * @param cfValueId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteCfValue(int cfValueId){
		CfValueModel cfvalue = cfvalueRepository.findById(cfValueId).orElseThrow(() -> new RuntimeException("CfValue not found")); 
		 cfvalue.setDeleted(true); 
		  cfvalueRepository.save(cfvalue); 
		 return cfValueId;
	}

	/**
	 * 
	 * @param cfValueId
	 */
	@Override
	public Optional<CfValueTo> findCfValue(int cfValueId){
		if(cfValueId <1) 
		 {return Optional.empty();} 
		 return cfvalueRepository.findById(cfValueId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,CfValueTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<CfValueTo> findCfValues(PageInput page, SortInput sort, List<FilterInput> filters){
		return cfvalueRepository.findByCriteria(CfValueModel.class,filters,sort,page).map(r -> converter.convert(r,CfValueTo.class));
	}

	/**
	 * 
	 * @param cfvalueId
	 */
	public Optional<NodeCfTo> findNodeCf(int cfvalueId){
		return cfvalueRepository.findById(cfvalueId).map(r -> converter.convert(r.getNodecf(),NodeCfTo.class));
	}

	/**
	 * 
	 * @param cfvalueId
	 */
	public Optional<RequestTo> findRequest(int cfvalueId){
		return cfvalueRepository.findById(cfvalueId).map(r -> converter.convert(r.getRequest(),RequestTo.class));
	}

	/**
	 * 
	 * @param cfValue
	 */
	@Override @Transactional(readOnly = false)
	public CfValueTo modifyCfValue(CfValueInput cfValue){
		CfValueModel target= cfvalueRepository.findById(cfValue.getId()).orElseThrow(() -> new RuntimeException("CfValue not found")); 
		 CfValueModel source= converter.convert(cfValue,CfValueModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(cfvalueRepository.save(target), CfValueTo.class);
	}

}