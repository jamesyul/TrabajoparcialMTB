package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IReservaDao;
import pe.edu.upc.entity.Reserva;
import pe.edu.upc.service.IReservaService;

@Named
@RequestScoped

public class ReservaServiceImpl implements IReservaService {

	@Inject
	private IReservaDao rD;
	
	@Override
	public void insert(Reserva e) {
		rD.insert(e);		
	}

	@Override
	public List<Reserva> list() {
		return rD.list();
	}

	/*@Override
	public List<Reserva> findByNameReserva(Reserva e) {
		return rD.findByNameReserva(e);
	}*/

}
