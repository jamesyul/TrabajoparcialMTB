package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMarcaDao;
import pe.edu.upc.entity.Marca;

public class MarcaDaoImpl implements IMarcaDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Marca e) {
		em.persist(e);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Marca> list() {
		List<Marca> lista = new ArrayList<Marca>();
		Query q = em.createQuery("from Marca e");
		lista = (List<Marca>)q.getResultList();
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Marca> findByNameMarca(Marca e) {
		List<Marca> lista = new ArrayList<Marca>();
		Query q = em.createQuery("from Marca e where e.nombre like ?1");
		q.setParameter(1, '%' + e.getNombre() + '%');
		lista = (List<Marca>)q.getResultList();		
		return lista;
	}

}
