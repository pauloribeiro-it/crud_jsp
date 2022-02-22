package crud.service;

import java.util.List;

import crud.dao.CadastroCarroDAO;
import crud.dao.CadastroCarroMemoriaDAO;
import crud.entities.Carro;

public class CarroService {
	
	private static CarroService instance;
	
	private CarroService() {}
			
	public static CarroService getInstance() {
		if(instance == null) {
			instance = new CarroService();
		}
		return instance;
	}
	
	private final CadastroCarroDAO dao = new CadastroCarroMemoriaDAO();
	
	public List<Carro> obtemCarros(){
		return dao.obtemCarros();
	}
	
}
