package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEmpresaDao;
import pe.edu.upc.entity.Empresa;
import pe.edu.upc.service.IEmpresaService;

@Named
@RequestScoped

public class EmpresaServiceImpl implements IEmpresaService {

	@Inject
	private IEmpresaDao eD;
	
	@Override
	public void insert(Empresa e) {
		eD.insert(e);		
	}

	@Override
	public List<Empresa> list() {
		return eD.list();
	}

	@Override
	public List<Empresa> findByNameEmpresa(Empresa e) {
		return eD.findByNameEmpresa(e);
	}

}
