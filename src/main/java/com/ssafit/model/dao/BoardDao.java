package com.ssafit.model.dao;

import java.util.List;

import com.ssafit.model.dto.Board;

public interface BoardDao {
	
	List<Board> selectAll(String videoId);
	
	List<Board> selectById(String userId);
	
	Board selectOne(String videoId, String userId);
	
	void insertBoard(Board board);
	
	void updateBoard(Board board);
	
	void deleteBoard(String userId, String videoId);
	
	void updateViewCnt(String userId);

}
