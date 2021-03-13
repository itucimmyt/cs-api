///////////////////////////////////////////////////////////
//  AddressInput.java
//  Macromedia ActionScript Implementation of the Class AddressInput
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:18 AM
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
 * @created 13-Mar-2021 12:02:18 AM
 */
@Getter @Setter
public class AddressInput implements Serializable {

	private static final long serialVersionUID = 70704319;
	private int id;
	private int tenant;
	private String location;
	private String region;
	private String zipCode;
	private String streetAddress;

}