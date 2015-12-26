package com.warmcompany.udong.region.service;

import java.util.List;

import com.warmcompany.udong.region.model.Region;

/**
 * 2015. 12. 26.
 * Copyright by joyhan / HUFS
 * RegionService
 */
public interface RegionService {
	public int createRegion(Region region);
	public List<Region> getRegionList(Region region);
	public Region getRegionInfo(int id);
	public Region updateRegion(Region region);
	public int deleteRegion(int id);
}
