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
@Table (name ="favoritos")
public class Favorito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFavorito;
	@Column(name="nombre",length = 45,nullable = false)
	private String nombre;
	@Column(name="descripcion",length = 100,nullable = false)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="idCliente", nullable = false)
	private Cliente cliente;

	public Favorito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Favorito(int idFavorito, String nombre, String descripcion, Cliente cliente) {
		super();
		this.idFavorito = idFavorito;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cliente = cliente;
	}

	public int getIdFavorito() {
		return idFavorito;
	}

	public void setIdFavorito(int idFavorito) {
		this.idFavorito = idFavorito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
