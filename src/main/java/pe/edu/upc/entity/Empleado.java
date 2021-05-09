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
@Table(name="empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmpleado;
	
	@Column(name="nombreCompleto", nullable=false, length=45)
	private String nombreCompleto;
	
	@Column(name="apellido", nullable=false, length=45)
	private String apellido;
	
	@Column(name="dni", nullable=false, length=9)
	private String dni;
	
	@Column(name="correo")
	private String  correo;

	@ManyToOne
	@JoinColumn(name="idEmpresa", nullable = false)
	private Empresa empresa;

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(int idEmpleado, String nombreCompleto, String apellido, String dni, String correo,
			Empresa empresa) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombreCompleto = nombreCompleto;
		this.apellido = apellido;
		this.dni = dni;
		this.correo = correo;
		this.empresa = empresa;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	

}
