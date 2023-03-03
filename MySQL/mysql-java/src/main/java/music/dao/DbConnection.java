package music.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import music.exception.DbException;

public class DbConnection {

	private static String HOST = "127.0.0.1";
	private static int PORT = 3306;
	private static String USER = "music";
	private static String PASSWORD = "music";
	private static String SCHEMA = "music";
	
	
	
	public static Connection getConnection() {
		
		String uri = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s", 
									HOST, PORT, SCHEMA, USER, PASSWORD);
		
		Connection conn;
		
		try {
			conn = DriverManager.getConnection(uri);
			System.out.println("CONNECTION TO " + SCHEMA + "WAS SUCCESSFUL. YOU HAVE HACKED THE MAINFRAME");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("YOU HAVE NOT HACKED THE MAINFRAME. WOMP WOMP.");
			throw new DbException("Unable to get connection at \" + uri");
		}
		
	}
	
	
}
