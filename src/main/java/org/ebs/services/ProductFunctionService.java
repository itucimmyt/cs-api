///////////////////////////////////////////////////////////
//  ProductFunctionService.java
//  Macromedia ActionScript Implementation of the Interface ProductFunctionService
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:58 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services;

import java.util.List;
import java.util.Optional;
import org.ebs.util.FilterInput;
import org.ebs.util.PageInput;
import org.ebs.util.SortInput;
import org.springframework.data.domain.Page;
import java.util.Set;
import org.ebs.services.to.ProductFunctionTo;
import org.ebs.services.to.Input.ProductFunctionInput;
import org.ebs.services.to.RoleTo;
import org.ebs.services.to.ProductTo;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:19:58 AM
 */
public interface ProductFunctionService {

	/**
	 * 
	 * @param ProductFunction
	 */
	public ProductFunctionTo createProductFunction(ProductFunctionInput ProductFunction);

	/**
	 * 
	 * @param productFunctionId
	 */
	public int deleteProductFunction(int productFunctionId);

	/**
	 * 
	 * @param productfunctionId
	 */
	public Optional<ProductTo> findProduct(int productfunctionId);

	/**
	 * 
	 * @param productFunctionId
	 */
	public Optional<ProductFunctionTo> findProductFunction(int productFunctionId);

	/**
	 * 
	 * @param page
	 * @param sort
	 * @param filters
	 */
	public Page<ProductFunctionTo> findProductFunctions(PageInput page, SortInput sort, List<FilterInput> filters);

	/**
	 * 
	 * @param productfunctionId
	 */
	public Set<RoleTo> findRoles(int productfunctionId);

	/**
	 * 
	 * @param productFunction
	 */
	public ProductFunctionTo modifyProductFunction(ProductFunctionInput productFunction);

}