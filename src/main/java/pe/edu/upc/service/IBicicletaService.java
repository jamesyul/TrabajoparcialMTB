package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Bicicleta;

public interface IBicicletaService {
	public void insert(Bicicleta e);
	public List<Bicicleta> list();
	public List<Bicicleta> findByNameBicicleta(Bicicleta e);
}
