package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudentToDB(Student std) throws Exception {
		boolean f=false;
		//jdbc code
		Connection con=CG.createConnection();
		String q="insert into students values(?,?,?,?,?)";
		//prepare statement
		PreparedStatement ps=con.prepareStatement(q);
		//set values of paramenter
		ps.setLong(1, std.getStudentId());
		ps.setString(2, std.getStudentName());
		ps.setString(3, std.getStudentCity());
		ps.setString(4, std.getStudentCountry());
		ps.setString(5, std.getStudentPincode());
		
		//execute
		ps.executeUpdate();
		f=true;
		return f;
	}

	public static boolean deleteStudent(int userId) throws Exception {
		boolean f=false;
		//jdbc code
		Connection con=CG.createConnection();
		String q="delete from students where stdId=?";
		//prepare statement
		PreparedStatement ps=con.prepareStatement(q);
		//set values of paramenter
		ps.setInt(1,userId);
		
		//execute
		ps.executeUpdate();
		f=true;
		return f;
	}

	public static void showStudentDetails() throws Exception {

		//jdbc code
		Connection con=CG.createConnection();
		String q="select * from students;";
		//prepare statement
		Statement statement=con.createStatement();
		
		ResultSet set=statement.executeQuery(q);
		
		while(set.next()) {
		int id=set.getInt(1);
		String name=set.getString(2);
		String city=set.getString(3);
		String country=set.getString(4);
		String pincode=set.getString(5);
		
		System.out.println("Id: "+id+"     Name: "+name+"     City: "+city+"     Country: "+country+"     Pincode: "+pincode);
//		System.out.println("Name: "+name);
//		System.out.println("City: "+city);
//		System.out.println("Country: "+country);
//		System.out.println("Pincode: "+pincode);
		//System.out.println("------------------***-----------------\n");
		}
		System.out.println(" ");
	}
}
