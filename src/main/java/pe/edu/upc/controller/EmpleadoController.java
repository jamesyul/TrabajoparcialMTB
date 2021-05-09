package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Empleado;
import pe.edu.upc.service.IEmpleadoService;

@Named
@RequestScoped
public class EmpleadoController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEmpleadoService cS;
	
	private Empleado empleado;
	
	List<Empleado> listaEmpleados;
	
	@PostConstruct
	public void init() {
		this.listaEmpleados = new ArrayList<Empleado>();
		this.empleado= new Empleado();
		this.list();
	}
	
	public String newEmpleado() {
		this.setEmpleado(new Empleado());
		return "empleado.xhtml";
	}
	
	public void insert() {
		cS.insert(empleado);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaEmpleados= cS.list();
	}
	
	public void clean() {
		this.init();
	}
	
	public void findByName() {
		if (empleado.getNombreCompleto().isEmpty())
			this.list();
		else
			listaEmpleados= this.cS.findByNameEmpleado(this.getEmpleado());
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

}