package com.example.demo.model.service;

import java.util.List;

import com.example.demo.model.dto.User;


public interface UserService {

//	public abstract List<User> getUserList(); //아래와 동일
	List<User> getUserList();

	int signup(User user);

	User login(User user);
	
}
