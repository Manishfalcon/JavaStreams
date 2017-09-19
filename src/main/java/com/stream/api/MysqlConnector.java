package com.stream.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConnector {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			System.out.println("mysql Driver finding");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("mysql Driver found");
			System.out.println("Searching Database");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
			System.out.println("Database connected!!");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from accounts");
			while (rs.next())
				System.out.println(rs.getInt(1) + "-"+rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		con.close();
	}

}
