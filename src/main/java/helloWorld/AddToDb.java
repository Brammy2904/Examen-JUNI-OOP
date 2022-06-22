package helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AddToDb {
	@Autowired
	private PlaylistRepository playlistRep;
	@Autowired
	private PlaylistTrackRepository playlisttrackRep;
	
	@Autowired
	private TrackRepository trackRep;
	
	public void initTrack(String name, Double price) {
		Track track1 = new Track();
		track1.setName(name);
		track1.setPrice(price);
		trackRep.save(track1);
	}
	public void initArtist(String name) {
		Playlist playlist1 = new Playlist();
		playlist1.setName(name);
		playlistRep.save(playlist1);
	}
	public void initPlayTrack(Integer trackId, Integer playlistId) {
		PlaylistTrack playTrack1 = new PlaylistTrack();
		playTrack1.setPlaylistId(playlistId);
		playTrack1.setTrackId(trackId);
		playlisttrackRep.save(playTrack1);
	}
	
//public void initArtistExist(String artistName, Integer Id) {
//	Artist artist1 = new Artist();
//	artist1.setId(Id);
//	artist1.setName(artistName);
//	artistRep.save(artist1);
//}
//public void initArtistNew(String artistName) {
//	Artist artist1 = new Artist();
//	artist1.setName(artistName);
//	artistRep.save(artist1);
//}
//public void initTrack(String trackName, String trackURL, String imgURL, String artistName, Integer Id, double duration) {
//	Track track1 = new Track();
//	track1.setName(trackName);
//	track1.setURL(trackURL);
//	track1.setImg(imgURL);
//	track1.setArtistId(Id);
//	track1.setDur(duration);
//	trackRep.save(track1);
//}

}
