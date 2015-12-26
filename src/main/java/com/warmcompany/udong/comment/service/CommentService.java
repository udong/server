package com.warmcompany.udong.comment.service;

import java.util.List;

import com.warmcompany.udong.comment.model.Comment;

/**
 * 2015. 12. 26.
 * Copyright by joyhan / HUFS
 * CommentService
 */
public interface CommentService {
	public int createComment(Comment comment);
	public List<Comment> getCommentList(Comment comment);
	public Comment getCommentInfo(int id);
	public Comment updateComment(Comment comment);
	public int deleteComment(int id);
}
