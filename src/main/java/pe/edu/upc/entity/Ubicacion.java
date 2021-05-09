package pe.edu.upc.entity;

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
@Table(name ="ubicacion")
@SequenceGenerator(name="genLocation", initialValue = 1)
public class Ubicacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUbicacion;
	@Column(name="direccion",length = 45,nullable = false)
	private String direccion;
	@Column(name="departamento",length = 45,nullable = false)
	private String departamento;
	@Column(name="provincia",length = 45,nullable = false)
	private String provincia;
	@Column(name="pais",length = 30,nullable = false)
	private String pais;
	@Column(name="distrito",length = 45,nullable = false)
	private String distrito;
	
	
	@ManyToOne
	@JoinColumn(name="idEmpresa", nullable = false)
	private Empresa empresa;


	public Ubicacion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ubicacion(int idUbicacion, String direccion, String departamento, String provincia, String pais,
			String distrito, Empresa empresa) {
		super();
		this.idUbicacion = idUbicacion;
		this.direccion = direccion;
		this.departamento = departamento;
		this.provincia = provincia;
		this.pais = pais;
		this.distrito = distrito;
		this.empresa = empresa;
	}


	public int getIdUbicacion() {
		return idUbicacion;
	}


	public void setIdUbicacion(int idUbicacion) {
		this.idUbicacion = idUbicacion;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getDistrito() {
		return distrito;
	}


	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	

}
