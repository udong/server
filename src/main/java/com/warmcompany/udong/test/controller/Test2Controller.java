/**
 * 2015. 11. 16.
 * Copyright by yyh / Hubigo AIAL
 * Test2Controller.java
 */
package com.warmcompany.udong.test.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/test1")
public class Test2Controller {
	
	@Value("#{config['key']}")
	String value;
	
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = "/method12")
	public ModelAndView testMethod1(Model model)	{
		String s1 = "qwe";

		System.out.println("msg.test1: " + messageSource.getMessage("msg.test1", null, Locale.getDefault()));
		System.out.println(value);
		return new ModelAndView("jdbctest");
	}
}
