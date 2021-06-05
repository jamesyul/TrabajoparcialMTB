package pe.edu.upc.trabajofinal.model.entity;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="travel")
@SequenceGenerator(name="genTravel", initialValue = 1)

public class Travel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genTravel")
	@Column(name="idTravel",columnDefinition = "NUMERIC(6)")
	private Integer id;
	@Column(name="startTravel",length = 45,nullable = false)
	private String startTravel;
	@Column(name="endTravel",length = 45,nullable = false)
	private String endTravel;
	
	@ManyToOne
	@JoinColumn(name="idReservation", nullable = false)
	private Reservation reservation;
	
	public Travel(){ 
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStartTravel() {
		return startTravel;
	}

	public void setStartTravel(String startTravel) {
		this.startTravel = startTravel;
	}

	public String getEndTravel() {
		return endTravel;
	}

	public void setEndTravel(String endTravel) {
		this.endTravel = endTravel;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	

	
	
}
