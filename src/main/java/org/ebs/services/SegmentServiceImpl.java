///////////////////////////////////////////////////////////
//  SegmentServiceImpl.java
//  Macromedia ActionScript Implementation of the Class SegmentServiceImpl
//  Generated by Enterprise Architect
//  Created on:      23-Jul-2020 10:47:09 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.EntityReferenceModel;
import org.ebs.model.repos.EntityReferenceRepository;
import org.ebs.model.repos.SegmentRepository;
import org.ebs.model.repos.NumberSequenceRuleSegmentRepository;
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
import org.ebs.services.to.SegmentTo;
import org.ebs.services.to.Input.SegmentInput;
import org.ebs.model.SegmentModel;
import org.ebs.services.to.EntityReferenceTo;
import org.ebs.services.to.NumberSequenceRuleSegmentTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 23-Jul-2020 10:47:09 PM
 */
@Service @Transactional(readOnly = true)
  class SegmentServiceImpl implements SegmentService {

	private SegmentRepository segmentRepository;
	private ConversionService converter;
	private EntityReferenceRepository entityreferenceRepository;
	public NumberSequenceRuleSegmentRepository numbersequencerulesegmentRepository;

	/**
	 * 
	 * @param Segment
	 */
	@Override @Transactional(readOnly = false)
	public SegmentTo createSegment(SegmentInput Segment){
		SegmentModel model = converter.convert(Segment,SegmentModel.class); 
		 model.setId(0);
		 EntityReferenceModel entityreferenceModel = entityreferenceRepository.findById(Segment.getentityreference().getId()).get(); 
		model.setentityreference(entityreferenceModel); 
		 
		 model= segmentRepository.save(model); 
		 return converter.convert(model, SegmentTo.class); 
	}

	/**
	 * 
	 * @param segmentId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteSegment(int segmentId){
		SegmentModel segment = segmentRepository.findById(segmentId).orElseThrow(() -> new RuntimeException("Segment not found")); 
		 segment.setDeleted(true); 
		  segmentRepository.save(segment); 
		 return segmentId;
	}

	/**
	 * 
	 * @param segmentId
	 */
	public Optional<EntityReferenceTo> findEntityReference(int segmentId){
		return segmentRepository.findById(segmentId).map(r -> converter.convert(r.getentityreference(),EntityReferenceTo.class));
	}

	/**
	 * 
	 * @param segmentId
	 */
	public Set<NumberSequenceRuleSegmentTo> findNumberSequenceRuleSegments(int segmentId){
		return numbersequencerulesegmentRepository.findBySegmentId(segmentId).stream().map(e -> converter.convert(e,NumberSequenceRuleSegmentTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param segmentId
	 */
	@Override
	public Optional<SegmentTo> findSegment(int segmentId){
		if(segmentId <1) 
		 {return Optional.empty();} 
		 return segmentRepository.findById(segmentId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,SegmentTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<SegmentTo> findSegments(PageInput page, SortInput sort, List<FilterInput> filters){
		return segmentRepository.findByCriteria(SegmentModel.class,filters,sort,page).map(r -> converter.convert(r,SegmentTo.class));
	}

	/**
	 * 
	 * @param segment
	 */
	@Override @Transactional(readOnly = false)
	public SegmentTo modifySegment(SegmentInput segment){
		SegmentModel target= segmentRepository.findById(segment.getId()).orElseThrow(() -> new RuntimeException("Segment not found")); 
		 SegmentModel source= converter.convert(segment,SegmentModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(segmentRepository.save(target), SegmentTo.class);
	}

	/**
	 * 
	 * @param numbersequencerulesegmentRepository
	 * @param entityreferenceRepository
	 * @param converter
	 * @param segmentRepository
	 */
	@Autowired
	public SegmentServiceImpl(NumberSequenceRuleSegmentRepository numbersequencerulesegmentRepository, EntityReferenceRepository entityreferenceRepository, ConversionService converter, SegmentRepository segmentRepository){
		this.segmentRepository =segmentRepository; 
		 this.converter = converter;
		 this.entityreferenceRepository = entityreferenceRepository;
		 this.numbersequencerulesegmentRepository = numbersequencerulesegmentRepository;
	}

}