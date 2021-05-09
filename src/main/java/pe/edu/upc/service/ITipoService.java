package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Tipo;

public interface ITipoService {
	public void insert(Tipo e);
	public List<Tipo> list();
	public List<Tipo> findByNameTipo(Tipo e);
}
