package com.atguigu.atcrowdfunding.manager.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.atcrowdfunding.manager.service.TestService;

@Controller
public class TestController {
	@Autowired
	TestService testService;
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("111111111111111111");
		Map map=new HashMap();
		map.put("name", "zhangsan");
		testService.test(map);
		return "success";
	}
	
}
