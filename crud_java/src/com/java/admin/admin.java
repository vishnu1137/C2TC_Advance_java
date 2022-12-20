package com.java.admin;

import java.sql.*;

public class admin {

	private static final String db_driverclass="com.mysql.cj.jdbc.Driver";
	private static final String db_username="root";
	private static final String db_password="vishnu";
	private static final String db_url="jdbc:mysql://127.0.0.1:3306/users";
	private static Connection con;
	static 
	{
		try {
			Class.forName(db_driverclass);
			con=DriverManager.getConnection(db_url,db_username,db_password);
		}
		catch (ClassNotFoundException |SQLException e){
			 e.printStackTrace();
		}
	}
	public static Connection getconnection() {
		return con;
	}

}
