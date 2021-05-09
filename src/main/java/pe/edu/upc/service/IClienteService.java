package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Cliente;

public interface IClienteService {
	public void insert(Cliente e);
	public List<Cliente> list();
	public List<Cliente> findByNameCliente(Cliente e);
}
