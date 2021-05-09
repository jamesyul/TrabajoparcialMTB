package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Marca;

public interface IMarcaDao {
	public void insert(Marca e);
	public List<Marca> list();
	public List<Marca> findByNameMarca(Marca e);
}
