package com.tnsif.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc {
	private static String DRIVERNAME="org.postgresql.Driver";
	private static String Username="postgres";
	private static String Password="Rishika3588";
	private static String URL="jdbc:postgresql://localhost:5432/tnsif";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.loading the driver
		Class.forName(DRIVERNAME);
		System.out.println("driver loaded");
		
		//2.Establish connection
		Connection con=DriverManager.getConnection(URL,Username,Password);
		System.out.println("connection established");
		
		//create statement
		Statement stmt=con.createStatement();
		
		//execute the query
		String query="select * from student";
		
		ResultSet rs=stmt.executeQuery(query);
		
		//retrieving the data
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		
		//close the connection
		stmt.close();
		con.close();
	}
}