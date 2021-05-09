package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Empleado;

public interface IEmpleadoDao {
	public void insert(Empleado e);
	public List<Empleado> list();
	public List<Empleado> findByNameEmpleado(Empleado e);
}
