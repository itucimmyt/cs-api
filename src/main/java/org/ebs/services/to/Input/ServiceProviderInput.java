///////////////////////////////////////////////////////////
//  ServiceProviderInput.java
//  Macromedia ActionScript Implementation of the Class ServiceProviderInput
//  Generated by Enterprise Architect
//  Created on:      07-Sep-2020 8:12:06 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.services.to.Input;

import java.io.Serializable;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 07-Sep-2020 8:12:06 AM
 */
@Getter @Setter
public class ServiceProviderInput implements Serializable {

	private static final long serialVersionUID = 521743617;
	private int id;
	private int tenant;
	private String code;
	private String name;
	private CountryInput country;
	private Set<CropInput> crops;

}