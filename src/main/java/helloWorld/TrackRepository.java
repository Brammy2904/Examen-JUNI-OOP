package helloWorld;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import helloWorld.Track;

@Repository
public interface TrackRepository extends CrudRepository<Track, Integer>{
	
	@Query(value = "Select * from Track a join playlistTrack e on a.id = e.trackid", nativeQuery = true)
	Iterable<Track> getAllTracks();
	
	@Query(value = "Select * from Track a where a.name = ?1", nativeQuery = true)
	Track byName(@Param("name") String name);
	@Query(value = "Select * from Track a where a.name = ?1", nativeQuery = true)
	Track getId(@Param("name") String name);

}
