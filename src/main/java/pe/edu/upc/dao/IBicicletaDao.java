package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Bicicleta;

public interface IBicicletaDao {
	public void insert(Bicicleta e);
	public List<Bicicleta> list();
	public List<Bicicleta> findByNameBicicleta(Bicicleta e);
}
