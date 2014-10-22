package com.demo.service;

import com.demo.model.UsersModel;

public interface UsersService {
	
	boolean add(UsersModel users);
	
	boolean delete(int id);
	
	UsersModel find(String username);

}
