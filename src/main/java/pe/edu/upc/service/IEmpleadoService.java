package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Empleado;

public interface IEmpleadoService {
	public void insert(Empleado e);
	public List<Empleado> list();
	public List<Empleado> findByNameEmpleado(Empleado e);
}
