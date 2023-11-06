package com.ssafit.model.service;

import java.util.List;

import com.ssafit.model.dto.Video;

public interface VideoService {
	List<Video> sortCount();
	
	List<Video> sortPart(String part);
}
