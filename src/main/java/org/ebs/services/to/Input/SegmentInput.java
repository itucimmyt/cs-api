///////////////////////////////////////////////////////////
//  SegmentInput.java
//  Macromedia ActionScript Implementation of the Class SegmentInput
//  Generated by Enterprise Architect
//  Created on:      13-Mar-2021 12:02:54 AM
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
 * @created 13-Mar-2021 12:02:54 AM
 */
@Getter @Setter
public class SegmentInput implements Serializable {

	private static final long serialVersionUID = 157709451;
	private int id;
	private int tenant;
	private String name;
	private String tag;
	private boolean isAPI;
	private boolean isAutoNum;
	private boolean isStatic;
	private EntityReferenceInput entityreference;
	private FormulaTypeInput formulatype;

}