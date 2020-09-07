///////////////////////////////////////////////////////////
//  DelegationServiceImpl.java
//  Macromedia ActionScript Implementation of the Class DelegationServiceImpl
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:11:11 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.UserModel;
import org.ebs.model.repos.UserRepository;
import org.ebs.model.repos.DelegationRepository;
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
import org.ebs.services.to.DelegationTo;
import org.ebs.services.to.Input.DelegationInput;
import org.ebs.model.DelegationModel;
import org.ebs.services.to.UserTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:11:11 AM
 */
@Service @Transactional(readOnly = true)
  class DelegationServiceImpl implements DelegationService {

	private DelegationRepository delegationRepository;
	private ConversionService converter;
	private UserRepository userRepository;

	/**
	 * 
	 * @param Delegation
	 */
	@Override @Transactional(readOnly = false)
	public DelegationTo createDelegation(DelegationInput Delegation){
		DelegationModel model = converter.convert(Delegation,DelegationModel.class); 
		 model.setId(0);
		 UserModel userModel = userRepository.findById(Delegation.getUser().getId()).get(); 
		model.setUser(userModel); 
		 
		 model= delegationRepository.save(model); 
		 return converter.convert(model, DelegationTo.class); 
	}

	/**
	 * 
	 * @param userRepository
	 * @param converter
	 * @param delegationRepository
	 */
	@Autowired
	public DelegationServiceImpl(UserRepository userRepository, ConversionService converter, DelegationRepository delegationRepository){
		this.delegationRepository =delegationRepository; 
		 this.converter = converter;
		 this.userRepository = userRepository;
	}

	/**
	 * 
	 * @param delegationId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteDelegation(int delegationId){
		DelegationModel delegation = delegationRepository.findById(delegationId).orElseThrow(() -> new RuntimeException("Delegation not found")); 
		 delegation.setDeleted(true); 
		  delegationRepository.save(delegation); 
		 return delegationId;
	}

	/**
	 * 
	 * @param delegationId
	 */
	@Override
	public Optional<DelegationTo> findDelegation(int delegationId){
		if(delegationId <1) 
		 {return Optional.empty();} 
		 return delegationRepository.findById(delegationId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,DelegationTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<DelegationTo> findDelegations(PageInput page, SortInput sort, List<FilterInput> filters){
		return delegationRepository.findByCriteria(DelegationModel.class,filters,sort,page).map(r -> converter.convert(r,DelegationTo.class));
	}

	/**
	 * 
	 * @param delegationId
	 */
	public Optional<UserTo> findUser(int delegationId){
		return delegationRepository.findById(delegationId).map(r -> converter.convert(r.getUser(),UserTo.class));
	}

	/**
	 * 
	 * @param delegation
	 */
	@Override @Transactional(readOnly = false)
	public DelegationTo modifyDelegation(DelegationInput delegation){
		DelegationModel target= delegationRepository.findById(delegation.getId()).orElseThrow(() -> new RuntimeException("Delegation not found")); 
		 DelegationModel source= converter.convert(delegation,DelegationModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(delegationRepository.save(target), DelegationTo.class);
	}

}