package crud.dao;

import java.util.ArrayList;
import java.util.List;

import crud.entities.Carro;

public class CadastroCarroMemoriaDAO implements CadastroCarroDAO{
	
	private static final List<Carro> carros = new ArrayList<>();

	public void cadastro(Carro carro) {
		carro.configuraId();
		carros.add(carro);
	}

	public List<Carro> obtemCarros() {
		return carros;
	}

	public void removeCarro(Integer id) {
		Carro carro = new Carro(id);
		this.carros.remove(carro);
	}

	public Carro obtemPorId(Integer id) {
		int indice = this.carros.indexOf(new Carro(id));
		return carros.get(indice);
	}

	public void alteraCarro(Carro carro) {
		int indice = this.carros.indexOf(carro);
		this.carros.set(indice, carro);
	}
	
}
