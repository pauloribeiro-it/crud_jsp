package crud.dao;

import java.util.List;

import crud.entities.Carro;

public interface CadastroCarroDAO {
	void cadastro(Carro carro);
	List<Carro> obtemCarros();
	void removeCarro(Integer id);
	Carro obtemPorId(Integer id);
	void alteraCarro(Carro carro);
}
