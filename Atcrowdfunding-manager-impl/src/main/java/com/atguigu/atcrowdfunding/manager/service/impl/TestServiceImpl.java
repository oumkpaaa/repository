package com.atguigu.atcrowdfunding.manager.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.manager.dao.TestDao;
import com.atguigu.atcrowdfunding.manager.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	TestDao testDao;
	public void test(Map map) {
		System.out.println("׼���������ݿ�");
		testDao.insert(map);;
		System.out.println("���ݳ���ɹ�");
		
	}

}
