/**
 * 2015. 11. 7.
 * Copyright by yyh / Hubigo AIAL
 * Member.java
 */
package com.warmcompany.udong.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
	
	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	private String message;
	
	private String email;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Member(int id) {
		super();
		this.id = id;
	}
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Member()	{
		
	}

	public Member(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

}
