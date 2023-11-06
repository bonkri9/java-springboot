package com.ssafit.model.dao;

import java.util.List;

import com.ssafit.model.dto.User;

public interface UserDao {
	List<User> selectAll();
	
	User selectOne(String userId);
	
	int insertUser(User user);
}
