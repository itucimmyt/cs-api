///////////////////////////////////////////////////////////
//  AttributesModel.java
//  Macromedia ActionScript Implementation of the Class AttributesModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 12:18:54 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 10-Sep-2020 12:18:54 AM
 */
@Entity @Table(name="Attributes",schema="tenant") @Getter @Setter
public class AttributesModel extends Auditable {

	private static final long serialVersionUID = 306894462;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="help")
	private String help;
	@Column(name="sortno")
	private int sortno;
	@Column(name="attComponent")
	private String attComponent;
	@Column(name="is_multiline")
	private boolean ismultiline;
	@Column(name="is_required")
	private boolean isrequired;
	@Column(name="defaultValue")
	private String defaultValue;
	@Column(name="sm")
	private int sm;
	@Column(name="md")
	private int md;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="entityreference_id")
	private EntityReferenceModel entityreference;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="htmltag_id")
	private HtmlTagModel htmltag;

	@Override
	public String toString(){
		return "AttributesModel [sortno=" + sortno + ",is_multiline=" + ismultiline + ",is_required=" + isrequired + ",sm=" + sm + ",md=" + md + ",id=" + id + ",]";
	}

}