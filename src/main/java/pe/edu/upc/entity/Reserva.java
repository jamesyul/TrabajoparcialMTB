package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="reservas")
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRserva;
	@Column(name="fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@Column(name="precio",length = 6,nullable = false)// esto es precio 
	private Float precio;
	
	@ManyToOne
	@JoinColumn(name="idBicicleta", nullable = false)
	private Bicicleta bicicleta;
	
	@ManyToOne
	@JoinColumn(name="idCliente", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="idPago", nullable = false)
	private Pago pago;

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int idRserva, Date fecha, Float precio, Bicicleta bicicleta, Cliente cliente, Pago pago) {
		super();
		this.idRserva = idRserva;
		this.fecha = fecha;
		this.precio = precio;
		this.bicicleta = bicicleta;
		this.cliente = cliente;
		this.pago = pago;
	}

	public int getIdRserva() {
		return idRserva;
	}

	public void setIdRserva(int idRserva) {
		this.idRserva = idRserva;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}
	

	
}
