package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IReservaDao;
import pe.edu.upc.entity.Reserva;

public class ReservaDaoImpl implements IReservaDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Reserva e) {
		em.persist(e);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> list() {
		List<Reserva> lista = new ArrayList<Reserva>();
		Query q = em.createQuery("from Reserva e");
		lista = (List<Reserva>)q.getResultList();
		return lista;
	}

	/*@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> findByNameReserva(Reserva e) {
		List<Reserva> lista = new ArrayList<Reserva>();
		Query q = em.createQuery("from Reserva e where e.fecha like ?1");
		q.setParameter(1, '%' + e.getFecha() + '%');
		lista = (List<Reserva>)q.getResultList();		
		return lista;
	}*/

}
