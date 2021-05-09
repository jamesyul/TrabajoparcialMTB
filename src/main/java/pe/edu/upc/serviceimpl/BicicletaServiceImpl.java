package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IBicicletaDao;
import pe.edu.upc.entity.Bicicleta;
import pe.edu.upc.service.IBicicletaService;

@Named
@RequestScoped

public class BicicletaServiceImpl implements IBicicletaService {

	@Inject
	private IBicicletaDao cD;
	
	@Override
	public void insert(Bicicleta e) {
		cD.insert(e);		
	}

	@Override
	public List<Bicicleta> list() {
		return cD.list();
	}

	@Override
	public List<Bicicleta> findByNameBicicleta(Bicicleta e) {
		return cD.findByNameBicicleta(e);
	}

}
