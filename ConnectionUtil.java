package com.netcracker.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static final String URL = "jdbc:mysql://localhost/sit";
	private static final String USER = "root";
	private static final String PASS = "";
	
	private static Connection connection;
	
	private ConnectionUtil() {}
	
	public static Connection getConnection()
	{
		try
		{
			if(connection==null || connection.isClosed())
			{
				connection = DriverManager.getConnection(URL,USER,PASS);
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
			return connection;
	}
}
