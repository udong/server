/**
 * 2015. 11. 16.
 * Copyright by yyh / Hubigo AIAL
 * ClubInfo.java
 */
package com.warmcompany.udong.club.model;

public class ClubInfo {
	private String clubName;
	private String region;
	private String leader;
	private String category;
	private int memberCount;
	private int memberLimit;
	private int permission;
	private String logoUrl;

	public ClubInfo()	{
		
	}
	
	public ClubInfo(String clubName, String region, String leader,
			String category, int memberCount, int memberLimit, int permission,
			String logoUrl) {
		super();
		this.clubName = clubName;
		this.region = region;
		this.leader = leader;
		this.category = category;
		this.memberCount = memberCount;
		this.memberLimit = memberLimit;
		this.permission = permission;
		this.logoUrl = logoUrl;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}

	public int getMemberLimit() {
		return memberLimit;
	}

	public void setMemberLimit(int memberLimit) {
		this.memberLimit = memberLimit;
	}

	public int getPermission() {
		return permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

}
