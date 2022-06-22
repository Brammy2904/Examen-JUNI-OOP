package helloWorld;

import java.sql.Blob;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="Playlist")
public class Playlist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Integer Id;
	
	@Column(name="name")
	public String Name;

//	@ManyToMany
//    @JoinTable(name = "PlaylistTrack", joinColumns = @JoinColumn(name = "trackid", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "trackid", referencedColumnName = "id"))
//    public Iterable<Track> track;
	public void setId(Integer id) {
		Id = id;
	}

	public void setName(String name) {
		Name = name;
	}

	
	
	
	
	
	
}
