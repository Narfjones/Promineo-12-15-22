package music.service;

import java.util.List;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import music.dao.MusicDao;
import entity.Artist;
import entity.Album;

public class musicService {
	private MusicDao musicDao = new MusicDao();
	
	public List<Artist> fetchAllArtists() {
		return musicDao.fetchAllArtists();
	}
	
	public List<Album> fetchAllAlbums() {
		return musicDao.fetchAllAlbums();
	}
	
	public List<Album> fetchAlbumsWithoutReleaseYear() {
		List<Album> albumsNoRelease = new LinkedList<>();
		albumsNoRelease = fetchAllAlbums();
		
		for (Album album : albumsNoRelease) {
			album.setReleaseYear(null);
		}
		
		return albumsNoRelease;
		
	}
	
	public Artist fetchArtistById(Integer artistId) {
		return musicDao.fetchArtistById(artistId);
	}
	
	
}
