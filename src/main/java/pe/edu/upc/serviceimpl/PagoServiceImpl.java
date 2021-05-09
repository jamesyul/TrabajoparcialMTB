package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPagoDao;
import pe.edu.upc.entity.Pago;
import pe.edu.upc.service.IPagoService;

@Named
@RequestScoped

public class PagoServiceImpl implements IPagoService {

	@Inject
	private IPagoDao pD;
	
	@Override
	public void insert(Pago e) {
		pD.insert(e);		
	}

	@Override
	public List<Pago> list() {
		return pD.list();
	}

	@Override
	public List<Pago> findByNamePago(Pago e) {
		return pD.findByNamePago(e);
	}

}
