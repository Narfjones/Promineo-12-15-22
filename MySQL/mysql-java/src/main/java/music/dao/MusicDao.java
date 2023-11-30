package music.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import music.exception.DbException;
import music.provided.util.DaoBase;
import entity.Artist;
import entity.Album;

public class MusicDao extends DaoBase {
  private static final String ARTISTS_TABLE = "artists";
  private static final String ALBUMS_TABLE = "albums";


  public List<Artist> fetchAllArtists() {
    String sql = "SELECT * FROM " + ARTISTS_TABLE + " ORDER BY artist_name";

    try(Connection conn = DbConnection.getConnection()) {
      startTransaction(conn);

      try(PreparedStatement stmt = conn.prepareStatement(sql)) {
        try(ResultSet rs = stmt.executeQuery()) {
          List<Artist> artists = new LinkedList<>();

          while(rs.next()) {
            artists.add(extract(rs, Artist.class));

            /* Alternative approach that uses straight JDBC method calls. */
            // Project project = new Project();
            //
            // project.setActualHours(rs.getBigDecimal("actual_hours"));
            // project.setDifficulty(rs.getObject("difficulty", Integer.class));
            // project.setEstimatedHours(rs.getBigDecimal("estimated_hours"));
            // project.setNotes(rs.getString("notes"));
            // project.setProjectId(rs.getObject("project_id", Integer.class));
            // project.setProjectName(rs.getString("project_name"));
            //
            // projects.add(project);
          }

          return artists;
        }
      }
      catch(Exception e) {
        rollbackTransaction(conn);
        throw new DbException(e);
      }
    }
    catch(SQLException e) {
      throw new DbException(e);
    }
    
  }
    
    public List<Album> fetchAllAlbums() {
        String sql = "SELECT * FROM " + ALBUMS_TABLE + " ORDER BY album_name";

        try(Connection conn = DbConnection.getConnection()) {
          startTransaction(conn);

          try(PreparedStatement stmt = conn.prepareStatement(sql)) {
            try(ResultSet rs = stmt.executeQuery()) {
              List<Album> albums = new LinkedList<>();

              while(rs.next()) {
                albums.add(extract(rs, Album.class));

                /* Alternative approach that uses straight JDBC method calls. */
                // Project project = new Project();
                //
                // project.setActualHours(rs.getBigDecimal("actual_hours"));
                // project.setDifficulty(rs.getObject("difficulty", Integer.class));
                // project.setEstimatedHours(rs.getBigDecimal("estimated_hours"));
                // project.setNotes(rs.getString("notes"));
                // project.setProjectId(rs.getObject("project_id", Integer.class));
                // project.setProjectName(rs.getString("project_name"));
                //
                // projects.add(project);
              }

              return albums;
            }
          }
          catch(Exception e) {
            rollbackTransaction(conn);
            throw new DbException(e);
          }
        }
        catch(SQLException e) {
          throw new DbException(e);
        }
    
    
    
    }
    
    public Artist fetchArtistById(Integer artistId) {
        String sql = "SELECT * FROM " + ARTISTS_TABLE + " WHERE artist_id = ?";

        try(Connection conn = DbConnection.getConnection()) {
          startTransaction(conn);

          try(PreparedStatement stmt = conn.prepareStatement(sql)) {
        	Artist artist = null;
        	  
            try(ResultSet rs = stmt.executeQuery()) {
              List<Artist> artists = new LinkedList<>();

              while(rs.next()) {
                artists.add(extract(rs, Artist.class));
              }
              
              
              return artist;
            }
          }
          catch(Exception e) {
            rollbackTransaction(conn);
            throw new DbException(e);
          }
        }
        catch(SQLException e) {
          throw new DbException(e);
        }
        
      }
  }
