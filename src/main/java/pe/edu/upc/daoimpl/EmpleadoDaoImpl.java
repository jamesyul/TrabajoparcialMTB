package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEmpleadoDao;
import pe.edu.upc.entity.Empleado;

public class EmpleadoDaoImpl implements IEmpleadoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Empleado e) {
		em.persist(e);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> list() {
		List<Empleado> lista = new ArrayList<Empleado>();
		Query q = em.createQuery("from Empleado e");
		lista = (List<Empleado>)q.getResultList();
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> findByNameEmpleado(Empleado e) {
		List<Empleado> lista = new ArrayList<Empleado>();
		Query q = em.createQuery("from Empleado e where e.nombreCompleto like ?1");
		q.setParameter(1, '%' + e.getNombreCompleto() + '%');
		lista = (List<Empleado>)q.getResultList();		
		return lista;
	}

}
