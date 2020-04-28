///////////////////////////////////////////////////////////
//  CustomerImpl.java
//  Macromedia ActionScript Implementation of the Class CustomerImpl
//  Generated by Enterprise Architect
//  Created on:      28-Apr-2020 12:06:57 AM
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
import org.ebs.services.to.CustomerTo;
import org.ebs.services.to.Input.CustomerInput;
import org.ebs.model.CustomerModel;
import org.ebs.model.repos.CustomerRepository;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 28-Apr-2020 12:06:57 AM
 */
@Service @Transactional(readOnly = true)
public class CustomerImpl implements CustomerService {

	private CustomerRepository customerRepository;
	@Autowired
	private ConversionService converter;

	/**
	 * 
	 * @param Customer
	 */
	@Override @Transactional(readOnly = false)
	public CustomerTo createCustomer(CustomerInput Customer){
		CustomerModel model = converter.convert(Customer,CustomerModel.class); 
		 model.setId(0); 
		 model= customerRepository.save(model); 
		 return converter.convert(model, CustomerTo.class); 
	}

	/**
	 * 
	 * @param customerRepository
	 */
	@Autowired
	public CustomerImpl(CustomerRepository customerRepository){
		this.customerRepository =customerRepository;
	}

	/**
	 * 
	 * @param idcustomer
	 */
	@Override @Transactional(readOnly = false)
	public int deleteCustomer(int idcustomer){
		CustomerModel customer = customerRepository.findById(idcustomer).orElseThrow(() -> new RuntimeException("Request not found")); 
		 customer.setDeleted(true); 
		  customerRepository.save(customer); 
		 return idcustomer;
	}

	/**
	 * 
	 * @param customerId
	 */
	@Override
	public Optional<CustomerTo> findCustomer(int customerId){
		if(customerId <1) 
		 {return Optional.empty();} 
		 return customerRepository.findById(customerId).filter(r -> !r.getDeleted().booleanValue()).map(r -> converter.convert(r,CustomerTo.class));
	}

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	@Override
	public Page<CustomerTo> findCustomers(PageInput page, SortInput sort, List<FilterInput> filters){
		return customerRepository.findByCriteria(CustomerModel.class,filters,sort,page).map(r -> converter.convert(r,CustomerTo.class));
	}

	/**
	 * 
	 * @param customer
	 */
	@Override @Transactional(readOnly = false)
	public CustomerTo modifyCustomer(CustomerInput customer){
		CustomerModel target= customerRepository.findById(customer.getId()).orElseThrow(() -> new RuntimeException("Request not found")); 
		 CustomerModel source= converter.convert(customer,CustomerModel.class); 
		 Utils.copyNotNulls(source,target); 
		 return converter.convert(customerRepository.save(target), CustomerTo.class);
	}

}