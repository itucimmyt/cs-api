///////////////////////////////////////////////////////////
//  AttributesServiceImpl.java
//  Macromedia ActionScript Implementation of the Class AttributesServiceImpl
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:42:10 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.EntityReferenceModel;
import org.ebs.model.repos.EntityReferenceRepository;
import org.ebs.model.HtmlTagModel;
import org.ebs.model.repos.HtmlTagRepository;
import org.ebs.model.repos.AttributesRepository;
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
import org.ebs.services.to.AttributesTo;
import org.ebs.services.to.Input.AttributesInput;
import org.ebs.model.AttributesModel;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.HtmlTagTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:42:10 AM
 */
@Service @Transactional(readOnly = true)
  class AttributesServiceImpl implements AttributesService {

	private AttributesRepository attributesRepository;
	private ConversionService converter;
	private EntityReferenceRepository entityreferenceRepository;
	private HtmlTagRepository htmltagRepository;

	/**
	 * 
	 * @param htmltagRepository
	 * @param entityreferenceRepository
	 * @param converter
	 * @param attributesRepository
	 */
	@Autowired
	public AttributesServiceImpl(HtmlTagRepository htmltagRepository, EntityReferenceRepository entityreferenceRepository, ConversionService converter, AttributesRepository attributesRepository){
		this.attributesRepository =attributesRepository; 
		 this.converter = converter;
		 this.entityreferenceRepository = entityreferenceRepository;
		 this.htmltagRepository = htmltagRepository;
	}

	/**
	 * 
	 * @param Attributes
	 */
	@Override @Transactional(readOnly = false)
	public AttributesTo createAttributes(AttributesInput Attributes){
		AttributesModel model = converter.convert(Attributes,AttributesModel.class); 
		 model.setId(0);
		 EntityReferenceModel entityreferenceModel = entityreferenceRepository.findById(Attributes.getentityreference().getId()).get(); 
		model.setentityreference(entityreferenceModel); 
		HtmlTagModel htmltagModel = htmltagRepository.findById(Attributes.gethtmltag().getId()).get(); 
		model.sethtmltag(htmltagModel); 
		 
		 model= attributesRepository.save(model); 
		 return converter.convert(model, AttributesTo.class); 
	}

	/**
	 * 
	 * @param attributesId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteAttributes(int attributesId){
		AttributesModel attributes = attributesRepository.findById(attributesId).orElseThrow(() -> new RuntimeException("Attributes not found")); 
		 attributes.setDeleted(true); 
		  attributesRepository.save(attributes); 
		 return attributesId;
	}

	/**
	 * 
	 * @param attributesId
	 */
	@Override
	public Optional<AttributesTo> findAttributes(int attributesId){
		if(attributesId <1) 
		 {return Optional.empty();} 
		 return attributesRepository.findById(attributesId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,AttributesTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<AttributesTo> findAttributess(PageInput page, SortInput sort, List<FilterInput> filters){
		return attributesRepository.findByCriteria(AttributesModel.class,filters,sort,page).map(r -> converter.convert(r,AttributesTo.class));
	}

	/**
	 * 
	 * @param attributesId
	 */
	public Optional<EntityReferenceTo> findEntityReference(int attributesId){
		return attributesRepository.findById(attributesId).map(r -> converter.convert(r.getentityreference(),EntityReferenceTo.class));
	}

	/**
	 * 
	 * @param attributesId
	 */
	public Optional<HtmlTagTo> findHtmlTag(int attributesId){
		return attributesRepository.findById(attributesId).map(r -> converter.convert(r.gethtmltag(),HtmlTagTo.class));
	}

	/**
	 * 
	 * @param attributes
	 */
	@Override @Transactional(readOnly = false)
	public AttributesTo modifyAttributes(AttributesInput attributes){
		AttributesModel target= attributesRepository.findById(attributes.getId()).orElseThrow(() -> new RuntimeException("Attributes not found")); 
		 AttributesModel source= converter.convert(attributes,AttributesModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(attributesRepository.save(target), AttributesTo.class);
	}

}