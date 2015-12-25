package com.warmcompany.udong.category.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	private Category parent;
	
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
	public Category getParent() {
		return parent;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	
	
	
}
