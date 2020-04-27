///////////////////////////////////////////////////////////
//  AuthenticationTypeResolver.java
//  Macromedia ActionScript Implementation of the Class AuthenticationTypeResolver
//  Generated by Enterprise Architect
//  Created on:      27-Apr-2020 9:47:34 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.core.convert.ConversionService;
import org.ebs.model.AuthenticationTypeModel;
import org.ebs.services.to.AuthenticationTypeTo;
import org.ebs.model.repos.AuthenticationTypeRepository;
import org.ebs.services.AuthenticationTypeService;
import org.ebs.model.repos.TenantRepository;
import org.ebs.services.TenantService;
import org.ebs.services.to.TenantTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Apr-2020 9:47:34 AM
 */
@Component @Validated
public class AuthenticationTypeResolver implements GraphQLResolver<AuthenticationTypeTo> {

	private AuthenticationTypeRepository authenticationtypeRepository;
	private AuthenticationTypeService authenticationtypeService;
	@Autowired
	private ConversionService converter;
	private TenantRepository tenantRepository;
	private TenantService tenantService;

	/**
	 * 
	 * @param tenantRepository
	 * @param tenantService
	 * @param authenticationtypeRepository
	 * @param authenticationtypeService
	 */
	@Autowired
	public AuthenticationTypeResolver(TenantRepository tenantRepository, TenantService tenantService, AuthenticationTypeRepository authenticationtypeRepository, AuthenticationTypeService authenticationtypeService){
		this.authenticationtypeService = authenticationtypeService; 
		this.authenticationtypeRepository = authenticationtypeRepository; 
		this.tenantService = tenantService; 
		this.tenantRepository = tenantRepository; 
	
	}

	/**
	 * 
	 * @param authenticationtypeTo
	 */
	public Set<TenantTo> getTenants(AuthenticationTypeTo authenticationtypeTo){
		return tenantRepository.findByAuthenticationtypeId(authenticationtypeTo.getId()).stream() 
		 .map(e -> converter.convert(e,TenantTo.class)) 
		 .collect(Collectors.toSet());
	}

}