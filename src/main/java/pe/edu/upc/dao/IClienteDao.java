package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Cliente;

public interface IClienteDao {
	public void insert(Cliente e);
	public List<Cliente> list();
	public List<Cliente> findByNameCliente(Cliente e);
}
