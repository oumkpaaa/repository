package com.atguigu.atcrowdfunding.listener;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;

public class StartSystemListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext application=sce.getServletContext();
		String APP_PATH=application.getContextPath();
		application.setAttribute("APP_PATH", APP_PATH);
		System.out.println(APP_PATH+"111111111111111111111111");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	
}
