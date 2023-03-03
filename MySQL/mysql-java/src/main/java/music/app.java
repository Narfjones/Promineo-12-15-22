package music;

import music.dao.DbConnection;

public class app {

	public static void main(String[] args) {
		DbConnection.getConnection();
	}
	
}
