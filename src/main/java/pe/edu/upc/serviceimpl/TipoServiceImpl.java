package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoDao;
import pe.edu.upc.entity.Tipo;
import pe.edu.upc.service.ITipoService;

@Named
@RequestScoped

public class TipoServiceImpl implements ITipoService {

	@Inject
	private ITipoDao tD;
	
	@Override
	public void insert(Tipo e) {
		tD.insert(e);		
	}

	@Override
	public List<Tipo> list() {
		return tD.list();
	}

	@Override
	public List<Tipo> findByNameTipo(Tipo e) {
		return tD.findByNameTipo(e);
	}

}
