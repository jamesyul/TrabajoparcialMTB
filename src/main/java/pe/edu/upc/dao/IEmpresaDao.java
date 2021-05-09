package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Empresa;

public interface IEmpresaDao {
	public void insert(Empresa e);
	public List<Empresa> list();
	public List<Empresa> findByNameEmpresa(Empresa e);
}
