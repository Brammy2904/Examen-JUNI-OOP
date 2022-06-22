package helloWorld;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistTrackRepository extends CrudRepository<PlaylistTrack, Integer> {
	@Query(value = "Select * from PlaylistTrack", nativeQuery = true)
	Iterable<PlaylistTrack> getAllplayTracks();
}
