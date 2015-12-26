package com.warmcompany.udong.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warmcompany.udong.category.model.Category;
import com.warmcompany.udong.common.CommonDAO;

/**
 * 2015. 12. 25.
 * Copyright by joyhan / HUFS
 * CategoryServiceImpl
 */
@Service
public class CategoryServiceImpl implements CategoryService	{

	private Class clazz = Category.class;
	@Autowired
	CommonDAO commonDAO;
	@Override
	public int createCategory(Category category) {
		commonDAO.save(category);
		return category.getId();
	}

	@Override
	public List<Category> getCategoryList(Category category) {
		String queryString = "select * from category";
		return commonDAO.getListWithQuery(queryString, category);
	}

	@Override
	public Category getCategoryInfo(int id) {
		return commonDAO.get(clazz, id);
	}

	@Override
	public Category updateCategory(Category category) {
		commonDAO.update(category);
		return category;
	}

	@Override
	public int deleteCategory(int id) {
		Category category = new Category();
		category.setId(id);
		commonDAO.delete(category);
		return 1;
	}


}
