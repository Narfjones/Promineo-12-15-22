package entity;

import java.util.LinkedList;
import java.util.List;

public class Album {
	private Integer album_id;
	private String album_name;
	private Integer release_year;
	
	private List<Artist> artists = new LinkedList<>();
	
	public Integer getAlbumId() {
		return album_id;
	}
	
	public void setAlbumId(Integer albumId) {
		this.album_id = albumId;
	}
	
	public String getAlbumName() {
		return album_name;
	}
	
	public void setAlbumName(String albumName) {
		this.album_name = albumName;
	}
	
	public Integer getReleaseYear() {
		return release_year;
	}
	
	public void setReleaseYear(Integer year) {
		this.release_year = year;
	}
	
}
