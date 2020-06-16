///////////////////////////////////////////////////////////
//  DataFormatServiceImpl.java
//  Macromedia ActionScript Implementation of the Class DataFormatServiceImpl
//  Generated by Enterprise Architect
//  Created on:      15-Jun-2020 5:13:30 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import org.ebs.model.repos.VendorRepository;
import org.ebs.model.repos.DataFormatRepository;
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
import org.ebs.services.to.Input.DataFormatInput;
import org.ebs.model.DataFormatModel;
import org.ebs.services.to.DataFormatTo;
import org.ebs.services.to.VendorTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 15-Jun-2020 5:13:30 PM
 */
@Service @Transactional(readOnly = true)
  class DataFormatServiceImpl implements DataFormatService {

	private DataFormatRepository dataformatRepository;
	private ConversionService converter;
	private VendorRepository vendorRepository;

	/**
	 * 
	 * @param DataFormat
	 */
	@Override @Transactional(readOnly = false)
	public DataFormatTo createDataFormat(DataFormatInput DataFormat){
		DataFormatModel model = converter.convert(DataFormat,DataFormatModel.class); 
		 model.setId(0);
		  
		 model= dataformatRepository.save(model); 
		 return converter.convert(model, DataFormatTo.class); 
	}

	/**
	 * 
	 * @param vendorRepository
	 * @param converter
	 * @param dataformatRepository
	 */
	@Autowired
	public DataFormatServiceImpl(VendorRepository vendorRepository, ConversionService converter, DataFormatRepository dataformatRepository){
		this.dataformatRepository =dataformatRepository; 
		 this.converter = converter;
		 this.vendorRepository = vendorRepository;
	}

	/**
	 * 
	 * @param dataformatId
	 */
	@Override @Transactional(readOnly = false)
	public int deleteDataFormat(int dataformatId){
		DataFormatModel dataformat = dataformatRepository.findById(dataformatId).orElseThrow(() -> new RuntimeException("DataFormat not found")); 
		 dataformat.setDeleted(true); 
		  dataformatRepository.save(dataformat); 
		 return dataformatId;
	}

	/**
	 * 
	 * @param dataformatId
	 */
	@Override
	public Optional<DataFormatTo> findDataFormat(int dataformatId){
		if(dataformatId <1) 
		 {return Optional.empty();} 
		 return dataformatRepository.findById(dataformatId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,DataFormatTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<DataFormatTo> findDataFormats(PageInput page, SortInput sort, List<FilterInput> filters){
		return dataformatRepository.findByCriteria(DataFormatModel.class,filters,sort,page).map(r -> converter.convert(r,DataFormatTo.class));
	}

	/**
	 * 
	 * @param dataformatId
	 */
	public Set<VendorTo> findVendors(int dataformatId){
		return vendorRepository.findByDataformatId(dataformatId).stream().map(e -> converter.convert(e,VendorTo.class)).collect(Collectors.toSet());
	}

	/**
	 * 
	 * @param dataformat
	 */
	@Override @Transactional(readOnly = false)
	public DataFormatTo modifyDataFormat(DataFormatInput dataformat){
		DataFormatModel target= dataformatRepository.findById(dataformat.getId()).orElseThrow(() -> new RuntimeException("DataFormat not found")); 
		 DataFormatModel source= converter.convert(dataformat,DataFormatModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(dataformatRepository.save(target), DataFormatTo.class);
	}

}