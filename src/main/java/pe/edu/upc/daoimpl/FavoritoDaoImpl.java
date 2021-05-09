package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IFavoritoDao;
import pe.edu.upc.entity.Favorito;

public class FavoritoDaoImpl implements IFavoritoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Favorito e) {
		em.persist(e);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Favorito> list() {
		List<Favorito> lista = new ArrayList<Favorito>();
		Query q = em.createQuery("from Favorito e");
		lista = (List<Favorito>)q.getResultList();
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Favorito> findByNameFavorito(Favorito e) {
		List<Favorito> lista = new ArrayList<Favorito>();
		Query q = em.createQuery("from Favorito e where e.nombre like ?1");
		q.setParameter(1, '%' + e.getNombre() + '%');
		lista = (List<Favorito>)q.getResultList();		
		return lista;
	}

}
