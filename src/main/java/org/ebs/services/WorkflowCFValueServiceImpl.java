///////////////////////////////////////////////////////////
//  WorkflowCFValueServiceImpl.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFValueServiceImpl
//  Generated by Enterprise Architect
//  Created on:      04-Sep-2020 10:06:31 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.RequestModel;
import org.ebs.model.WorkflowCFValueModel;
import org.ebs.model.WorkflowNodeCFModel;
import org.ebs.model.repos.RequestRepository;
import org.ebs.model.repos.WorkflowCFValueRepository;
import org.ebs.model.repos.WorkflowNodeCFRepository;
import org.ebs.services.to.RequestTo;
import org.ebs.services.to.WorkflowCFValueTo;
import org.ebs.services.to.WorkflowNodeCFTo;
import org.ebs.services.to.Input.WorkflowCFValueInput;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 04-Sep-2020 10:06:31 AM
 */
@Service @Transactional(readOnly = true)
  class WorkflowCFValueServiceImpl implements WorkflowCFValueService {

	private WorkflowCFValueRepository workflowcfvalueRepository;
	private ConversionService converter;
	private RequestRepository requestRepository;
	private WorkflowNodeCFRepository workflownodecfRepository;

	/**
	 * 
	 * @param WorkflowCFValue
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowCFValueTo createworkflowcfvalue(WorkflowCFValueInput WorkflowCFValue){
		WorkflowCFValueModel model = converter.convert(WorkflowCFValue,WorkflowCFValueModel.class); 
		model.setId(0);
		
		RequestModel requestModel = Optional.of(WorkflowCFValue)
			 .map(w -> w.getRequest())
			 .map(r -> requestRepository.findById(r.getId()).get())
			 .orElse(null); 
		model.setRequest(requestModel); 
		WorkflowNodeCFModel workflownodecfModel = workflownodecfRepository.findById(WorkflowCFValue.getWorkflownodecf().getId()).get(); 
		model.setWorkflownodecf(workflownodecfModel); 
		 
		model= workflowcfvalueRepository.save(model); 
		return converter.convert(model, WorkflowCFValueTo.class); 
	}

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteworkflowcfvalue(int workflowcfvalueId){
		WorkflowCFValueModel workflowcfvalue = workflowcfvalueRepository.findById(workflowcfvalueId).orElseThrow(() -> new RuntimeException("WorkflowCFValue not found")); 
		 workflowcfvalue.setDeleted(true); 
		  workflowcfvalueRepository.save(workflowcfvalue); 
		 return workflowcfvalueId;
	}

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	public Optional<RequestTo> findrequest(int workflowcfvalueId){
		return workflowcfvalueRepository.findById(workflowcfvalueId).map(r -> converter.convert(r.getRequest(),RequestTo.class));
	}

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	@Override
	public Optional<WorkflowCFValueTo> findworkflowcfvalue(int workflowcfvalueId){
		if(workflowcfvalueId <1) 
		 {return Optional.empty();} 
		 return workflowcfvalueRepository.findById(workflowcfvalueId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,WorkflowCFValueTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<WorkflowCFValueTo> findworkflowcfvalues(PageInput page, SortInput sort, List<FilterInput> filters){
		return workflowcfvalueRepository.findByCriteria(WorkflowCFValueModel.class,filters,sort,page).map(r -> converter.convert(r,WorkflowCFValueTo.class));
	}

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	public Optional<WorkflowNodeCFTo> findworkflownodecf(int workflowcfvalueId){
		return workflowcfvalueRepository.findById(workflowcfvalueId).map(r -> converter.convert(r.getWorkflownodecf(),WorkflowNodeCFTo.class));
	}

	/**
	 * 
	 * @param workflowcfvalue
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowCFValueTo modifyworkflowcfvalue(WorkflowCFValueInput workflowcfvalue){
		WorkflowCFValueModel target= workflowcfvalueRepository.findById(workflowcfvalue.getId()).orElseThrow(() -> new RuntimeException("WorkflowCFValue not found")); 
		WorkflowCFValueModel source= converter.convert(workflowcfvalue,WorkflowCFValueModel.class); 
		Utils.copyNotNulls(source,target); 

		RequestModel requestModel = Optional.of(workflowcfvalue)
			.map(w -> w.getRequest())
			.map(r -> requestRepository.findById(r.getId()).orElseThrow(() -> new RuntimeException("request does not exist")))
			.orElse(null); 
		target.setRequest(requestModel);
	
		WorkflowNodeCFModel workflownodecfModel = Optional.of(workflowcfvalue)
			.map(w -> w.getWorkflownodecf())
			.map(w -> workflownodecfRepository.findById(w.getId()).orElseThrow(() -> new RuntimeException("workflowNodeCF does not exist")))
			.orElse(null);
		target.setWorkflownodecf(workflownodecfModel); 

		return converter.convert(workflowcfvalueRepository.save(target), WorkflowCFValueTo.class);
	}

	/**
	 * 
	 * @param workflownodecfRepository
	 * @param requestRepository
	 * @param converter
	 * @param workflowcfvalueRepository
	 */
	@Autowired
	public WorkflowCFValueServiceImpl(WorkflowNodeCFRepository workflownodecfRepository, RequestRepository requestRepository, ConversionService converter, WorkflowCFValueRepository workflowcfvalueRepository){
		this.workflowcfvalueRepository =workflowcfvalueRepository; 
		 this.converter = converter;
		 this.requestRepository = requestRepository;
		 this.workflownodecfRepository = workflownodecfRepository;
	}

}