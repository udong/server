package com.warmcompany.udong.region.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.warmcompany.udong.region.model.Region;
import com.warmcompany.udong.region.service.RegionService;
import com.warmcompany.udong.common.ResultMapGenerator;

/**
 * 2015. 12. 26.
 * Copyright by joyhan / HUFS
 * RegionController
 */
@Controller
@RequestMapping(value = "/regions")
public class RegionController {
	
	@Autowired
	RegionService regionService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> createRegion(Region param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		int createdId = regionService.createRegion(param);
		
		if(createdId < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("board", param);
		}
		
		return resultMap;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public Map<String, Object> updateRegion(@PathVariable(value="id")int id, Region param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		param.setId(id);
		regionService.updateRegion(param);
		
		ResultMapGenerator.putSuccessCode(resultMap);
		resultMap.put("region", param);

		return resultMap;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getRegion(@PathVariable(value = "id")int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		Region region = regionService.getRegionInfo(id);
		if(region == null)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("region", region);
		}
		
		return resultMap;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Map<String, Object> deleteRegion(int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		int deletedRow = regionService.deleteRegion(id);
		if(deletedRow < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("deletedRow", deletedRow);
		}
		return resultMap;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Object> getRegionList(Region param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		List<Region> regionList = regionService.getRegionList(param);
		if(regionList == null)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("regionList", regionList);
		}
		
		return resultMap;
	}
}
