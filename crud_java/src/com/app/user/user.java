package com.app.user;

import java.io.InputStream;
import java.sql.*;

import com.java.admin.admin;

public class user {

	public static void main(String[] args) throws SQLException{
		Connection connection=admin.getconnection();
		if(connection!=null) {
			System.out.println("JDBC : CONNECTION IS ESTABLISHED\n");
		}
		//insertuser();
		//updateuser();
		getuser();
	}
	
	// insert 
	private static void insertuser() throws SQLException{
		
		Connection connection=admin.getconnection();
		Statement stamet=connection.createStatement();
		String sqlinsert="INSERT INTO details(id_no,first_Name,last_Name,email,passwordHash,location)"+" VALUES (3,'jhon','kumar','kumar001@gmail','jhon','delhi')";
		int executeupdate=stamet.executeUpdate(sqlinsert);
		if(executeupdate==1) {
			System.out.println("Entry is added");
		}
		else {
			System.out.println("Entry is not added");
		}
	}
	
	//update
	
	private static void updateuser() throws SQLException{
		
		Connection connection=admin.getconnection();
		Statement stamet=connection.createStatement();
		String sqlinsert=" UPDATE details SET first_Name='suman' where id_no=3";
		int executeupdate=stamet.executeUpdate(sqlinsert);
		if(executeupdate==1) {
			System.out.println("Entry is Updated");
		}
		else {
			System.out.println("Entry is not updated");
		}
	}
	
	private static void deleteuser() throws SQLException{
		
		Connection connection=admin.getconnection();
		Statement stamet=connection.createStatement();
		String sqlinsert="DELETE FROM details where id_no=3";
		int executeupdate=stamet.executeUpdate(sqlinsert);
		if(executeupdate==1) {
			System.out.println("Entry is delete");
		}
		else {
			System.out.println("Entry is not delete");
		}
	}

	private static void getuser() throws SQLException{
		
		Connection connection=admin.getconnection();
		Statement stamet=connection.createStatement();
		String sqlinsert="SELECT * FROM details";
		ResultSet RS=stamet.executeQuery(sqlinsert);
		while(RS.next()) {
			int user_id=RS.getInt("id_no");
			String firstname=RS.getString("first_Name");
			String lastname=RS.getString("last_Name");
			String email_id=RS.getString("email");
			InputStream password=RS.getBinaryStream("passwordHash");
			String location=RS.getString("location");
			System.out.println(user_id+" "+firstname+"   "+lastname+"   "+email_id+"   "+password+"   "+location);
		}
		
		
		
	}

}
