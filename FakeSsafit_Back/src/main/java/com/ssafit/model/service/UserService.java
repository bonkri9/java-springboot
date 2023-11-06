package com.ssafit.model.service;

import java.util.List;

import com.ssafit.model.dto.User;

public interface UserService {
	List<User> getUserList();

	User login(String userId, String password);

	int signup(User user);
}
