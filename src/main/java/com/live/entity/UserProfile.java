package com.live.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class UserProfile {
//	Specifies the primary key of an entity.The field or property to which the Id annotation is appliedshould be one of the following types: any Java primitive type;any primitive wrapper type; String; java.util.Date; java.sql.Date; java.math.BigDecimal; java.math.BigInteger. 
	@Id
//	Indicates that the persistence provider should pick an appropriate strategy for the particular database.
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	@Column(name="USER_NAME", nullable = false)
	private String userName;
	
	@Column(name="ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name="ACCOUNT_NUMBER", nullable = false)
	private Float accountNumber;	
}
