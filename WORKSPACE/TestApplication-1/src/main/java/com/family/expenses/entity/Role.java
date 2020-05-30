package com.family.expenses.entity;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long roleId;
	
	private String roleName;
	private String roleType;
	private String roleStatus;
	private Date createdDt;
	private String createdBy;
	

}
