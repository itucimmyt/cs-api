///////////////////////////////////////////////////////////
//  ProgramServiceImpl.java
//  Macromedia ActionScript Implementation of the Class ProgramServiceImpl
//  Generated by Enterprise Architect
//  Created on:      07-Aug-2020 3:00:50 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.ProjectRepository;
import org.ebs.model.TenantModel;
import org.ebs.model.repos.TenantRepository;
import org.ebs.model.CropModel;
import org.ebs.model.repos.CropRepository;
import org.ebs.model.repos.ProgramRepository;
import org.ebs.model.repos.teamRepository;
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
import org.ebs.services.to.ProgramTo;
import org.ebs.services.to.Input.ProgramInput;
import org.ebs.model.ProgramModel;
import org.ebs.services.to.ProjectTo;
import org.ebs.services.to.TenantTo;
import org.ebs.services.to.teamTo;
import org.ebs.services.to.CropTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Aug-2020 3:00:50 PM
 */
@Service @Transactional(readOnly = true)
  class ProgramServiceImpl implements ProgramService {

	private ProgramRepository programRepository;
	private ConversionService converter;
	private ProjectRepository projectRepository;
	private TenantRepository tenantRepository;
	private CropRepository cropRepository;
	public teamRepository teamRepository;

	/**
	 * 
	 * @param Program
	 */
	@Override @Transactional(readOnly = false)
	public ProgramTo createProgram(ProgramInput Program){
		ProgramModel model = converter.convert(Program,ProgramModel.class); 
		 model.setId(0);
		 TenantModel tenantModel = tenantRepository.findById(Program.gettenant().getId()).get(); 
		model.settenant(tenantModel); 
		CropModel cropModel = cropRepository.findById(Program.getcrop().getId()).get(); 
		model.setcrop(cropModel); 
		 
		 model= programRepository.save(model); 
		 return converter.convert(model, ProgramTo.class); 
	}

	/**
	 * 
	 * @param programId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteProgram(int programId){
		ProgramModel program = programRepository.findById(programId).orElseThrow(() -> new RuntimeException("Program not found")); 
		 program.setDeleted(true); 
		  programRepository.save(program); 
		 return programId;
	}

	/**
	 * 
	 * @param programId
	 */
	public Optional<CropTo> findCrop(int programId){
		return programRepository.findById(programId).map(r -> converter.convert(r.getcrop(),CropTo.class));
	}

	/**
	 * 
	 * @param programId
	 */
	@Override
	public Optional<ProgramTo> findProgram(int programId){
		if(programId <1) 
		 {return Optional.empty();} 
		 return programRepository.findById(programId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,ProgramTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<ProgramTo> findPrograms(PageInput page, SortInput sort, List<FilterInput> filters){
		return programRepository.findByCriteria(ProgramModel.class,filters,sort,page).map(r -> converter.convert(r,ProgramTo.class));
	}

	/**
	 * 
	 * @param programId
	 */
	public Set<ProjectTo> findProjects(int programId){
		return projectRepository.findByProgramId(programId).stream().map(e -> converter.convert(e,ProjectTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param programId
	 */
	public Optional<TenantTo> findTenant(int programId){
		return programRepository.findById(programId).map(r -> converter.convert(r.gettenant(),TenantTo.class));
	}

	/**
	 * 
	 * @param program
	 */
	@Override @Transactional(readOnly = false)
	public ProgramTo modifyProgram(ProgramInput program){
		ProgramModel target= programRepository.findById(program.getId()).orElseThrow(() -> new RuntimeException("Program not found")); 
		 ProgramModel source= converter.convert(program,ProgramModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(programRepository.save(target), ProgramTo.class);
	}

	/**
	 * 
	 * @param cropRepository
	 * @param programRepository
	 * @param converter
	 * @param projectRepository
	 * @param tenantRepository
	 * @param teamRepository
	 */
	@Autowired
	public ProgramServiceImpl(CropRepository cropRepository, ProgramRepository programRepository, ConversionService converter, ProjectRepository projectRepository, TenantRepository tenantRepository, teamRepository teamRepository){
		this.programRepository =programRepository; 
		 this.converter = converter;
		 this.projectRepository = projectRepository;
		 this.tenantRepository = tenantRepository;
		 this.teamRepository = teamRepository;
		 this.cropRepository = cropRepository;
	}

}