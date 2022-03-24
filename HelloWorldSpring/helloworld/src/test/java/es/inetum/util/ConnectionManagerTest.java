package es.inetum.util;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class ConnectionManagerTest {

	@Test
	void testConectar() {
		Connection con;
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://172.26.54.35:3306/inetum", "root", "1234567890");
		ConnectionManager.conectar();
		
			ConnectionManager.conectar();
			assertTrue(true); 
			
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false); 
			e.printStackTrace();
		}
		
		con = null;
		try {
			ConnectionManager.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
