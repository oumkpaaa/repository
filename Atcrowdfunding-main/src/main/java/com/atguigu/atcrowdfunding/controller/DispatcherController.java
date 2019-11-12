package com.atguigu.atcrowdfunding.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.swing.text.StyleConstants.ColorConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.manager.service.UserService;
import com.atguigu.atcrowdfunding.util.Const;

@Controller
public class DispatcherController {
	
	@Autowired
	UserService userService;
	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("reg")
	public String reg() {
		return "reg";
	}
	
	@RequestMapping("dologin")
	public String dologin(String loginacct,String userpswd,String type,HttpSession session) {
		Map<String, Object> loginMap=new HashMap<String, Object>();
		loginMap.put("loginacct",loginacct );
		loginMap.put("userpswd",userpswd );
		loginMap.put("type", type);
		
		
		User user= userService.queryAndLogin(loginMap);
		session.setAttribute(Const.LOGIN_USER, user);
		return "redirect:/main.htm";
	}
	@RequestMapping("main")
	public String main() {
		
		return "main";
	}
}
