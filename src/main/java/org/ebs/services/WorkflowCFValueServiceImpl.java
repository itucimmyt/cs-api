///////////////////////////////////////////////////////////
//  WorkflowCFValueServiceImpl.java
//  Macromedia ActionScript Implementation of the Class WorkflowCFValueServiceImpl
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:06:55 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.RequestModel;
import org.ebs.model.repos.RequestRepository;
import org.ebs.model.WorkflowNodeCFModel;
import org.ebs.model.repos.WorkflowNodeCFRepository;
import org.ebs.model.repos.WorkflowCFValueRepository;
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
import org.ebs.services.to.WorkflowCFValueTo;
import org.ebs.services.to.Input.WorkflowCFValueInput;
import org.ebs.model.WorkflowCFValueModel;
import org.ebs.services.to.RequestTo;
import org.ebs.services.to.WorkflowNodeCFTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:06:55 PM
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
	public WorkflowCFValueTo createWorkflowCFValue(WorkflowCFValueInput WorkflowCFValue){
		WorkflowCFValueModel model = converter.convert(WorkflowCFValue,WorkflowCFValueModel.class); 
		 model.setId(0);
		 RequestModel requestModel = requestRepository.findById(WorkflowCFValue.getrequest().getId()).get(); 
		model.setrequest(requestModel); 
		WorkflowNodeCFModel workflownodecfModel = workflownodecfRepository.findById(WorkflowCFValue.getworkflownodecf().getId()).get(); 
		model.setworkflownodecf(workflownodecfModel); 
		 
		 model= workflowcfvalueRepository.save(model); 
		 return converter.convert(model, WorkflowCFValueTo.class); 
	}

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteWorkflowCFValue(int workflowcfvalueId){
		WorkflowCFValueModel workflowcfvalue = workflowcfvalueRepository.findById(workflowcfvalueId).orElseThrow(() -> new RuntimeException("WorkflowCFValue not found")); 
		 workflowcfvalue.setDeleted(true); 
		  workflowcfvalueRepository.save(workflowcfvalue); 
		 return workflowcfvalueId;
	}

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	public Optional<RequestTo> findRequest(int workflowcfvalueId){
		return workflowcfvalueRepository.findById(workflowcfvalueId).map(r -> converter.convert(r.getrequest(),RequestTo.class));
	}

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	@Override
	public Optional<WorkflowCFValueTo> findWorkflowCFValue(int workflowcfvalueId){
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
	public Page<WorkflowCFValueTo> findWorkflowCFValues(PageInput page, SortInput sort, List<FilterInput> filters){
		return workflowcfvalueRepository.findByCriteria(WorkflowCFValueModel.class,filters,sort,page).map(r -> converter.convert(r,WorkflowCFValueTo.class));
	}

	/**
	 * 
	 * @param workflowcfvalueId
	 */
	public Optional<WorkflowNodeCFTo> findWorkflowNodeCF(int workflowcfvalueId){
		return workflowcfvalueRepository.findById(workflowcfvalueId).map(r -> converter.convert(r.getworkflownodecf(),WorkflowNodeCFTo.class));
	}

	/**
	 * 
	 * @param workflowcfvalue
	 */
	@Override @Transactional(readOnly = false)
	public WorkflowCFValueTo modifyWorkflowCFValue(WorkflowCFValueInput workflowcfvalue){
		WorkflowCFValueModel target= workflowcfvalueRepository.findById(workflowcfvalue.getId()).orElseThrow(() -> new RuntimeException("WorkflowCFValue not found")); 
		 WorkflowCFValueModel source= converter.convert(workflowcfvalue,WorkflowCFValueModel.class); 
		 Utils.copyNotNulls(source,target); 
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