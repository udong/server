package com.warmcompany.udong.comment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.warmcompany.udong.common.ResultMapGenerator;
import com.warmcompany.udong.comment.model.Comment;
import com.warmcompany.udong.comment.service.CommentService;

/**
 * 2015. 12. 26.
 * Copyright by joyhan / HUFS
 * CommentController
 */
@Controller
@RequestMapping(value = "/comments")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> createComment(Comment param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		int createdId = commentService.createComment(param);
		
		if(createdId < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("board", param);
		}
		
		return resultMap;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public Map<String, Object> updateComment(@PathVariable(value="id")int id, Comment param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		param.setId(id);
		commentService.updateComment(param);
		
		ResultMapGenerator.putSuccessCode(resultMap);
		resultMap.put("comment", param);

		return resultMap;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getComment(@PathVariable(value = "id")int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		Comment comment = commentService.getCommentInfo(id);
		if(comment == null)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("comment", comment);
		}
		
		return resultMap;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Map<String, Object> deleteComment(int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		int deletedRow = commentService.deleteComment(id);
		if(deletedRow < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("deletedRow", deletedRow);
		}
		return resultMap;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Object> getCommentList(Comment param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		List<Comment> commentList = commentService.getCommentList(param);
		if(commentList == null)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("commentList", commentList);
		}
		
		return resultMap;
	}
	
//	public Map<String, Object> deleteCommentList(Comment param)	{
//		Map<String, Object> resultMap = Maps.newHashMap();
//		
//		int deletedRow = commentService.deleteCommentList(param);
//		if(deletedRow < 0)	{
//			ResultMapGenerator.putErrorCode(resultMap);
//		} else	{
//			ResultMapGenerator.putSuccessCode(resultMap);
//			resultMap.put("deletedRow", deletedRow);
//		}
//		return resultMap;
//	}
}
