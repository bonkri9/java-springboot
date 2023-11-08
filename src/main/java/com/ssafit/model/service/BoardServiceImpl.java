package com.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafit.model.dao.BoardDao;
import com.ssafit.model.dto.Board;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao dao;
	
	
	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Board> getList(String videoId) {
		// TODO Auto-generated method stub
		dao.updateVideoViewCnt(videoId);
		return dao.selectAll(videoId);
	}

	@Override
	public List<Board> getBoardById(String userId) {
		// TODO Auto-generated method stub
		return dao.selectById(userId);
	}

	@Override
	public void writeBoard(Board board) {
		dao.insertBoard(board);
	}

	@Override
	public void modifyBoard(Board board) {
		dao.updateBoard(board);
	}

	@Override
	public void removeBoard(String userId, String videoId) {
		// TODO Auto-generated method stub
		dao.deleteBoard(userId, videoId);
	}

	@Override
	public Board getOneBoard(String videoId,String userId) {
		dao.updateViewCnt(videoId, userId);
		return dao.selectOne(videoId, userId);
	}

	


	
	

}
