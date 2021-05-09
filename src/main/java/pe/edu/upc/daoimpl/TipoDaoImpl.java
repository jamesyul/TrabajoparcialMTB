package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoDao;
import pe.edu.upc.entity.Tipo;

public class TipoDaoImpl implements ITipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Tipo e) {
		em.persist(e);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tipo> list() {
		List<Tipo> lista = new ArrayList<Tipo>();
		Query q = em.createQuery("from Tipo e");
		lista = (List<Tipo>)q.getResultList();
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tipo> findByNameTipo(Tipo e) {
		List<Tipo> lista = new ArrayList<Tipo>();
		Query q = em.createQuery("from Tipo e where e.nombre like ?1");
		q.setParameter(1, '%' + e.getNombre() + '%');
		lista = (List<Tipo>)q.getResultList();		
		return lista;
	}

}
