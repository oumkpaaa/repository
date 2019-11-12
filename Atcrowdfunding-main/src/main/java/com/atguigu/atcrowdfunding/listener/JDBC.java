package com.atguigu.atcrowdfunding.listener;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) throws Exception {
		 
		// 1. ע������
		// ʹ��java.sql.DriverManager��ľ�̬����registerDriver(Driver driver)
		// Driver��һ���ӿ�,��������:MySQL���������ʵ����
		// DriverManager.registerDriver(new Driver());
		// �鿴������Դ��,ע����������,�˷���Դ
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2. �������
		// uri:���ݿ��ַ jdbc:mysql://��������ip:�˿ں�//���ݿ�����
		String url = "jdbc:mysql://localhost:3306/atcrowdfunding?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
		// static Connection getConnection(String url, String user, String password)
		// ����ֵ��java.sql.Connection�ӿڵ�ʵ����,��MySQL����������
		Connection conn = DriverManager.getConnection(url, "root", "root");
		System.out.println(conn);// com.mysql.jdbc.JDBC4Connection@10d1f30
		// 3. ������ִ��ƽ̨,ͨ�����ݿ����Ӷ���,��ȡ��SQL����ִ���߶���
		//conn����,���÷��� Statement createStatement() ��ȡStatement����,��SQL��䷢�͵����ݿ�
		//���ص���Statement�ӿڵ�ʵ�������,��MySQL����������
		Statement stat = conn.createStatement();
		System.out.println(stat);//com.mysql.jdbc.StatementImpl@137bc9
		// 4. ִ��sql���
		//ͨ��ִ���߶�����÷���ִ��SQL���,��ȡ���
		//int executeUpdate(String sql)  ִ�����ݿ��е�SQL���,������insert,update,delete
		//����ֵint,�����ɹ����ݿ������
//		int row = stat.executeUpdate("INSERT INTO sort(sname,sprice,sdesc) VALUES('������Ʒ',50000,'����Ǽ�')");
//		System.out.println(row);
		// 5. �ͷ���Դ
		stat.close();
		conn.close();
	}


}
