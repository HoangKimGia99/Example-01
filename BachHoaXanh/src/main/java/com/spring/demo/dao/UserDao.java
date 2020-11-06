package com.spring.demo.dao;

import com.spring.demo.model.Users;

public interface UserDao {
	 public Users findByUserName(String username);
	}