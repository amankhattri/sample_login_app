
package com.javawebtutor.LoginWebApp;
import java.sql.*;

public class dbclass {
  private static Connection con;
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		 Class.forName("com.mysql.jdbc.Driver");
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root","root");
		System.out.println("connected with database");
	return con;
	}
	
	
}