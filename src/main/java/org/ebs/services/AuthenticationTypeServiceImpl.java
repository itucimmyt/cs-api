///////////////////////////////////////////////////////////
//  AuthenticationTypeServiceImpl.java
//  Macromedia ActionScript Implementation of the Class AuthenticationTypeServiceImpl
//  Generated by Enterprise Architect
//  Created on:      20-Aug-2020 1:05:29 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.ebs.util.Utils;
import org.springframework.core.convert.ConversionService;
import java.util.stream.Collectors;
import java.util.Set;
import org.ebs.model.repos.AuthenticationTypeRepository;
import org.ebs.model.repos.TenantRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.ebs.services.to.AuthenticationTypeTo;
import org.ebs.services.to.Input.AuthenticationTypeInput;
import org.ebs.model.AuthenticationTypeModel;
import org.ebs.services.to.TenantTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 20-Aug-2020 1:05:29 PM
 */
@Service @Transactional(readOnly = true)
  class AuthenticationTypeServiceImpl implements AuthenticationTypeService {

	private AuthenticationTypeRepository authenticationtypeRepository;
	private ConversionService converter;
	public TenantRepository tenantRepository;

	/**
	 * 
	 * @param tenantRepository
	 * @param converter
	 * @param authenticationtypeRepository
	 */
	@Autowired
	public AuthenticationTypeServiceImpl(TenantRepository tenantRepository, ConversionService converter, AuthenticationTypeRepository authenticationtypeRepository){
		this.authenticationtypeRepository =authenticationtypeRepository; 
		 this.converter = converter;
		 this.tenantRepository = tenantRepository;
	}

	/**
	 * 
	 * @param AuthenticationType
	 */
	@Override @Transactional(readOnly = false)
	public AuthenticationTypeTo createAuthenticationType(AuthenticationTypeInput AuthenticationType){
		AuthenticationTypeModel model = converter.convert(AuthenticationType,AuthenticationTypeModel.class); 
		 model.setId(0);
		  
		 model= authenticationtypeRepository.save(model); 
		 return converter.convert(model, AuthenticationTypeTo.class); 
	}

	/**
	 * 
	 * @param authenticationtypeId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteAuthenticationType(int authenticationtypeId){
		AuthenticationTypeModel authenticationtype = authenticationtypeRepository.findById(authenticationtypeId).orElseThrow(() -> new RuntimeException("AuthenticationType not found")); 
		 authenticationtype.setDeleted(true); 
		  authenticationtypeRepository.save(authenticationtype); 
		 return authenticationtypeId;
	}

	/**
	 * 
	 * @param authenticationtypeId
	 */
	@Override
	public Optional<AuthenticationTypeTo> findAuthenticationType(int authenticationtypeId){
		if(authenticationtypeId <1) 
		 {return Optional.empty();} 
		 return authenticationtypeRepository.findById(authenticationtypeId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,AuthenticationTypeTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<AuthenticationTypeTo> findAuthenticationTypes(PageInput page, SortInput sort, List<FilterInput> filters){
		return authenticationtypeRepository.findByCriteria(AuthenticationTypeModel.class,filters,sort,page).map(r -> converter.convert(r,AuthenticationTypeTo.class));
	}

	/**
	 * 
	 * @param authenticationtypeId
	 */
	public Set<TenantTo> findTenants(int authenticationtypeId){
		return tenantRepository.findByAuthenticationtypeId(authenticationtypeId).stream().map(e -> converter.convert(e,TenantTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param authenticationtype
	 */
	@Override @Transactional(readOnly = false)
	public AuthenticationTypeTo modifyAuthenticationType(AuthenticationTypeInput authenticationtype){
		AuthenticationTypeModel target= authenticationtypeRepository.findById(authenticationtype.getId()).orElseThrow(() -> new RuntimeException("AuthenticationType not found")); 
		 AuthenticationTypeModel source= converter.convert(authenticationtype,AuthenticationTypeModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(authenticationtypeRepository.save(target), AuthenticationTypeTo.class);
	}

}