package entity;

import java.util.LinkedList;
import java.util.List;

public class Artist {
	private Integer artist_id;
	private String artist_name;
	
	private List<Album> albums = new LinkedList<>();
	
	public Integer getArtistId() {
		return artist_id;
	}
	
	public void setArtistId(Integer artistId) {
		this.artist_id = artistId;
	}
	
	public String getArtistName() {
		return artist_name;
	}
	
	public void setArtistName(String artistName) {
		this.artist_name = artistName;
	}
	
	public List<Album> getAlbums() {
		return albums;
	}
	
}
