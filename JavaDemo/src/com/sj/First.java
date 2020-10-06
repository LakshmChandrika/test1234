package com.sj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class First {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstproject","root","Chandrika1@");
		Statement stmt = connection.createStatement();
		ResultSet r = stmt.executeQuery("select * from user");
		while(r.next()) {
			System.out.println(r.getInt(1)+" , "+r.getString(2)+" , "+r.getString(3));
		}
	
	}
	
	

}
