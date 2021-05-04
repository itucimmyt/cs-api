///////////////////////////////////////////////////////////
//  UserServiceImpl.java
//  Macromedia ActionScript Implementation of the Class UserServiceImpl
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:20:05 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.PersonModel;
import org.ebs.model.repos.PersonRepository;
import org.ebs.model.repos.UserRepository;
import org.ebs.model.repos.DelegationRepository;
import org.ebs.model.repos.ProgramRepository;
import org.ebs.model.repos.TenantRepository;
import org.ebs.model.repos.PreferenceRepository;
import org.ebs.model.repos.FunctionalUnitRepository;
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
import org.ebs.services.to.DelegationTo;
import org.ebs.services.to.ProgramTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.PreferenceTo;
import org.ebs.services.to.FunctionalUnitTo;
import org.ebs.services.to.RoleTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:20:05 AM
 */
@Service @Transactional(readOnly = true)
  class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	private ConversionService converter;
	private PersonRepository personRepository;
	private DelegationRepository delegationRepository;
	private ProgramRepository programRepository;
	private TenantRepository tenantRepository;
	private PreferenceRepository preferenceRepository;
	private FunctionalUnitRepository functionalunitRepository;
	private RoleRepository roleRepository;

	/**
	 * 
	 * @param User
	 */
	@Override @Transactional(readOnly = false)
	public UserTo createUser(UserInput User){
		UserModel model = converter.convert(User,UserModel.class); 
		 model.setId(0);
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
	public Set<FunctionalUnitTo> findFunctionalUnits(int userId){
		return userRepository.findById(userId).get().getFunctionalunits().stream().map(e->converter.convert(e, FunctionalUnitTo.class)).collect(Collectors.toSet());
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
	public Set<ProgramTo> findPrograms(int userId){
		return programRepository.findByUserId(userId).stream().map(e -> converter.convert(e,ProgramTo.class)).collect(Collectors.toSet());
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
	public Set<TenantTo> findTenants(int userId){
		return userRepository.findById(userId).get().getTenants().stream().map(e->converter.convert(e, TenantTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param userId
	 */
	@Override
	public Optional<UserTo> findUser(int userId){
		if(userId <1) 
		 {return Optional.empty();} 
		 return userRepository.findById(userId).filter(r -> !r.isDeleted()).map(r -> converter.convert(r,UserTo.class));
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
	 * @param delegationRepository
	 * @param programRepository
	 * @param tenantRepository
	 * @param preferenceRepository
	 * @param functionalunitRepository
	 * @param roleRepository
	 */
	@Autowired
	public UserServiceImpl(PersonRepository personRepository, UserRepository userRepository, ConversionService converter, DelegationRepository delegationRepository, ProgramRepository programRepository, TenantRepository tenantRepository, PreferenceRepository preferenceRepository, FunctionalUnitRepository functionalunitRepository, RoleRepository roleRepository){
		this.userRepository =userRepository; 
		 this.converter = converter;
		 this.delegationRepository = delegationRepository;
		 this.programRepository = programRepository;
		 this.tenantRepository = tenantRepository;
		 this.preferenceRepository = preferenceRepository;
		 this.functionalunitRepository = functionalunitRepository;
		 this.roleRepository = roleRepository;
		 this.personRepository = personRepository;
	}

}