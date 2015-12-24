package com.warmcompany.udong.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warmcompany.udong.board.model.Board;
import com.warmcompany.udong.common.CommonDAO;

/**
 * 2015. 12. 23.
 * Copyright by joyhan / HUFS
 * BoardServiceImpl
 */
@Service
public class BoardServiceImpl implements BoardService	{

	@Autowired
	CommonDAO commonDAO;
	
	@Override
	public int createBoard(Board board) {
		commonDAO.save(board);
		return board.getId();
	}

	@Override
	public List<Board> getBoardList(Board board) {
//		commonDAO.getListWithQuery(queryString, params);
		return null;
	}

	@Override
	public Board getBoardInfo(int id) {
		return commonDAO.get(Board.class, id);
	}


	@Override
	public Board updateBoard(Board board) {
		commonDAO.update(board);
		return board;
	}

	@Override
	public int deleteBoard(int id) {
		Board board = new Board();
		board.setId(id);
		commonDAO.delete(board);
		return board.getId();
	}
	
}
