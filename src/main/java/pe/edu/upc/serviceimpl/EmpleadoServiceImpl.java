package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEmpleadoDao;
import pe.edu.upc.entity.Empleado;
import pe.edu.upc.service.IEmpleadoService;

@Named
@RequestScoped

public class EmpleadoServiceImpl implements IEmpleadoService {

	@Inject
	private IEmpleadoDao cD;
	
	@Override
	public void insert(Empleado e) {
		cD.insert(e);		
	}

	@Override
	public List<Empleado> list() {
		return cD.list();
	}

	@Override
	public List<Empleado> findByNameEmpleado(Empleado e) {
		return cD.findByNameEmpleado(e);
	}

}
