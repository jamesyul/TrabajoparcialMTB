package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Marca;
import pe.edu.upc.service.IMarcaService;

@Named
@RequestScoped
public class MarcaController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IMarcaService mS;
	
	private Marca marca;
	
	List<Marca> listaMarcas;
	
	@PostConstruct
	public void init() {
		this.listaMarcas = new ArrayList<Marca>();
		this.marca= new Marca();
		this.list();
	}
	
	public String newMarca() {
		this.setMarca(new Marca());
		return "marca.xhtml";
	}
	
	public void insert() {
		mS.insert(marca);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaMarcas= mS.list();
	}
	
	public void clean() {
		this.init();
	}
	
	public void findByName() {
		if (marca.getNombre().isEmpty())
			this.list();
		else
			listaMarcas= this.mS.findByNameMarca(this.getMarca());
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Marca> getListaMarcas() {
		return listaMarcas;
	}

	public void setListaMarcas(List<Marca> listaMarcas) {
		this.listaMarcas = listaMarcas;
	}

	

}