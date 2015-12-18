/**
 * 2015. 11. 1.
 * Copyright by yyh / Hubigo AIAL
 * TestController.java
 */
package com.warmcompany.udong.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.warmcompany.udong.common.CommonDAO;
import com.warmcompany.udong.test.model.Member;
import com.warmcompany.udong.test.service.MemberValidator;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	
	@Value("#{config[test]}")
	String testValue;
	
	@Autowired
	CommonDAO commonDAO;
	
	@RequestMapping(value = "/method1")
	@Transactional
	public ModelAndView testMethod1(Model model)	{
		String s1 = "qwe";
		System.out.println("Asd");
		
		Member member = new Member("test", "test2");
		member.setEmail("Asd");
		
		commonDAO.save(member);
		
		System.out.println("Test " + testValue);
		
		model.addAttribute(s1);
		model.addAttribute("s1", s1);
		return new ModelAndView("adminIndex");
	}
	
	
	/**
	 * spring Form error와 연동
	 */
	@RequestMapping(value="/validator", method=RequestMethod.POST)
	public String testValidator(Member member, Errors errors)	{
		new MemberValidator().validate(member, errors);
		if(errors.hasErrors())	{
			return "errorindex";
		}
		
		return "adminIndex";
	}
	
	@RequestMapping(value="/path/{s1}")
	public ModelAndView path(@PathVariable("s1")String s1, Model model)	{
		model.addAttribute("s1", s1);
		
		return new ModelAndView("adminIndex");
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String hadlerException(Exception ex)	{
		return "EXCEPTION";
	}

}
