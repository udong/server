package com.warmcompany.udong.region.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 2015. 12. 26.
 * Copyright by joyhan / HUFS
 * Region
 */
public class Region {
	@Id
	@GeneratedValue
	private int id;
	private int parentId;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
