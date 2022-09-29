package com.mb.api.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "branch")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Branch
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer branchId;
	
	@Column(name = "branch_name")
	private String name;
	
	@Column(name = "branch_location")
	private String location;
	
	@Column(name = "branch_code")
	private String code;
}
