package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped
public class ClienteController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IClienteService cS;
	
	private Cliente cliente;
	
	List<Cliente> listaClientes;
	
	@PostConstruct
	public void init() {
		this.listaClientes = new ArrayList<Cliente>();
		this.cliente= new Cliente();
		this.list();
	}
	
	public String newCliente() {
		this.setCliente(new Cliente());
		return "cliente.xhtml";
	}
	
	public void insert() {
		cS.insert(cliente);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaClientes= cS.list();
	}
	
	public void clean() {
		this.init();
	}
	
	public void findByName() {
		if (cliente.getNombre().isEmpty())
			this.list();
		else
			listaClientes= this.cS.findByNameCliente(this.getCliente());
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}