package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Favorito;
import pe.edu.upc.service.IFavoritoService;

@Named
@RequestScoped
public class FavoritoController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IFavoritoService fS;
	
	private Favorito favorito;
	
	List<Favorito> listaFavoritos;
	
	@PostConstruct
	public void init() {
		this.listaFavoritos = new ArrayList<Favorito>();
		this.favorito= new Favorito();
		this.list();
	}
	
	public String newFavorito() {
		this.setFavorito(new Favorito());
		return "favorito.xhtml";
	}
	
	public void insert() {
		fS.insert(favorito);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaFavoritos= fS.list();
	}
	
	public void clean() {
		this.init();
	}
	
	public void findByName() {
		if (favorito.getNombre().isEmpty())
			this.list();
		else
			listaFavoritos= this.fS.findByNameFavorito(this.getFavorito());
	}

	public Favorito getFavorito() {
		return favorito;
	}

	public void setFavorito(Favorito favorito) {
		this.favorito = favorito;
	}

	public List<Favorito> getListaFavoritos() {
		return listaFavoritos;
	}

	public void setListaFavoritos(List<Favorito> listaFavoritos) {
		this.listaFavoritos = listaFavoritos;
	}

	

}