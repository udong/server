package com.warmcompany.udong.category.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 2015. 12. 18.
 * Copyright by joyhan / HUFS
 * Category
 */
@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private int parentId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	
	
}
