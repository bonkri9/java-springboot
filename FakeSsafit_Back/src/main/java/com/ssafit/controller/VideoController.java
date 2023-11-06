package com.ssafit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.model.dto.Video;
import com.ssafit.model.service.VideoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api-video")
@Api(tags = "싸핏 비디오 컨트롤러")
public class VideoController {

	private VideoService videoService;

	@Autowired
	public VideoController(VideoService videoService) {
		super();
		this.videoService = videoService;
	}

	@GetMapping("/count")
	@ApiOperation(value = "조회수 내림차순 정렬")
	public ResponseEntity<?> sortCount() {
		List<Video> result = videoService.sortCount();

		if(result.isEmpty())
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

		return new ResponseEntity<List<Video>>(result, HttpStatus.OK);
	}

	@GetMapping("/part")
	@ApiOperation(value = "부위별 운동 영상 출력")
	public ResponseEntity<?> sortPart(String part) {
		List<Video> result = videoService.sortPart(part);

		if(result.isEmpty())
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

		return new ResponseEntity<List<Video>>(result, HttpStatus.OK);
	}

}