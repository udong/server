package com.warmcompany.udong.category.service;

import java.util.List;

import com.warmcompany.udong.board.model.Board;
import com.warmcompany.udong.category.model.Category;

/**
 * 2015. 12. 25.
 * Copyright by joyhan / HUFS
 * CategoryService
 */
public interface CategoryService {
	public int createCategory(Category category);
	public List<Category> getCategoryList(Category category);
	public Category getCategoryInfo(int id);
	public Category updateCategory(Category category);
	public int deleteCategory(int id);
}
