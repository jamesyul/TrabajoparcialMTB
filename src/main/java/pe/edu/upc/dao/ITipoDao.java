package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Tipo;

public interface ITipoDao {
	public void insert(Tipo e);
	public List<Tipo> list();
	public List<Tipo> findByNameTipo(Tipo e);
}
