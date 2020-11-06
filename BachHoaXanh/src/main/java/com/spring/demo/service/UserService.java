package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.dao.UserDao;
import com.spring.demo.model.Users;

@Service("userService")
public class UserService {
    @Autowired
    private UserDao userDao;
 
    public boolean isUsers(String username, String password) {
        Users user = userDao.findByUserName(username);
        if (user == null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
 
    public UserDao getUserDao() {
        return userDao;
    }
 
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}