package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPagoDao;
import pe.edu.upc.entity.Pago;

public class PagoDaoImpl implements IPagoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Pago e) {
		em.persist(e);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pago> list() {
		List<Pago> lista = new ArrayList<Pago>();
		Query q = em.createQuery("from Pago e");
		lista = (List<Pago>)q.getResultList();
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pago> findByNamePago(Pago e) {
		List<Pago> lista = new ArrayList<Pago>();
		Query q = em.createQuery("from Pago e where e.nombre like ?1");
		q.setParameter(1, '%' + e.getNombre() + '%');
		lista = (List<Pago>)q.getResultList();		
		return lista;
	}

}
