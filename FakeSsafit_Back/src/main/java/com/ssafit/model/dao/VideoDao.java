package com.ssafit.model.dao;

import java.util.List;

import com.ssafit.model.dto.Video;

public interface VideoDao {
	List<Video> sortCount();
	
	List<Video> sortPart(String part);
}
