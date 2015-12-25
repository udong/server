package com.warmcompany.udong.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.warmcompany.udong.board.model.Board;
import com.warmcompany.udong.board.service.BoardService;
import com.warmcompany.udong.common.CommonCode;
import com.warmcompany.udong.common.ResultMapGenerator;

/**
 * 2015. 12. 19.
 * Copyright by joyhan / HUFS
 * BoardController
 */
@Controller
@RequestMapping(value = "/boards")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> createBoard(@RequestBody Board param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		int createdId = boardService.createBoard(param);
		
		if(createdId < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("board", param);
		}
		
		return resultMap;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getBoardList(Board param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		List<Board> boardList = boardService.getBoardList(param);
		
		if(!resultMap.isEmpty())	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("boardList", boardList);
		} else	{
			ResultMapGenerator.putErrorCode(resultMap);
		}
		return resultMap;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseBody
	public Map<String, Object> getBoard(@PathVariable(value="id") int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		Board board = boardService.getBoardInfo(id);
		
		if(board == null)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("board", board);
		}
		return resultMap;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	@ResponseBody
	public Map<String, Object> updateBoard(@PathVariable(value="id") int id,@RequestBody Board param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		param.setId(id);
		Board board = boardService.updateBoard(param);
		
		if(board == null)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("board", board);
		}
		return resultMap;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	@ResponseBody
	public Map<String, Object> deleteBoard(@PathVariable(value="id") int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		int deletedRow = boardService.deleteBoard(id);
		
		if(deletedRow < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("deletedRow", deletedRow);
		}
		return resultMap;
	}
	
}
