package helloWorld;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HelloController {
	
	@Autowired
	private AddToDb add;
	
	
	@Autowired
	private TrackRepository trackRep;
	
	@Autowired
	private PlaylistRepository playlistRepo;
	
	
	
	@GetMapping("/all")
	public Iterable<Track> all() {
		
		return trackRep.getAllTracks();
	}
	@GetMapping("/add")
	public String add(@RequestParam(required=true) String trackName, @RequestParam(required=true) Double price, @RequestParam(required=true) String playlistName) {
		Track track1 = trackRep.byName(trackName);
		if(track1 == null) {
			add.initTrack(trackName, price);
			Playlist playlist1 = playlistRepo.byName(playlistName);
			if(playlist1 == null) {
				add.initArtist(playlistName);
				Integer playid = playlistRepo.getId(playlistName).Id;
				Integer trackid = trackRep.getId(trackName).id;
				add.initPlayTrack(trackid, playid);
				return "Toegevoegd (Artist bestond nog niet)";
			}
			else if(playlist1 != null) {
				Integer playid = playlistRepo.getId(playlistName).Id;
				Integer trackid = trackRep.getId(trackName).id;
				add.initPlayTrack(trackid, playid);
				return "Toegevoegd (artist bestond al)";
			}
		}
		
		return "Dit liedje bestaat al";
	}
		
	
}
