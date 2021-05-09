package pe.edu.upc.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="empresas")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmpresa;
	@Column(name="ruc",length = 11)
	private String ruc;
	@Column(name="nombre",length = 45, nullable = false)
	private String nombre;
	@Column(name="descripcion",length = 45, nullable = false)
	private String descripcion;
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empresa(int idEmpresa, String ruc, String nombre, String descripcion) {
		super();
		this.idEmpresa = idEmpresa;
		this.ruc = ruc;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
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
	
	
	
	
	
	
}
