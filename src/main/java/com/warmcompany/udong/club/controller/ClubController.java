/**
 * 2015. 11. 16.
 * Copyright by yyh / Hubigo AIAL
 * ClubController.java
 */
package com.warmcompany.udong.club.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.warmcompany.udong.club.model.ClubInfo;

@Controller
@RequestMapping(value="/club")
public class ClubController {

	@RequestMapping(value="/list", method=RequestMethod.GET)
	@ResponseBody
	public Map<Object, Object> list()	{
		ClubInfo info = new ClubInfo("우리동네 축구단", "서울", "1", "축구", 10, 20, 2, "http://i.imgur.com/CqmBjo5.jpg");
		ClubInfo info2 = new ClubInfo("우리동네 농구단", "인천", "2", "농구", 10, 20, 2, "http://i.imgur.com/zkaAooq.jpg");
		ClubInfo info3 = new ClubInfo("우리동네 농구단", "인천", "3", "농구", 10, 20, 2, "http://i.imgur.com/zkaAooq.jpg");
		ClubInfo info4 = new ClubInfo("우리동네 농구단", "인천", "4", "농구", 10, 20, 2, "http://i.imgur.com/zkaAooq.jpg");
		ClubInfo info5 = new ClubInfo("우리동네 농구단", "인천", "5", "농구", 10, 20, 2, "http://i.imgur.com/zkaAooq.jpg");
		ClubInfo info6 = new ClubInfo("우리동네 농구단", "인천", "6", "농구", 10, 20, 2, "http://i.imgur.com/zkaAooq.jpg");
		
		List<ClubInfo> clubs = Lists.newArrayList();
		clubs.add(info);
		clubs.add(info2);
		clubs.add(info3);
		clubs.add(info4);
		clubs.add(info5);
		clubs.add(info6);
		
		Map resultMap = Maps.newHashMap();
		resultMap.put("clubList", clubs);
		
		return resultMap;
	}
	
	@RequestMapping(value = "/view")
	public ModelAndView viewMod(Model model)	{
		return new ModelAndView("myClubList");
	}

}
