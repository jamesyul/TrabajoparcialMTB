package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IFavoritoDao;
import pe.edu.upc.entity.Favorito;
import pe.edu.upc.service.IFavoritoService;

@Named
@RequestScoped

public class FavoritoServiceImpl implements IFavoritoService {

	@Inject
	private IFavoritoDao fD;
	
	@Override
	public void insert(Favorito e) {
		fD.insert(e);		
	}

	@Override
	public List<Favorito> list() {
		return fD.list();
	}

	@Override
	public List<Favorito> findByNameFavorito(Favorito e) {
		return fD.findByNameFavorito(e);
	}

}
