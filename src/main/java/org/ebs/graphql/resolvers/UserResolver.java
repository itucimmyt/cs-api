///////////////////////////////////////////////////////////
//  UserResolver.java
//  Macromedia ActionScript Implementation of the Class UserResolver
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:32 PM
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
import org.ebs.model.UserModel;
import org.ebs.services.to.UserTo;
import org.ebs.model.repos.UserRepository;
import org.ebs.services.UserService;
import org.ebs.model.repos.SessionRepository;
import org.ebs.services.SessionService;
import org.ebs.services.to.SessionTo;
import org.ebs.model.repos.DelegationRepository;
import org.ebs.services.DelegationService;
import org.ebs.services.to.DelegationTo;
import org.ebs.services.TenantService;
import org.ebs.model.repos.TenantRepository;
import org.ebs.services.to.TenantTo;
import org.ebs.model.repos.PreferenceRepository;
import org.ebs.services.PreferenceService;
import org.ebs.services.to.PreferenceTo;
import org.ebs.model.repos.RoleRepository;
import org.ebs.services.RoleService;
import org.ebs.services.to.RoleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 17-May-2020 3:10:32 PM
 */
@Component @Validated
public class UserResolver implements GraphQLResolver<UserTo> {

	private UserService userService;
	private UserRepository userRepository;
	@Autowired
	private ConversionService converter;
	private SessionService sessionService;
	private SessionRepository sessionRepository;
	private DelegationService delegationService;
	private DelegationRepository delegationRepository;
	private TenantService tenantService;
	private TenantRepository tenantRepository;
	private PreferenceService preferenceService;
	private PreferenceRepository preferenceRepository;
	private RoleService roleService;
	private RoleRepository roleRepository;

	/**
	 * 
	 * @param userTo
	 */
	public Set<DelegationTo> getDelegations(UserTo userTo){
		return delegationRepository.findByUserId(userTo.getId()).stream() 
		 .map(e -> converter.convert(e,DelegationTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param userTo
	 */
	public Set<PreferenceTo> getPreferences(UserTo userTo){
		return preferenceRepository.findByUserId(userTo.getId()).stream() 
		 .map(e -> converter.convert(e,PreferenceTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param userTo
	 */
	public Set<SessionTo> getSessions(UserTo userTo){
		return sessionRepository.findByUserId(userTo.getId()).stream() 
		 .map(e -> converter.convert(e,SessionTo.class)) 
		 .collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param userTo
	 */
	public TenantTo getTenant(UserTo userTo){
		UserModel userModel = userRepository.findById(userTo.getId()).get(); 
		 return tenantService.findTenant(userModel.getTenant().getId()).get();
	}

	/**
	 * 
	 * @param preferenceService
	 * @param userRepository
	 * @param sessionService
	 * @param sessionRepository
	 * @param delegationService
	 * @param delegationRepository
	 * @param userService
	 * @param tenantRepository
	 * @param preferenceRepository
	 * @param roleService
	 * @param roleRepository
	 * @param tenantService
	 */
	@Autowired
	public UserResolver(PreferenceService preferenceService, UserRepository userRepository, SessionService sessionService, SessionRepository sessionRepository, DelegationService delegationService, DelegationRepository delegationRepository, UserService userService, TenantRepository tenantRepository, PreferenceRepository preferenceRepository, RoleService roleService, RoleRepository roleRepository, TenantService tenantService){
		this.userService = userService; 
		this.userRepository = userRepository; 
		this.sessionService = sessionService; 
		this.sessionRepository = sessionRepository; 
		this.delegationService = delegationService; 
		this.delegationRepository = delegationRepository; 
		this.tenantService = tenantService; 
		this.tenantRepository = tenantRepository; 
		this.preferenceService = preferenceService; 
		this.preferenceRepository = preferenceRepository; 
		this.roleService = roleService; 
		this.roleRepository = roleRepository; 
	
	}

}