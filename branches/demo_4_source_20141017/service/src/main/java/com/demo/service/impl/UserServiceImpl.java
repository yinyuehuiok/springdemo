package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UsersDao;
import com.demo.model.UsersModel;
import com.demo.service.UsersService;

@Service
public class UserServiceImpl implements UsersService {

	@Autowired
	private UsersDao usersDao;

	@Override
	public boolean add(UsersModel users) {
		return usersDao.add(users)==1;
	}

	@Override
	public boolean delete(int id) {
		return usersDao.delete(id)==1;
	}

	@Override
	public UsersModel find(String username) {
		return usersDao.find(username);
	}
	
}
