///////////////////////////////////////////////////////////
//  TranslationModel.java
//  Macromedia ActionScript Implementation of the Class TranslationModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:44:52 PM
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
 * @created 10-Sep-2020 10:44:52 PM
 */
@Entity @Table(name="Translation",schema="tenant") @Getter @Setter
public class TranslationModel extends Auditable {

	private static final long serialVersionUID = 224807391;
	@Column(name="translation")
	private String translation;
	@Column(name="languageTo")
	private int languageTo;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="language_id")
	private LanguageModel language;
	@ManyToOne(fetch=FetchType.LAZY, optional =true) @JoinColumn(name="htmltag_id")
	private HtmlTagModel htmltag;

	@Override
	public String toString(){
		return "TranslationModel [languageTo=" + languageTo + ",id=" + id + ",]";
	}

}