package com.warmcompany.udong.region.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.warmcompany.udong.region.model.Region;
import com.warmcompany.udong.common.CommonDAO;

/**
 * 2015. 12. 26.
 * Copyright by joyhan / HUFS
 * RegionServiceImpl
 */
public class RegionServiceImpl implements RegionService	{
	@Autowired
	CommonDAO commonDAO;
	
	private final Class clazz = Region.class;

	@Override
	public int createRegion(Region region) {
		commonDAO.save(region);
		return region.getId();
	}

	@Override
	public List<Region> getRegionList(Region region) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Region getRegionInfo(int id) {
		return commonDAO.get(clazz, id);
	}

	@Override
	public Region updateRegion(Region region) {
		commonDAO.update(region);
		return region;
	}

	@Override
	public int deleteRegion(int id) {
		Region region = new Region();
		region.setId(id);
		commonDAO.delete(region);
		return 0;
	}
}
