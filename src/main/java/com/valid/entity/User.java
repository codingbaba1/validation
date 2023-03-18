package com.valid.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usertable")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid", length = 30)
	private Long id;
	@Column(name = "username", unique = true)
	private String name;
	@Column(name = "usermomobile")
	private String mobile;
	@Column(name = "useremail")
	private String email;
	@Column(name = "userage")
	private Integer age;

}
