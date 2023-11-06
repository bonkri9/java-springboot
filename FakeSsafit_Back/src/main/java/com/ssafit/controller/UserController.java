package com.ssafit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafit.model.service.UserService;
import com.ssafit.model.dto.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@Api(tags = "싸핏 사용자 컨트롤러")
@RequestMapping("/api-user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("users")
	@ApiOperation(value = "유저 조회", notes = "유저들 불러와")
	public List<User> userList() {
		return userService.getUserList();
	}

	@PostMapping("signup")
	public ResponseEntity<Integer> signup(User user) {
		int result = userService.signup(user);
		return new ResponseEntity<Integer>(result, HttpStatus.CREATED);
	}

	@PostMapping("login")
	@ApiResponse(code = 200, message = "성공")
	public ResponseEntity<?> login(String userId, String password, @ApiIgnore HttpSession session) {
		User tmp = userService.login(userId, password);
		if (tmp == null)
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);

		HttpHeaders resHeaders = new HttpHeaders();
		resHeaders.add("Content-Type", "text/plain;charset=UTF-8");

		session.setAttribute("loginUser", tmp.getUserName());
		return new ResponseEntity<String>(tmp.getUserName(), resHeaders, HttpStatus.OK);
	}

	@GetMapping("logout")
	public ResponseEntity<String> logout(@ApiIgnore HttpSession session) {
		session.invalidate();
		return new ResponseEntity<String>("Logout", HttpStatus.OK);

	}

}