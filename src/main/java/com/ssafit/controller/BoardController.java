package com.ssafit.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.model.dto.Board;
import com.ssafit.model.service.BoardService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api-")
@Api(tags = "싸핏 게시판 컨트롤러")
public class BoardController extends HttpServlet {

	@Autowired
	private BoardService boardService;

	@GetMapping("/board/")
	@ApiOperation(value = "게시글 조회")
	public ResponseEntity<?> list(@RequestParam String videoId) {
		List<Board> list = boardService.getList(videoId);
		if (list == null || list.size() == 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
	}

	@GetMapping("/board/{userId}")
	public ResponseEntity<?> detailList(@PathVariable String userId) {
		List<Board> detailList = boardService.getBoardById(userId);
		if (detailList == null || detailList.size() == 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Board>>(detailList, HttpStatus.OK);
	}

	@PostMapping("/board")
	public ResponseEntity<Board> write(Board board) {
		boardService.writeBoard(board);
		return new ResponseEntity<Board>(board, HttpStatus.OK);
	}

	@PutMapping("/board")
	public ResponseEntity<Void> update(@RequestBody Board board) {
		boardService.modifyBoard(board);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/board/{userId}")
	public ResponseEntity<Void> delete(@PathVariable String userId, String videoId) {
		boardService.removeBoard(userId, videoId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
