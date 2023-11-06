package com.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafit.model.dao.UserDao;
import com.ssafit.model.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userDao.selectAll();
	}

	@Override
	public User login(String userId, String password) {
		// TODO Auto-generated method stub
		User tmpUser = userDao.selectOne(userId);
		
		if(tmpUser !=null && tmpUser.getPassword().equals(password)) {
			return tmpUser;
		}
		return null;
		
	}

	@Override
	public int signup(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

}
