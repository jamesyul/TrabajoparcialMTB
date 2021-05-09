package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Empresa;

public interface IEmpresaService {
	public void insert(Empresa e);
	public List<Empresa> list();
	public List<Empresa> findByNameEmpresa(Empresa e);
}
