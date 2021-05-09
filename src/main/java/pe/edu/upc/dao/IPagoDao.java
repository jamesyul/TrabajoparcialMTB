package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Pago;

public interface IPagoDao {
	public void insert(Pago e);
	public List<Pago> list();
	public List<Pago> findByNamePago(Pago e);
}
