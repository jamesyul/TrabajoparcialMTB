package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Empresa;
import pe.edu.upc.service.IEmpresaService;

@Named
@RequestScoped
public class EmpresaController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEmpresaService eS;
	
	private Empresa empresa;
	
	List<Empresa> listaEmpresas;
	
	@PostConstruct
	public void init() {
		this.listaEmpresas = new ArrayList<Empresa>();
		this.empresa= new Empresa();
		this.list();
	}
	
	public String newEmpresa() {
		this.setEmpresa(new Empresa());
		return "empresa.xhtml";
	}
	
	public void insert() {
		eS.insert(empresa);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaEmpresas= eS.list();
	}
	
	public void clean() {
		this.init();
	}
	
	public void findByName() {
		if (empresa.getNombre().isEmpty())
			this.list();
		else
			listaEmpresas= this.eS.findByNameEmpresa(this.getEmpresa());
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}

	public void setListaEmpresas(List<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}

	

}