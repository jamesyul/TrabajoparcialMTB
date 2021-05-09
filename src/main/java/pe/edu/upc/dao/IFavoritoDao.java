package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Favorito;

public interface IFavoritoDao {
	public void insert(Favorito e);
	public List<Favorito> list();
	public List<Favorito> findByNameFavorito(Favorito e);
}
