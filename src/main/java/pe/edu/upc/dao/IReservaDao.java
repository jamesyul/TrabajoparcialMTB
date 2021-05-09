package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Reserva;

public interface IReservaDao {
	public void insert(Reserva e);
	public List<Reserva> list();
	/*public List<Reserva> findByNameReserva(Reserva e);*/
}
