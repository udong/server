package com.warmcompany.udong.document.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.warmcompany.udong.board.model.Board;

/**
 * 2015. 12. 18.
 * Copyright by joyhan / HUFS
 * Document
 */
@Entity
public class Document {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="board_id")
	private int boardId;
	@Column(name="author_id")
	private int authorId;
	private String title;
	private String contents;
	@Column(name="reg_date")
	private Date regDate;
	@Column(name="mod_date")
	private Date modDate;
	private int hits;
	@Column(name="comment_count")
	private int commentCount;
	private int type;

	@ManyToOne
	@JoinColumn(name = "boardId")
	private Board board;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	
	public Board getBoard()	{
		return board;
	}
}
