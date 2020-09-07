///////////////////////////////////////////////////////////
//  UserServiceImpl.java
//  Macromedia ActionScript Implementation of the Class UserServiceImpl
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:28 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.TenantModel;
import org.ebs.model.repos.TenantRepository;
import org.ebs.model.PersonModel;
import org.ebs.model.repos.PersonRepository;
import org.ebs.model.repos.UserRepository;
import org.ebs.model.repos.SessionRepository;
import org.ebs.model.repos.DelegationRepository;
import org.ebs.model.repos.PreferenceRepository;
import org.ebs.model.repos.RoleRepository;
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
import org.ebs.services.to.UserTo;
import org.ebs.services.to.Input.UserInput;
import org.ebs.model.UserModel;
import org.ebs.services.to.PersonTo;
import org.ebs.services.to.SessionTo;
import org.ebs.services.to.DelegationTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.PreferenceTo;
import org.ebs.services.to.RoleTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:28 AM
 */
@Service @Transactional(readOnly = true)
  class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	private ConversionService converter;
	private TenantRepository tenantRepository;
	private PersonRepository personRepository;
	public SessionRepository sessionRepository;
	public DelegationRepository delegationRepository;
	public PreferenceRepository preferenceRepository;
	public RoleRepository roleRepository;

	/**
	 * 
	 * @param User
	 */
	@Override @Transactional(readOnly = false)
	public UserTo createUser(UserInput User){
		UserModel model = converter.convert(User,UserModel.class); 
		 model.setId(0);
		 TenantModel tenantModel = tenantRepository.findById(User.getTenant().getId()).get(); 
		model.setTenant(tenantModel); 
		PersonModel personModel = personRepository.findById(User.getPerson().getId()).get(); 
		model.setPerson(personModel); 
		 
		 model= userRepository.save(model); 
		 return converter.convert(model, UserTo.class); 
	}

	/**
	 * 
	 * @param userId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteUser(int userId){
		UserModel user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found")); 
		 user.setDeleted(true); 
		  userRepository.save(user); 
		 return userId;
	}

	/**
	 * 
	 * @param userId
	 */
	public Set<DelegationTo> findDelegations(int userId){
		return delegationRepository.findByUserId(userId).stream().map(e -> converter.convert(e,DelegationTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param userId
	 */
	public Optional<PersonTo> findPerson(int userId){
		return userRepository.findById(userId).map(r -> converter.convert(r.getPerson(),PersonTo.class));
	}

	/**
	 * 
	 * @param userId
	 */
	public Set<PreferenceTo> findPreferences(int userId){
		return preferenceRepository.findByUserId(userId).stream().map(e -> converter.convert(e,PreferenceTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param userId
	 */
	public Set<RoleTo> findRoles(int userId){
		return userRepository.findById(userId).get().getRoles().stream().map(e->converter.convert(e, RoleTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param userId
	 */
	public Set<SessionTo> findSessions(int userId){
		return sessionRepository.findByUserId(userId).stream().map(e -> converter.convert(e,SessionTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param userId
	 */
	public Optional<TenantTo> findTenant(int userId){
		return userRepository.findById(userId).map(r -> converter.convert(r.getTenant(),TenantTo.class));
	}

	/**
	 * 
	 * @param userId
	 */
	@Override
	public Optional<UserTo> findUser(int userId){
		if(userId <1) 
		 {return Optional.empty();} 
		 return userRepository.findById(userId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,UserTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<UserTo> findUsers(PageInput page, SortInput sort, List<FilterInput> filters){
		return userRepository.findByCriteria(UserModel.class,filters,sort,page).map(r -> converter.convert(r,UserTo.class));
	}

	/**
	 * 
	 * @param user
	 */
	@Override @Transactional(readOnly = false)
	public UserTo modifyUser(UserInput user){
		UserModel target= userRepository.findById(user.getId()).orElseThrow(() -> new RuntimeException("User not found")); 
		 UserModel source= converter.convert(user,UserModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(userRepository.save(target), UserTo.class);
	}

	/**
	 * 
	 * @param personRepository
	 * @param userRepository
	 * @param converter
	 * @param sessionRepository
	 * @param delegationRepository
	 * @param tenantRepository
	 * @param preferenceRepository
	 * @param roleRepository
	 */
	@Autowired
	public UserServiceImpl(PersonRepository personRepository, UserRepository userRepository, ConversionService converter, SessionRepository sessionRepository, DelegationRepository delegationRepository, TenantRepository tenantRepository, PreferenceRepository preferenceRepository, RoleRepository roleRepository){
		this.userRepository =userRepository; 
		 this.converter = converter;
		 this.sessionRepository = sessionRepository;
		 this.delegationRepository = delegationRepository;
		 this.tenantRepository = tenantRepository;
		 this.preferenceRepository = preferenceRepository;
		 this.roleRepository = roleRepository;
		 this.personRepository = personRepository;
	}

}