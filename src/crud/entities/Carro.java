package crud.entities;

public class Carro {

	private Integer id;
	private String marca;
	private String modelo;
	private Integer ano;

	private static int ID = 1;
	
	public Carro(Integer id){
		this.id = id;
	}
	
	
	public Carro(Integer id, String marca, String modelo, Integer ano) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public Carro(String marca, String modelo, Integer ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public Integer getId() {
		return id;
	}

	public void configuraId() {
		this.id = ID++;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
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
