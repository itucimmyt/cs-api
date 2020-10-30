///////////////////////////////////////////////////////////
//  RoleServiceImpl.java
//  Macromedia ActionScript Implementation of the Class RoleServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:28 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.RoleRepository;
import org.ebs.model.repos.RoleActionRepository;
import org.ebs.model.repos.ActionRepository;
import org.ebs.model.repos.UserRepository;
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
import org.ebs.services.to.RoleTo;
import org.ebs.services.to.Input.RoleInput;
import org.ebs.model.RoleModel;
import org.ebs.services.to.RoleActionTo;
import org.ebs.services.to.ActionTo;
import org.ebs.services.to.UserTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 10:44:28 PM
 */
@Service @Transactional(readOnly = true)
  class RoleServiceImpl implements RoleService {

	private RoleRepository roleRepository;
	private ConversionService converter;
	private RoleActionRepository roleactionRepository;
	private ActionRepository actionRepository;
	private UserRepository userRepository;

	/**
	 *
	 * @param Role
	 */
	@Override @Transactional(readOnly = false)
	public RoleTo createRole(RoleInput Role){
		RoleModel model = converter.convert(Role,RoleModel.class);
		 model.setId(0);

		 model= roleRepository.save(model);
		 return converter.convert(model, RoleTo.class);
	}

	/**
	 *
	 * @param roleId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteRole(int roleId){
		RoleModel role = roleRepository.findById(roleId).orElseThrow(() -> new RuntimeException("Role not found"));
		 role.setDeleted(true);
		  roleRepository.save(role);
		 return roleId;
	}

	/**
	 *
	 * @param roleId
	 */
	public Set<ActionTo> findActions(int roleId){
		return roleRepository.findById(roleId).get().getActions().stream().map(e->converter.convert(e, ActionTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param roleId
	 */
	@Override
	public Optional<RoleTo> findRole(int roleId){
		if(roleId <1)
		 {return Optional.empty();}
		 return roleRepository.findById(roleId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,RoleTo.class));
	}

	/**
	 *
	 * @param roleId
	 */
	public Set<RoleActionTo> findRoleActions(int roleId){
		return roleactionRepository.findByRoleId(roleId).stream().map(e -> converter.convert(e,RoleActionTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<RoleTo> findRoles(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters){
		return roleRepository.findByCriteria(RoleModel.class,filters,sort,page,disjunctionFilters).map(r -> converter.convert(r,RoleTo.class));
	}

	/**
	 *
	 * @param roleId
	 */
	public Set<UserTo> findUsers(int roleId){
		return roleRepository.findById(roleId).get().getUsers().stream().map(e->converter.convert(e, UserTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param role
	 */
	@Override @Transactional(readOnly = false)
	public RoleTo modifyRole(RoleInput role){
		RoleModel target= roleRepository.findById(role.getId()).orElseThrow(() -> new RuntimeException("Role not found"));
		 RoleModel source= converter.convert(role,RoleModel.class);
		 Utils.copyNotNulls(source,target);
		 return converter.convert(roleRepository.save(target), RoleTo.class);
	}

	/**
	 *
	 * @param userRepository
	 * @param actionRepository
	 * @param roleactionRepository
	 * @param converter
	 * @param roleRepository
	 */
	@Autowired
	public RoleServiceImpl(UserRepository userRepository, ActionRepository actionRepository, RoleActionRepository roleactionRepository, ConversionService converter, RoleRepository roleRepository){
		this.roleRepository =roleRepository;
		 this.converter = converter;
		 this.roleactionRepository = roleactionRepository;
		 this.userRepository = userRepository;
	}

}