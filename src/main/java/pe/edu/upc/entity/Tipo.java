package pe.edu.upc.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="tipos")
public class Tipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmpleado;
	@Column(name="nombre",length = 45, nullable = false)
	private String nombre;
	public Tipo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tipo(int idEmpleado, String nombre) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
