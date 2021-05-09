package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IClienteDao;
import pe.edu.upc.entity.Cliente;
import pe.edu.upc.service.IClienteService;

@Named
@RequestScoped

public class ClienteServiceImpl implements IClienteService {

	@Inject
	private IClienteDao cD;
	
	@Override
	public void insert(Cliente e) {
		cD.insert(e);		
	}

	@Override
	public List<Cliente> list() {
		return cD.list();
	}

	@Override
	public List<Cliente> findByNameCliente(Cliente e) {
		return cD.findByNameCliente(e);
	}

}
