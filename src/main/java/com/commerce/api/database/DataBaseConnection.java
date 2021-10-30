package com.commerce.api.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	public static final String DB_URL = "jdbc:postgresql://localhost:/5432/de7ktulep1ope8";
	public static final String DB_USER = "voaigleuvurldx";
	public static final String DB_PASSWORD = "2f453fad63f631856c8a1a1370b9a6d6a3ef80d9669f4d6e86a7011ed2fcd200";

	public void ConnectToDataBase() throws Exception {

		try {

			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			System.out.println("Conexão sucedida!");

		} catch (SQLException ex) {
			System.out.println("Conexão interrompida!");
			ex.printStackTrace();
		}

	}
}
