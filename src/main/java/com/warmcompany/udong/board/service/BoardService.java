package com.warmcompany.udong.board.service;

import java.util.List;

import com.warmcompany.udong.board.model.Board;

/**
 * 2015. 12. 19.
 * Copyright by joyhan / HUFS
 * BoardService
 */
public interface BoardService {
	public int createBoard(Board board);
	public List<Board> getBoardList(Board board);
	public Board getBoardInfo(int id);
	public Board updateBoard(Board board);
	public int deleteBoard(int id);
}
