package helloWorld;



import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "Track")
public class Track {
	public Track() {
		
		
	}
	public Track(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer id;
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Track other = (Track) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

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
