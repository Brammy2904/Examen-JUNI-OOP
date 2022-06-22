package helloWorld;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends CrudRepository<Playlist, Integer> {
	@Query(value = "Select * from Playlist", nativeQuery = true)
	Iterable<Playlist> getAllPlaylists();
	
	@Query(value = "Select * from Playlist a where a.name = ?1", nativeQuery = true)
	Playlist byName(@Param("name") String name);
	
	@Query(value = "Select * from Playlist a where a.name = ?1", nativeQuery = true)
	Playlist getId(@Param("name") String name);
}
