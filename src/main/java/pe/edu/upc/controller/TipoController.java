package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tipo;
import pe.edu.upc.service.ITipoService;

@Named
@RequestScoped
public class TipoController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITipoService tS;
	
	private Tipo tipo;
	
	List<Tipo> listaTipos;
	
	@PostConstruct
	public void init() {
		this.listaTipos = new ArrayList<Tipo>();
		this.tipo= new Tipo();
		this.list();
	}
	
	public String newTipo() {
		this.setTipo(new Tipo());
		return "tipo.xhtml";
	}
	
	public void insert() {
		tS.insert(tipo);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaTipos= tS.list();
	}
	
	public void clean() {
		this.init();
	}
	
	public void findByName() {
		if (tipo.getNombre().isEmpty())
			this.list();
		else
			listaTipos= this.tS.findByNameTipo(this.getTipo());
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public List<Tipo> getListaTipos() {
		return listaTipos;
	}

	public void setListaTipos(List<Tipo> listaTipos) {
		this.listaTipos = listaTipos;
	}

	
}