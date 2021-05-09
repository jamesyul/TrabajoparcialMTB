package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Favorito;

public interface IFavoritoService {
	public void insert(Favorito e);
	public List<Favorito> list();
	public List<Favorito> findByNameFavorito(Favorito e);
}
