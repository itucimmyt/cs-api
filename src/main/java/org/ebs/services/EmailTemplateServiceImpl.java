///////////////////////////////////////////////////////////
//  EmailTemplateServiceImpl.java
//  Macromedia ActionScript Implementation of the Class EmailTemplateServiceImpl
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:31 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.TenantModel;
import org.ebs.model.repos.TenantRepository;
import org.ebs.model.repos.EmailTemplateRepository;
import org.ebs.model.repos.EntityReferenceRepository;
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
import org.ebs.services.to.EmailTemplateTo;
import org.ebs.services.to.Input.EmailTemplateInput;
import org.ebs.model.EmailTemplateModel;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.TenantTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:31 AM
 */
@Service @Transactional(readOnly = true)
  class EmailTemplateServiceImpl implements EmailTemplateService {

	private EmailTemplateRepository emailtemplateRepository;
	private ConversionService converter;
	private TenantRepository tenantRepository;
	public EntityReferenceRepository entityreferenceRepository;

	/**
	 * 
	 * @param EmailTemplate
	 */
	@Override @Transactional(readOnly = false)
	public EmailTemplateTo createEmailTemplate(EmailTemplateInput EmailTemplate){
		EmailTemplateModel model = converter.convert(EmailTemplate,EmailTemplateModel.class); 
		 model.setId(0);
		 TenantModel tenantModel = tenantRepository.findById(EmailTemplate.gettenant().getId()).get(); 
		model.settenant(tenantModel); 
		 
		 model= emailtemplateRepository.save(model); 
		 return converter.convert(model, EmailTemplateTo.class); 
	}

	/**
	 * 
	 * @param emailtemplateId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteEmailTemplate(int emailtemplateId){
		EmailTemplateModel emailtemplate = emailtemplateRepository.findById(emailtemplateId).orElseThrow(() -> new RuntimeException("EmailTemplate not found")); 
		 emailtemplate.setDeleted(true); 
		  emailtemplateRepository.save(emailtemplate); 
		 return emailtemplateId;
	}

	/**
	 * 
	 * @param tenantRepository
	 * @param entityreferenceRepository
	 * @param converter
	 * @param emailtemplateRepository
	 */
	@Autowired
	public EmailTemplateServiceImpl(TenantRepository tenantRepository, EntityReferenceRepository entityreferenceRepository, ConversionService converter, EmailTemplateRepository emailtemplateRepository){
		this.emailtemplateRepository =emailtemplateRepository; 
		 this.converter = converter;
		 this.entityreferenceRepository = entityreferenceRepository;
		 this.tenantRepository = tenantRepository;
	}

	/**
	 * 
	 * @param emailtemplateId
	 */
	@Override
	public Optional<EmailTemplateTo> findEmailTemplate(int emailtemplateId){
		if(emailtemplateId <1) 
		 {return Optional.empty();} 
		 return emailtemplateRepository.findById(emailtemplateId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,EmailTemplateTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<EmailTemplateTo> findEmailTemplates(PageInput page, SortInput sort, List<FilterInput> filters){
		return emailtemplateRepository.findByCriteria(EmailTemplateModel.class,filters,sort,page).map(r -> converter.convert(r,EmailTemplateTo.class));
	}

	/**
	 * 
	 * @param emailtemplateId
	 */
	public Optional<TenantTo> findTenant(int emailtemplateId){
		return emailtemplateRepository.findById(emailtemplateId).map(r -> converter.convert(r.gettenant(),TenantTo.class));
	}

	/**
	 * 
	 * @param emailtemplate
	 */
	@Override @Transactional(readOnly = false)
	public EmailTemplateTo modifyEmailTemplate(EmailTemplateInput emailtemplate){
		EmailTemplateModel target= emailtemplateRepository.findById(emailtemplate.getId()).orElseThrow(() -> new RuntimeException("EmailTemplate not found")); 
		 EmailTemplateModel source= converter.convert(emailtemplate,EmailTemplateModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(emailtemplateRepository.save(target), EmailTemplateTo.class);
	}

}