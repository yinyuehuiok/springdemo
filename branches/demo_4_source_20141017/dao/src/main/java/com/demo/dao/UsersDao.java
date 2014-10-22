package com.demo.dao;

import com.demo.model.UsersModel;

public interface UsersDao {
	
	int add(UsersModel users);
	
	int delete(int id);
	
	UsersModel find(String username);
	
}
