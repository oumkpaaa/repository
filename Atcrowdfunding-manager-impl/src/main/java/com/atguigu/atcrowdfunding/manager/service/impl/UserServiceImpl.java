package com.atguigu.atcrowdfunding.manager.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.exception.LoginFailException;
import com.atguigu.atcrowdfunding.manager.dao.UserMapper;
import com.atguigu.atcrowdfunding.manager.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;

	public User queryAndLogin(Map loginMap) {
		User user=userMapper.queryUserlogin(loginMap);
		if (user==null) {
			throw new LoginFailException("用户名或密码错误!");
		}
		return user;
	}
}
