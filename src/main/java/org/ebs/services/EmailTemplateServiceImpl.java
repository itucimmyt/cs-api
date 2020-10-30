///////////////////////////////////////////////////////////
//  EmailTemplateServiceImpl.java
//  Macromedia ActionScript Implementation of the Class EmailTemplateServiceImpl
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:42 PM
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
 * @created 10-Sep-2020 10:43:42 PM
 */
@Service @Transactional(readOnly = true)
  class EmailTemplateServiceImpl implements EmailTemplateService {

	private EmailTemplateRepository emailtemplateRepository;
	private ConversionService converter;
	private TenantRepository tenantRepository;
	private EntityReferenceRepository entityreferenceRepository;

	/**
	 *
	 * @param EmailTemplate
	 */
	@Override @Transactional(readOnly = false)
	public EmailTemplateTo createEmailTemplate(EmailTemplateInput EmailTemplate){
		EmailTemplateModel model = converter.convert(EmailTemplate,EmailTemplateModel.class);
		 model.setId(0);
		 TenantModel tenantModel = tenantRepository.findById(EmailTemplate.getTenant().getId()).get();
		model.setTenant(tenantModel);

		 model= emailtemplateRepository.save(model);
		 return converter.convert(model, EmailTemplateTo.class);
	}

	/**
	 *
	 * @param emailTemplateId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteEmailTemplate(int emailTemplateId){
		EmailTemplateModel emailtemplate = emailtemplateRepository.findById(emailTemplateId).orElseThrow(() -> new RuntimeException("EmailTemplate not found"));
		 emailtemplate.setDeleted(true);
		  emailtemplateRepository.save(emailtemplate);
		 return emailTemplateId;
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
	 * @param emailTemplateId
	 */
	@Override
	public Optional<EmailTemplateTo> findEmailTemplate(int emailTemplateId){
		if(emailTemplateId <1)
		 {return Optional.empty();}
		 return emailtemplateRepository.findById(emailTemplateId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,EmailTemplateTo.class));
	}

	/**
	 *
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<EmailTemplateTo> findEmailTemplates(PageInput page, SortInput sort, List<FilterInput> filters, boolean disjunctionFilters){
		return emailtemplateRepository.findByCriteria(EmailTemplateModel.class,filters,sort,page,disjunctionFilters).map(r -> converter.convert(r,EmailTemplateTo.class));
	}

	/**
	 *
	 * @param emailtemplateId
	 */
	public Set<EntityReferenceTo> findEntityReferences(int emailtemplateId){
		return emailtemplateRepository.findById(emailtemplateId).get().getEntityreferences().stream().map(e->converter.convert(e, EntityReferenceTo.class)).collect(Collectors.toSet());
	}

	/**
	 *
	 * @param emailtemplateId
	 */
	public Optional<TenantTo> findTenant(int emailtemplateId){
		return emailtemplateRepository.findById(emailtemplateId).map(r -> converter.convert(r.getTenant(),TenantTo.class));
	}

	/**
	 *
	 * @param emailTemplate
	 */
	@Override @Transactional(readOnly = false)
	public EmailTemplateTo modifyEmailTemplate(EmailTemplateInput emailTemplate){
		EmailTemplateModel target= emailtemplateRepository.findById(emailTemplate.getId()).orElseThrow(() -> new RuntimeException("EmailTemplate not found"));
		 EmailTemplateModel source= converter.convert(emailTemplate,EmailTemplateModel.class);
		 Utils.copyNotNulls(source,target);
		 return converter.convert(emailtemplateRepository.save(target), EmailTemplateTo.class);
	}

}