package pe.edu.upc.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="viajes")
public class viaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idViaje;
	@Column(name="inicioViaje",length = 45,nullable = false)
	private String inicioViaje;
	@Column(name="finalViaje",length = 45,nullable = false)
	private String finalViaje;
	
	@ManyToOne
	@JoinColumn(name="idReserva", nullable = false)
	private Reserva reserva;

	public viaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public viaje(int idViaje, String inicioViaje, String finalViaje, Reserva reserva) {
		super();
		this.idViaje = idViaje;
		this.inicioViaje = inicioViaje;
		this.finalViaje = finalViaje;
		this.reserva = reserva;
	}

	public int getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(int idViaje) {
		this.idViaje = idViaje;
	}

	public String getInicioViaje() {
		return inicioViaje;
	}

	public void setInicioViaje(String inicioViaje) {
		this.inicioViaje = inicioViaje;
	}

	public String getFinalViaje() {
		return finalViaje;
	}

	public void setFinalViaje(String finalViaje) {
		this.finalViaje = finalViaje;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
	
	
}
