///////////////////////////////////////////////////////////
//  OrganizationImpl.java
//  Macromedia ActionScript Implementation of the Class OrganizationImpl
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:20 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.CustomerModel;
import org.ebs.model.repos.CustomerRepository;
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
import org.ebs.services.to.OrganizationTo;
import org.ebs.services.to.Input.OrganizationInput;
import org.ebs.model.OrganizationModel;
import org.ebs.model.repos.OrganizationRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:20 PM
 */
@Service @Transactional(readOnly = true)
public class OrganizationImpl implements OrganizationService {

	private OrganizationRepository organizationRepository;
	@Autowired
	private ConversionService converter;
	@Autowired
	private CustomerRepository customerRepository;

	/**
	 * 
	 * @param Organization
	 */
	@Override @Transactional(readOnly = false)
	public OrganizationTo createOrganization(OrganizationInput Organization){
		OrganizationModel model = converter.convert(Organization,OrganizationModel.class); 
		 model.setId(0);
		 CustomerModel customerModel = customerRepository.findById(Organization.getCustomer().getId()).get(); 
		model.setCustomer(customerModel); 
		 
		 model= organizationRepository.save(model); 
		 return converter.convert(model, OrganizationTo.class); 
	}

	/**
	 * 
	 * @param idorganization
	 */
	@Override @Transactional(readOnly = false)
	public int deleteOrganization(int idorganization){
		OrganizationModel organization = organizationRepository.findById(idorganization).orElseThrow(() -> new RuntimeException("Request not found")); 
		 organization.setDeleted(true); 
		  organizationRepository.save(organization); 
		 return idorganization;
	}

	/**
	 * 
	 * @param organizationId
	 */
	@Override
	public Optional<OrganizationTo> findOrganization(int organizationId){
		if(organizationId <1) 
		 {return Optional.empty();} 
		 return organizationRepository.findById(organizationId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,OrganizationTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<OrganizationTo> findOrganizations(PageInput page, SortInput sort, List<FilterInput> filters){
		return organizationRepository.findByCriteria(OrganizationModel.class,filters,sort,page).map(r -> converter.convert(r,OrganizationTo.class));
	}

	/**
	 * 
	 * @param organization
	 */
	@Override @Transactional(readOnly = false)
	public OrganizationTo modifyOrganization(OrganizationInput organization){
		OrganizationModel target= organizationRepository.findById(organization.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 OrganizationModel source= converter.convert(organization,OrganizationModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(organizationRepository.save(target), OrganizationTo.class);
	}

	/**
	 * 
	 * @param organizationRepository
	 */
	@Autowired
	public OrganizationImpl(OrganizationRepository organizationRepository){
		this.organizationRepository =organizationRepository;
	}

}