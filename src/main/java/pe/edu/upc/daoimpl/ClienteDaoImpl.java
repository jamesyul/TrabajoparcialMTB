package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IClienteDao;
import pe.edu.upc.entity.Cliente;

public class ClienteDaoImpl implements IClienteDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Cliente e) {
		em.persist(e);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> list() {
		List<Cliente> lista = new ArrayList<Cliente>();
		Query q = em.createQuery("from Cliente e");
		lista = (List<Cliente>)q.getResultList();
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> findByNameCliente(Cliente e) {
		List<Cliente> lista = new ArrayList<Cliente>();
		Query q = em.createQuery("from Cliente e where e.nombre like ?1");
		q.setParameter(1, '%' + e.getNombre() + '%');
		lista = (List<Cliente>)q.getResultList();		
		return lista;
	}

}
