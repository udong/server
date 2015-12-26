package com.warmcompany.udong.comment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warmcompany.udong.comment.model.Comment;
import com.warmcompany.udong.common.CommonDAO;

/**
 * 2015. 12. 26.
 * Copyright by joyhan / HUFS
 * CommentServiceImpl
 */
@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommonDAO commonDAO;
	
	private final Class clazz = Comment.class;

	@Override
	public int createComment(Comment comment) {
		commonDAO.save(comment);
		return comment.getId();
	}

	@Override
	public List<Comment> getCommentList(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment getCommentInfo(int id) {
		return commonDAO.get(clazz, id);
	}

	@Override
	public Comment updateComment(Comment comment) {
		commonDAO.update(comment);
		return comment;
	}

	@Override
	public int deleteComment(int id) {
		Comment comment = new Comment();
		comment.setId(id);
		commonDAO.delete(comment);
		return 0;
	}

}
