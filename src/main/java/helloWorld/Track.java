package helloWorld;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "Track")
public class Track {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer id;
	
	

	@Column(name = "name")
	public String name;
	
	@Column(name="price")
	public Double price;

//	@ManyToMany
//    @JoinTable(name = "PlaylistTrack", joinColumns = @JoinColumn(name = "playlistid", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "playlistid", referencedColumnName = "id"))
//    public Iterable<Playlist> playlist;
	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
