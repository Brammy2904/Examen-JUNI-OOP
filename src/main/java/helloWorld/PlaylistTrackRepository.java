package helloWorld;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistTrackRepository extends CrudRepository<PlaylistTrack, Integer> {
	@Query(value = "Select * from PlaylistTrack", nativeQuery = true)
	Iterable<PlaylistTrack> getAllplayTracks();
	
	@Modifying
    @Transactional 
	@Query(value = "delete from playlisttrack where trackId = ?1", nativeQuery = true)
	void delete(@Param("trackid") Integer trackid);
}
