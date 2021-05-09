package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IBicicletaDao;
import pe.edu.upc.entity.Bicicleta;

public class BicicletaDaoImpl implements IBicicletaDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Bicicleta e) {
		em.persist(e);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bicicleta> list() {
		List<Bicicleta> lista = new ArrayList<Bicicleta>();
		Query q = em.createQuery("from Bicicleta e");
		lista = (List<Bicicleta>)q.getResultList();
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bicicleta> findByNameBicicleta(Bicicleta e) {
		List<Bicicleta> lista = new ArrayList<Bicicleta>();
		Query q = em.createQuery("from Bicicleta e where e.nombre like ?1");
		q.setParameter(1, '%' + e.getNombre() + '%');
		lista = (List<Bicicleta>)q.getResultList();		
		return lista;
	}

}
