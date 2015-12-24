/**
 * 2015. 11. 16.
 * Copyright by yyh / Hubigo AIAL
 * ClubController.java
 */
package com.warmcompany.udong.club.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.warmcompany.udong.club.model.Club;
import com.warmcompany.udong.club.model.ClubInfo;
import com.warmcompany.udong.club.service.ClubService;
import com.warmcompany.udong.common.CommonCode;
import com.warmcompany.udong.common.ResultMapGenerator;

@Controller
@RequestMapping(value="/clubs")
public class ClubController {
	
	@Autowired
	ClubService clubService;

	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> createClub(@RequestBody Club club)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		int createdClubId = clubService.createClub(club);
		resultMap.put("clubId", createdClubId);
		ResultMapGenerator.putSuccessCode(resultMap);
		
		return resultMap;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Map<String, Object> getClubList(@PathVariable(value="id")int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		return resultMap;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	@ResponseBody
	public Map<String, Object> removeClub(@PathVariable(value="id")int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		return resultMap;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	@ResponseBody
	public Map<String, Object> updateClub(@PathVariable(value="id")int id, @ModelAttribute Club param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		return resultMap;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getClubList()	{
		Map<String, Object> resultMap = Maps.newHashMap();
		return resultMap;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/{id}/user")
	@ResponseBody
	public Map<String, Object> joinClub(@PathVariable(value="id")int id, @ModelAttribute Club param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		return resultMap;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}/user")
	@ResponseBody
	public Map<String, Object> leaveClub(@PathVariable(value="id")int id, @ModelAttribute Club param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		return resultMap;
	}
	
	
	
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
