package helloWorld;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity(name = "PlaylistTrack")
public class PlaylistTrack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer id;
	
	
	@Column(name = "playlistid")
	public Integer PlaylistId;
	
	@Column(name = "trackid")
	public Integer TrackId;

	

	public void setPlaylistId(Integer playlistId) {
		PlaylistId = playlistId;
	}

	public void setTrackId(Integer trackId) {
		TrackId = trackId;
	}

}
