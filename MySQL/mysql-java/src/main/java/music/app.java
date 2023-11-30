package music;

import music.dao.DbConnection;
import music.service.musicService;
import java.util.List;
import java.util.LinkedList;
import entity.Artist;

public class app {

	public static void main(String[] args) {
		
		User user = new User();
		user = whoAreYou();
		String schema = "music";
		
		DbConnection.setUserConn(user);
		DbConnection.setSchema(schema);
		DbConnection.getConnection();
		
		musicService music = new musicService();
		
		for (Artist artist : music.fetchAllArtists()) {
			System.out.print("Artist: " + artist.getArtistName() + " - ");
			System.out.println("ID: " + artist.getArtistId());
		}
	}
	
	public static User whoAreYou() {
		User user = new User();
		
		user.setUser("music");
		user.setPass("music");
		
		return user;
	}
	
}
