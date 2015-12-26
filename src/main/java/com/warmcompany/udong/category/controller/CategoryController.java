package com.warmcompany.udong.category.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.warmcompany.udong.category.model.Category;
import com.warmcompany.udong.category.service.CategoryService;
import com.warmcompany.udong.common.ResultMapGenerator;

/**
 * 2015. 12. 25.
 * Copyright by joyhan / HUFS
 * CategoryController
 */
@Controller
@RequestMapping(value = "/categories")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getCategoryList(Category category)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		List<Category> categoryList = categoryService.getCategoryList(category);
		if(categoryList == null)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("categoryList", categoryList);
		}
		return resultMap;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> createCategory(Category category)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		int createdId = categoryService.createCategory(category);
		if(createdId < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("category", category);
		}
		return resultMap;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	@ResponseBody
	public Map<String, Object> deleteCategory(@PathVariable(value="id")int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		int deletedRow = categoryService.deleteCategory(id);
		
		if(deletedRow < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("deletedRow", deletedRow);
		}
		return resultMap;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	@ResponseBody
	public Map<String, Object> updateCategory(@PathVariable(value="/{id}")int id, Category param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		categoryService.updateCategory(param);
		ResultMapGenerator.putSuccessCode(resultMap);
		return resultMap;
	}
}
