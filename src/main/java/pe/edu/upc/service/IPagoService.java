package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Pago;

public interface IPagoService {
	public void insert(Pago e);
	public List<Pago> list();
	public List<Pago> findByNamePago(Pago e);
}
