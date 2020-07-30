///////////////////////////////////////////////////////////
//  VendorServiceImpl.java
//  Macromedia ActionScript Implementation of the Class VendorServiceImpl
//  Generated by Enterprise Architect
//  Created on:      27-Jul-2020 8:43:49 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.ServiceRepository;
import org.ebs.model.repos.TechnologyPlatformRepository;
import org.ebs.model.repos.MarkerRepository;
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
import org.ebs.model.DataFormatModel;
import org.ebs.model.repos.DataFormatRepository;
import org.ebs.model.PersonModel;
import org.ebs.model.repos.PersonRepository;
import org.ebs.model.repos.VendorRepository;
import org.ebs.services.to.VendorTo;
import org.ebs.services.to.Input.VendorInput;
import org.ebs.model.VendorModel;
import org.ebs.services.to.DataFormatTo;
import org.ebs.services.to.ServiceTo;
import org.ebs.services.to.TechnologyPlatformTo;
import org.ebs.services.to.MarkerTo;
import org.ebs.services.to.PersonTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 27-Jul-2020 8:43:49 AM
 */
@Service @Transactional(readOnly = true)
  class VendorServiceImpl implements VendorService {

	private VendorRepository vendorRepository;
	private ConversionService converter;
	private DataFormatRepository dataformatRepository;
	private PersonRepository personRepository;
	public ServiceRepository serviceRepository;
	public TechnologyPlatformRepository technologyplatformRepository;
	public MarkerRepository markerRepository;

	/**
	 * 
	 * @param Vendor
	 */
	@Override @Transactional(readOnly = false)
	public VendorTo createVendor(VendorInput Vendor){
		VendorModel model = converter.convert(Vendor,VendorModel.class); 
		 model.setId(0);
		 DataFormatModel dataformatModel = dataformatRepository.findById(Vendor.getdataformat().getId()).get(); 
		model.setdataformat(dataformatModel); 
		PersonModel personModel = personRepository.findById(Vendor.getperson().getId()).get(); 
		model.setperson(personModel); 
		 
		 model= vendorRepository.save(model); 
		 return converter.convert(model, VendorTo.class); 
	}

	/**
	 * 
	 * @param vendorId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteVendor(int vendorId){
		VendorModel vendor = vendorRepository.findById(vendorId).orElseThrow(() -> new RuntimeException("Vendor not found")); 
		 vendor.setDeleted(true); 
		  vendorRepository.save(vendor); 
		 return vendorId;
	}

	/**
	 * 
	 * @param vendorId
	 */
	public Optional<DataFormatTo> findDataFormat(int vendorId){
		return vendorRepository.findById(vendorId).map(r -> converter.convert(r.getdataformat(),DataFormatTo.class));
	}

	/**
	 * 
	 * @param vendorId
	 */
	public Optional<PersonTo> findPerson(int vendorId){
		return vendorRepository.findById(vendorId).map(r -> converter.convert(r.getperson(),PersonTo.class));
	}

	/**
	 * 
	 * @param vendorId
	 */
	@Override
	public Optional<VendorTo> findVendor(int vendorId){
		if(vendorId <1) 
		 {return Optional.empty();} 
		 return vendorRepository.findById(vendorId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,VendorTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<VendorTo> findVendors(PageInput page, SortInput sort, List<FilterInput> filters){
		return vendorRepository.findByCriteria(VendorModel.class,filters,sort,page).map(r -> converter.convert(r,VendorTo.class));
	}

	/**
	 * 
	 * @param vendor
	 */
	@Override @Transactional(readOnly = false)
	public VendorTo modifyVendor(VendorInput vendor){
		VendorModel target= vendorRepository.findById(vendor.getId()).orElseThrow(() -> new RuntimeException("Vendor not found")); 
		 VendorModel source= converter.convert(vendor,VendorModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(vendorRepository.save(target), VendorTo.class);
	}

	/**
	 * 
	 * @param personRepository
	 * @param vendorRepository
	 * @param converter
	 * @param dataformatRepository
	 * @param serviceRepository
	 * @param technologyplatformRepository
	 * @param markerRepository
	 */
	@Autowired
	public VendorServiceImpl(PersonRepository personRepository, VendorRepository vendorRepository, ConversionService converter, DataFormatRepository dataformatRepository, ServiceRepository serviceRepository, TechnologyPlatformRepository technologyplatformRepository, MarkerRepository markerRepository){
		this.vendorRepository =vendorRepository; 
		 this.converter = converter;
		 this.dataformatRepository = dataformatRepository;
		 this.serviceRepository = serviceRepository;
		 this.technologyplatformRepository = technologyplatformRepository;
		 this.markerRepository = markerRepository;
		 this.personRepository = personRepository;
	}

}