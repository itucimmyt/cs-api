///////////////////////////////////////////////////////////
//  RequestServiceImpl.java
//  Macromedia ActionScript Implementation of the Class RequestServiceImpl
//  Generated by Enterprise Architect
//  Created on:      13-Jul-2020 5:07:10 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.WorkflowInstanceModel;
import org.ebs.model.repos.WorkflowInstanceRepository;
import org.ebs.model.repos.RequestRepository;
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
import org.ebs.services.to.RequestTo;
import org.ebs.services.to.Input.RequestInput;
import org.ebs.model.RequestModel;
import org.ebs.services.to.WorkflowCFValueTo;
import org.ebs.services.to.WorkflowInstanceTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 13-Jul-2020 5:07:10 PM
 */
@Service @Transactional(readOnly = true)
  class RequestServiceImpl implements RequestService {

	private RequestRepository requestRepository;
	private ConversionService converter;
	private WorkflowInstanceRepository workflowinstanceRepository;
	public WorkflowCFValueRepository workflowcfvalueRepository;

	/**
	 * 
	 * @param Request
	 */
	@Override @Transactional(readOnly = false)
	public RequestTo createRequest(RequestInput Request){
		RequestModel model = converter.convert(Request,RequestModel.class); 
		 model.setId(0);
		 WorkflowInstanceModel workflowinstanceModel = workflowinstanceRepository.findById(Request.getworkflowinstance().getId()).get(); 
		model.setworkflowinstance(workflowinstanceModel); 
		 
		 model= requestRepository.save(model); 
		 return converter.convert(model, RequestTo.class); 
	}

	/**
	 * 
	 * @param requestId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteRequest(int requestId){
		RequestModel request = requestRepository.findById(requestId).orElseThrow(() -> new RuntimeException("Request not found")); 
		 request.setDeleted(true); 
		  requestRepository.save(request); 
		 return requestId;
	}

	/**
	 * 
	 * @param requestId
	 */
	@Override
	public Optional<RequestTo> findRequest(int requestId){
		if(requestId <1) 
		 {return Optional.empty();} 
		 return requestRepository.findById(requestId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,RequestTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<RequestTo> findRequests(PageInput page, SortInput sort, List<FilterInput> filters){
		return requestRepository.findByCriteria(RequestModel.class,filters,sort,page).map(r -> converter.convert(r,RequestTo.class));
	}

	/**
	 * 
	 * @param requestId
	 */
	public Set<WorkflowCFValueTo> findWorkflowCFValues(int requestId){
		return workflowcfvalueRepository.findByRequestId(requestId).stream().map(e -> converter.convert(e,WorkflowCFValueTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param requestId
	 */
	public Optional<WorkflowInstanceTo> findWorkflowInstance(int requestId){
		return requestRepository.findById(requestId).map(r -> converter.convert(r.getworkflowinstance(),WorkflowInstanceTo.class));
	}

	/**
	 * 
	 * @param request
	 */
	@Override @Transactional(readOnly = false)
	public RequestTo modifyRequest(RequestInput request){
		RequestModel target= requestRepository.findById(request.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 RequestModel source= converter.convert(request,RequestModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(requestRepository.save(target), RequestTo.class);
	}

	/**
	 * 
	 * @param workflowinstanceRepository
	 * @param workflowcfvalueRepository
	 * @param converter
	 * @param requestRepository
	 */
	@Autowired
	public RequestServiceImpl(WorkflowInstanceRepository workflowinstanceRepository, WorkflowCFValueRepository workflowcfvalueRepository, ConversionService converter, RequestRepository requestRepository){
		this.requestRepository =requestRepository; 
		 this.converter = converter;
		 this.workflowcfvalueRepository = workflowcfvalueRepository;
		 this.workflowinstanceRepository = workflowinstanceRepository;
	}

}