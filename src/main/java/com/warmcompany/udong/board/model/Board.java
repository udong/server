package com.warmcompany.udong.board.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.warmcompany.udong.document.model.Document;

/**
 * 2015. 12. 18.
 * Copyright by joyhan / HUFS
 * Board
 */
@Entity
@Table(name = "Board")
public class Board {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name="parent_id")
	private int parentId;
	@Column(name="club_id")
	private int clubId;
	private String title;
	private String subscript;
	
	@OneToMany(mappedBy="boardId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Document> documents;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getClubId() {
		return clubId;
	}
	public void setClubId(int clubId) {
		this.clubId = clubId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubscript() {
		return subscript;
	}
	public void setSubscript(String subscript) {
		this.subscript = subscript;
	}
	
}
