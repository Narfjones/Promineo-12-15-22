package music.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import music.exception.DbException;
import music.User;

public class DbConnection {

	private static String HOST = "localhost";
	private static int PORT = 3306;
	private static String USER;
	private static String PASSWORD;
	private static String SCHEMA;
	
	public static void setUserConn(User us) {
		USER = us.getUser();
		PASSWORD = us.getPass();
	}
	
	public static void setSchema(String sc) {
		SCHEMA = sc;
	}
	
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
	
	private void setUser(String us) {
		USER = us;
	}
	
	private void setPass(String pw) {
		PASSWORD = pw;
	}
	
	
}
