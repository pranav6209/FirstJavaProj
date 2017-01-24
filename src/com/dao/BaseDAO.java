package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {

	static Connection connection = null;

	// create connection and return connection object.

	public static Connection getConnection() {

		try {
			Class.forName("org.gjt.mm.mysql.Driver");

			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();

		}

		return connection;
	}

}
