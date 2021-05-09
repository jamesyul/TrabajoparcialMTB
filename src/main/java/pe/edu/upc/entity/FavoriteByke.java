package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="favoritobicicleta")
@SequenceGenerator(name="genFavoriteByke", initialValue = 1)

public class FavoriteByke {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genFavoriteByke")
	@Column(name="FavoriteByke", columnDefinition = "NUMERIC(4)" )
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idBicicleta", nullable = false)
	private Bicicleta bike;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idFavoritos", nullable = false)
	private Favorito favorite;
	
	public FavoriteByke() { 
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Bicicleta getBike() {
		return bike;
	}

	public void setBike(Bicicleta bike) {
		this.bike = bike;
	}

	public Favorito getFavorite() {
		return favorite;
	}

	public void setFavorite(Favorito favorite) {
		this.favorite = favorite;
	}
	

}
