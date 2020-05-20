///////////////////////////////////////////////////////////
//  RoleImpl.java
//  Macromedia ActionScript Implementation of the Class RoleImpl
//  Generated by Enterprise Architect
//  Created on:      17-May-2020 3:10:09 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;

import org.ebs.model.RoleModel;
import org.ebs.model.repos.RoleRepository;
import org.ebs.services.to.RoleTo;
import org.ebs.services.to.Input.RoleInput;
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
 * @created 17-May-2020 3:10:09 PM
 */
@Service @Transactional(readOnly = true)
public class RoleImpl implements RoleService {

	private RoleRepository roleRepository;
	@Autowired
	private ConversionService converter;

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
	 * @param idrole
	 */
	@Override @Transactional(readOnly = false)
	public int deleteRole(int idrole){
		RoleModel role = roleRepository.findById(idrole).orElseThrow(() -> new RuntimeException("Request not found")); 
		 role.setDeleted(true); 
		  roleRepository.save(role); 
		 return idrole;
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
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<RoleTo> findRoles(PageInput page, SortInput sort, List<FilterInput> filters){
		return roleRepository.findByCriteria(RoleModel.class,filters,sort,page).map(r -> converter.convert(r,RoleTo.class));
	}

	/**
	 * 
	 * @param role
	 */
	@Override @Transactional(readOnly = false)
	public RoleTo modifyRole(RoleInput role){
		RoleModel target= roleRepository.findById(role.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 RoleModel source= converter.convert(role,RoleModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(roleRepository.save(target), RoleTo.class);
	}

	/**
	 * 
	 * @param roleRepository
	 */
	@Autowired
	public RoleImpl(RoleRepository roleRepository){
		this.roleRepository =roleRepository;
	}

}