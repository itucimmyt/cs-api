///////////////////////////////////////////////////////////
//  LanguageModel.java
//  Macromedia ActionScript Implementation of the Class LanguageModel
//  Generated by Enterprise Architect
//  Created on:      02-May-2021 6:19:51 AM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.FetchType;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author EBRIONES
 * @version 1.0
 * @created 02-May-2021 6:19:51 AM
 */
@Entity @Table(name="language",schema="core") @Getter @Setter
public class LanguageModel extends Auditable {

	private static final long serialVersionUID = 395341978;
	@Column(name="name")
	private String name;
	@Column(name="code_iso")
	private String codeIso;
	@Column(name="is_base")
	private String isBase;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "language",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<TranslationModel> translations;
	@OneToMany(mappedBy = "language",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<PersonModel> persons;

	@Override
	public String toString(){
		return "LanguageModel [id=" + id + ",]";
	}

}