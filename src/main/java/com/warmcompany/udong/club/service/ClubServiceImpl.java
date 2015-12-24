package com.warmcompany.udong.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warmcompany.udong.club.model.Club;
import com.warmcompany.udong.common.CommonDAO;

/**
 * 2015. 12. 11.
 * Copyright by joyhan / HUFS
 * ClubServiceImpl
 */
@Service
public class ClubServiceImpl implements ClubService	{

	@Autowired
	CommonDAO commonDAO;
	
	private final Class clubClass = Club.class; 
	
	@Override
	public int createClub(Club club) {
		commonDAO.save(club);
		return club.getId();
	}

	@Override
	public int removeClub(Club club) {
		commonDAO.delete(club);
		return 0;
	}

	@Override
	public int updateClub(Club club) {
		commonDAO.update(club);
		return 0;
	}

	@Override
	public Club getClub(int clubId) {
		Club club = commonDAO.get(clubClass, clubId);
		return club; 
	}

	@Override
	public List<Club> getClubList(Club club) {
		//List<Club> clubs = commonDAO.getListWithQuery(queryString, params);
		return null;
	}

}
