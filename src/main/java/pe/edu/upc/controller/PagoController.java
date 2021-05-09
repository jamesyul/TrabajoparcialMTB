package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Pago;
import pe.edu.upc.service.IPagoService;

@Named
@RequestScoped
public class PagoController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPagoService pS;
	
	private Pago pago;
	
	List<Pago> listaPagos;
	
	@PostConstruct
	public void init() {
		this.listaPagos = new ArrayList<Pago>();
		this.pago= new Pago();
		this.list();
	}
	
	public String newPago() {
		this.setPago(new Pago());
		return "pago.xhtml";
	}
	
	public void insert() {
		pS.insert(pago);
		this.clean();
		this.list();
	}
	
	public void list() {
		listaPagos= pS.list();
	}
	
	public void clean() {
		this.init();
	}
	
	public void findByName() {
		if (pago.getNombre().isEmpty())
			this.list();
		else
			listaPagos= this.pS.findByNamePago(this.getPago());
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public List<Pago> getListaPagos() {
		return listaPagos;
	}

	public void setListaPagos(List<Pago> listaPagos) {
		this.listaPagos = listaPagos;
	}

	

}