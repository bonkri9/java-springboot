package com.ssafit.model.dto;

import java.util.Date;

public class Board {
	private String videoId;
	private String userId;
	private String boardTitle;
	private String writer;
	private String content;
	private int rating;
	private String boardDate;
	private int boardViewCnt;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(String videoId, String userId, String boardTitle, String writer, String content, int rating,
			String boardDate, int boardViewCnt) {
		super();
		this.videoId = videoId;
		this.userId = userId;
		this.boardTitle = boardTitle;
		this.writer = writer;
		this.content = content;
		this.rating = rating;
		this.boardDate = boardDate;
		this.boardViewCnt = boardViewCnt;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getboardDate() {
		return boardDate;
	}

	public void setboardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public int getboardViewCnt() {
		return boardViewCnt;
	}

	public void setboardViewCnt(int boardViewCnt) {
		this.boardViewCnt = boardViewCnt;
	}

	@Override
	public String toString() {
		return "Board [videoId=" + videoId + ", userId=" + userId + ", boardTitle=" + boardTitle + ", writer=" + writer
				+ ", content=" + content + ", rating=" + rating + ", boardDate=" + boardDate + ", boardViewCnt=" + boardViewCnt
				+ "]";
	}
	
	
	
	
	
	
}
