/**
 * 2015. 11. 16.
 * Copyright by yyh / Hubigo AIAL
 * ClubController.java
 */
package com.warmcompany.udong.club.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.warmcompany.udong.club.model.ClubInfo;

@Controller
@RequestMapping(value="/club")
public class ClubController {

	@RequestMapping(value="/list", method=RequestMethod.GET)
	@ResponseBody
	public Map<Object, Object> list()	{
		ClubInfo info = new ClubInfo("우리동네 축구단", "서울", "김개똥", "축구", 10, 20, 2, "http://i.imgur.com/CqmBjo5.jpg");
		ClubInfo info2 = new ClubInfo("우리동네 농구단", "인천", "김개똥", "농구", 10, 20, 2, "http://i.imgur.com/zkaAooq.jpg");
		
		List<ClubInfo> clubs = Lists.newArrayList();
		clubs.add(info2);
		clubs.add(info);
		
		Map resultMap = Maps.newHashMap();
		resultMap.put("clubList", clubs);
		return resultMap;
	}
}
