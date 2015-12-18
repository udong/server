package com.warmcompany.udong.club.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * 2015. 12. 11.
 * Copyright by joyhan / HUFS
 * Club
 */
@Entity
public class Club {
	
	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	private int regionId;
	private int leaderId;
	private int categoryId;
	private int publicLevel;
	private int currentMember;
	private int maxMember;
	private Date meeting;
	private int fee;
	private String description;
	private String logoUrl;
	private int clubLevel;
	private double averageAge;
	private Date modDate;
	private Date regDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	public int getLeaderId() {
		return leaderId;
	}
	public void setLeaderId(int leaderId) {
		this.leaderId = leaderId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getPublicLevel() {
		return publicLevel;
	}
	public void setPublicLevel(int publicLevel) {
		this.publicLevel = publicLevel;
	}
	public int getCurrentMember() {
		return currentMember;
	}
	public void setCurrentMember(int currentMember) {
		this.currentMember = currentMember;
	}
	public int getMaxMember() {
		return maxMember;
	}
	public void setMaxMember(int maxMember) {
		this.maxMember = maxMember;
	}
	public Date getMeeting() {
		return meeting;
	}
	public void setMeeting(Date meeting) {
		this.meeting = meeting;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public int getClubLevel() {
		return clubLevel;
	}
	public void setClubLevel(int clubLevel) {
		this.clubLevel = clubLevel;
	}
	public double getAverageAge() {
		return averageAge;
	}
	public void setAverageAge(double averageAge) {
		this.averageAge = averageAge;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}
