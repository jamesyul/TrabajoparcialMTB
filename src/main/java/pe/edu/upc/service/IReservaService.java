package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Reserva;

public interface IReservaService {
	public void insert(Reserva e);
	public List<Reserva> list();
	/*public List<Reserva> findByNameReserva(Reserva e);*/
}
