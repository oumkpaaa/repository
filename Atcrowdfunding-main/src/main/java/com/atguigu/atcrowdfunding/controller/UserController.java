package com.atguigu.atcrowdfunding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.atcrowdfunding.manager.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
}
