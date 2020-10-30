///////////////////////////////////////////////////////////
//  CropModel.java
//  Macromedia ActionScript Implementation of the Class CropModel
//  Generated by Enterprise Architect
//  Created on:      10-Sep-2020 10:43:32 PM
//  Original author: EBRIONES
///////////////////////////////////////////////////////////

package org.ebs.model;

import org.ebs.util.Auditable;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
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
 * @created 10-Sep-2020 10:43:32 PM
 */
@Entity @Table(name="Crop",schema="tenant") @Getter @Setter
public class CropModel extends Auditable {

	private static final long serialVersionUID = 25197557;
	@Column(name="crop_code")
	private String cropcode;
	@Column(name="crop_name")
	private String cropname;
	@Column(name="description")
	private String description;
	@GeneratedValue(strategy= GenerationType.IDENTITY) @Id @Column
	private int id;
	@OneToMany(mappedBy = "crop",fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<ProgramModel> programs;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "crop_serviceprovider", schema="analyticalsampling", joinColumns  = @JoinColumn(name="crop_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="serviceprovider_id",referencedColumnName = "id"))
	private Set<ServiceProviderModel> serviceproviders;
	@ManyToMany(cascade =CascadeType.ALL) @JoinTable(name = "crop_season", schema="tenant", joinColumns  = @JoinColumn(name="crop_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="season_id",referencedColumnName = "id"))
	private Set<SeasonModel> seasons;

	@Override
	public String toString(){
		return "CropModel [id=" + id + ",]";
	}

}