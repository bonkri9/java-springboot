package com.ssafit.model.service;

import java.util.List;

import com.ssafit.model.dto.Board;

public interface BoardService {
	List<Board> getList(String videoId);
	
	List<Board> getBoardById(String userId);
	
	Board getOneBoard(String videoId, String userId);
	
	void writeBoard(Board board);
	
	void modifyBoard(Board board);
	
	void removeBoard(String userId, String videoId);
	
	void increaseViewCnt(String userId);
	
}
