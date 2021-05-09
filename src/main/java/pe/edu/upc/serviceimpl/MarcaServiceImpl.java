package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMarcaDao;
import pe.edu.upc.entity.Marca;
import pe.edu.upc.service.IMarcaService;

@Named
@RequestScoped

public class MarcaServiceImpl implements IMarcaService {

	@Inject
	private IMarcaDao mD;
	
	@Override
	public void insert(Marca e) {
		mD.insert(e);		
	}

	@Override
	public List<Marca> list() {
		return mD.list();
	}

	@Override
	public List<Marca> findByNameMarca(Marca e) {
		return mD.findByNameMarca(e);
	}

}
