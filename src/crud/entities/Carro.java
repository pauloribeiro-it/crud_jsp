package crud.entities;

import java.util.List;

public class Carro {

	private Integer id;
	private String modelo;
	private Integer ano;
	private MarcasEnum marca;
	private List<String> opcionais;
	private Boolean isAutomatico;
	
	private static int ID = 1;
	
	public Carro(Integer id){
		this.id = id;
	}
	
	
	public Carro(Integer id, MarcasEnum marca, String modelo, Integer ano, List<String> opcionais, Boolean isAutomatico) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.opcionais = opcionais;
		this.isAutomatico = isAutomatico;
	}

	public Carro(MarcasEnum marca, String modelo, Integer ano, List<String> opcionais, Boolean isAutomatico) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.opcionais = opcionais;
		this.isAutomatico = isAutomatico;
	}

	public Integer getId() {
		return id;
	}

	public void configuraId() {
		this.id = ID++;
	}

	public MarcasEnum getMarca() {
		return marca;
	}

	public void setMarca(MarcasEnum marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public List<String> getOpcionais() {
		return opcionais;
	}

	public void setOpcionais(List<String> opcionais) {
		this.opcionais = opcionais;
	}
	
	public Boolean getIsAutomatico() {
		return isAutomatico;
	}

	public void setIsAutomatico(Boolean isAutomatico) {
		this.isAutomatico = isAutomatico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
