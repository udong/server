/**
 * 2015. 11. 1.
 * Copyright by yyh / Hubigo AIAL
 * TestController.java
 */
package com.warmcompany.udong.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	
	@RequestMapping(value = "/method1")
	public ModelAndView testMethod1(Model model)	{
		String s1 = "qwe";
		
		model.addAttribute(s1);
		model.addAttribute("s1", s1);
		return new ModelAndView("adminIndex");
	}

}
