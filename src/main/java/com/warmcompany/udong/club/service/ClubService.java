package com.warmcompany.udong.club.service;

import java.util.List;

import com.warmcompany.udong.club.model.Club;

/**
 * 2015. 12. 11.
 * Copyright by joyhan / HUFS
 * ClubService
 */
public interface ClubService {
	public int createClub(Club club);
	public int deleteClub(int clubId);
	public int updateClub(Club club);
	public Club getClub(int clubId);
	public List<Club> getClubList(Club club);
}
