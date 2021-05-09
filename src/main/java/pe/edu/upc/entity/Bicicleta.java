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
@Table(name="bicicletas")
public class Bicicleta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idBicicleta;
	
	@Column(name="nombre", length = 45, nullable = false)
	private String nombre;
	@Column(name="modelo", length = 45,nullable = false)
	private String modelo;
	@Column(name="talla", length = 10, nullable = false)
	private String talla;
	@Column(name="aro", length = 10, nullable = false)
	private String aro;
	@Column(name="cantidad", length = 4, nullable = false)
	private Integer cantidad;
	
	@ManyToOne
	@JoinColumn(name="idTipo", nullable = false)
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name="idMarca", nullable = false)
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name="idEmpresa", nullable = false)
	private Empresa empresa;

	public Bicicleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bicicleta(int idBicicleta, String nombre, String modelo, String talla, String aro, Integer cantidad,
			Tipo tipo, Marca marca, Empresa empresa) {
		super();
		this.idBicicleta = idBicicleta;
		this.nombre = nombre;
		this.modelo = modelo;
		this.talla = talla;
		this.aro = aro;
		this.cantidad = cantidad;
		this.tipo = tipo;
		this.marca = marca;
		this.empresa = empresa;
	}

	public int getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(int idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getAro() {
		return aro;
	}

	public void setAro(String aro) {
		this.aro = aro;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	
	
	
	
}
