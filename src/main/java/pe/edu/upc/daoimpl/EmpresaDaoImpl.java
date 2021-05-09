package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEmpresaDao;
import pe.edu.upc.entity.Empresa;

public class EmpresaDaoImpl implements IEmpresaDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Empresa e) {
		em.persist(e);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empresa> list() {
		List<Empresa> lista = new ArrayList<Empresa>();
		Query q = em.createQuery("from Empresa e");
		lista = (List<Empresa>)q.getResultList();
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empresa> findByNameEmpresa(Empresa e) {
		List<Empresa> lista = new ArrayList<Empresa>();
		Query q = em.createQuery("from Empresa e where e.nombre like ?1");
		q.setParameter(1, '%' + e.getNombre() + '%');
		lista = (List<Empresa>)q.getResultList();		
		return lista;
	}

}
