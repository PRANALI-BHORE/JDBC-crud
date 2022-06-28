package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CG {
	static Connection con;
	
	public static Connection createConnection() throws Exception {
		//load driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//create connection
		String user="root";
		String password="Pranali@mysql1";
		String url="jdbc:mysql://localhost:3306/student_manage";
		
		con=DriverManager.getConnection(url, user, password);
		
		return con;
	}
	
}
