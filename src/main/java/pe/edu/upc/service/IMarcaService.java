package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Marca;

public interface IMarcaService {
	public void insert(Marca e);
	public List<Marca> list();
	public List<Marca> findByNameMarca(Marca e);
}
