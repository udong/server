package com.warmcompany.udong.comment.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 2015. 12. 26.
 * Copyright by joyhan / HUFS
 * Comment
 */
public class Comment {
	
	@Id
	@GeneratedValue
	private int id;
	private int documentId;
	private int authorId;
	private String comment;
	private Date regDate;
	private Date modDate;
	private char isDeleted;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDocumentId() {
		return documentId;
	}
	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
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
	public char getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(char isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
