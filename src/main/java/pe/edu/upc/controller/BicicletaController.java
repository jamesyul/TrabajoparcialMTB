package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Bicicleta;
import pe.edu.upc.service.IBicicletaService;

@Named
@RequestScoped
public class BicicletaController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IBicicletaService bS;
	
	private Bicicleta bicicleta;
	
	List<Bicicleta> listaBicicletas;
	
	@PostConstruct
	public void init() {
		this.listaBicicletas = new ArrayList<Bicicleta>();
		this.bicicleta= new Bicicleta();
		this.list();
	}
	
	public String newBicicleta() {
		this.setBicicleta(new Bicicleta());
		return "bicicleta.xhtml";
	}
	
	public void insert() {
		bS.insert(bicicleta);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaBicicletas= bS.list();
	}
	
	public void clean() {
		this.init();
	}
	
	public void findByName() {
		if (bicicleta.getNombre().isEmpty())
			this.list();
		else
			listaBicicletas= this.bS.findByNameBicicleta(this.getBicicleta());
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public List<Bicicleta> getListaBicicletas() {
		return listaBicicletas;
	}

	public void setListaBicicletas(List<Bicicleta> listaBicicletas) {
		this.listaBicicletas = listaBicicletas;
	}

}