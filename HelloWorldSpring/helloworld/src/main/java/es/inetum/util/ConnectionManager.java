package es.inetum.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static Connection connection;
	
	public static void  conectar() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://172.26.54.35:3306/inetum", "root", "1234567890");
	}

	public static void desconectar() throws SQLException {
		connection.close();
	}
	public static Connection getConnection() {
		return connection;
	}

}