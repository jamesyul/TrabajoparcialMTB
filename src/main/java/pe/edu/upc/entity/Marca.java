package pe.edu.upc.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="marcas")
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMarca;
	@Column(name="nombre",length = 20, nullable = false)
	private String nombre;
	public Marca() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marca(int idMarca, String nombre) {
		super();
		this.idMarca = idMarca;
		this.nombre = nombre;
	}
	public int getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
		
	
}
