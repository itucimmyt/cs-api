///////////////////////////////////////////////////////////
//  HtmlTagImpl.java
//  Macromedia ActionScript Implementation of the Class HtmlTagImpl
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 11:58:14 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

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
import org.ebs.services.to.HtmlTagTo;
import org.ebs.services.to.Input.HtmlTagInput;
import org.ebs.model.HtmlTagModel;
import org.ebs.model.repos.HtmlTagRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 11:58:14 PM
 */
@Service @Transactional(readOnly = true)
public class HtmlTagImpl implements HtmlTagService {

	private HtmlTagRepository htmltagRepository;
	@Autowired
	private ConversionService converter;

	/**
	 * 
	 * @param HtmlTag
	 */
	@Override @Transactional(readOnly = false)
	public HtmlTagTo createHtmlTag(HtmlTagInput HtmlTag){
		HtmlTagModel model = converter.convert(HtmlTag,HtmlTagModel.class); 
		 model.setId(0);
		  
		 model= htmltagRepository.save(model); 
		 return converter.convert(model, HtmlTagTo.class); 
	}

	/**
	 * 
	 * @param idhtmltag
	 */
	@Override @Transactional(readOnly = false)
	public int deleteHtmlTag(int idhtmltag){
		HtmlTagModel htmltag = htmltagRepository.findById(idhtmltag).orElseThrow(() -> new RuntimeException("Request not found")); 
		 htmltag.setDeleted(true); 
		  htmltagRepository.save(htmltag); 
		 return idhtmltag;
	}

	/**
	 * 
	 * @param htmltagId
	 */
	@Override
	public Optional<HtmlTagTo> findHtmlTag(int htmltagId){
		if(htmltagId <1) 
		 {return Optional.empty();} 
		 return htmltagRepository.findById(htmltagId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,HtmlTagTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<HtmlTagTo> findHtmlTags(PageInput page, SortInput sort, List<FilterInput> filters){
		return htmltagRepository.findByCriteria(HtmlTagModel.class,filters,sort,page).map(r -> converter.convert(r,HtmlTagTo.class));
	}

	/**
	 * 
	 * @param htmltagRepository
	 */
	@Autowired
	public HtmlTagImpl(HtmlTagRepository htmltagRepository){
		this.htmltagRepository =htmltagRepository;
	}

	/**
	 * 
	 * @param htmltag
	 */
	@Override @Transactional(readOnly = false)
	public HtmlTagTo modifyHtmlTag(HtmlTagInput htmltag){
		HtmlTagModel target= htmltagRepository.findById(htmltag.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 HtmlTagModel source= converter.convert(htmltag,HtmlTagModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(htmltagRepository.save(target), HtmlTagTo.class);
	}

}