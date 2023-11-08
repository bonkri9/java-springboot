package com.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafit.model.dao.VideoDao;
import com.ssafit.model.dto.Video;

@Service
public class VideoServiceImpl implements VideoService {
	private static VideoService service = new VideoServiceImpl();

	private VideoDao videoDao;

	@Autowired
	public VideoServiceImpl(VideoDao dao) {
		this.videoDao = videoDao;
	}

	public VideoServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public static VideoService getInstance() {
		return service;
	}

	@Override
	public List<Video> sortCount() {
		// TODO Auto-generated method stub
		return videoDao.sortCount();
	}

	@Override
	public List<Video> sortPart(String part) {
		return videoDao.sortPart(part);
	}
	
	

}
