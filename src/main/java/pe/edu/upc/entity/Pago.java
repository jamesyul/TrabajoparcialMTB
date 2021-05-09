package pe.edu.upc.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="pagos")
public class Pago {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPago;
	@Column(name="nombre",length = 45,nullable = false)
	private String nombre;
	@Column(name="monto",columnDefinition = "DECIMAL(8,2)")
	private Float monto;
	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pago(int idPago, String nombre, Float monto) {
		super();
		this.idPago = idPago;
		this.nombre = nombre;
		this.monto = monto;
	}
	public int getIdPago() {
		return idPago;
	}
	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
		
}
