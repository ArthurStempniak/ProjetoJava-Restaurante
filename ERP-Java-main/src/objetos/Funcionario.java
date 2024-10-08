package objetos;

public class Funcionario {
	
	private String nome;
	private Integer id;
	private String cargo;
	private Double totalVenda;
	
	public Funcionario(String nome, Integer id,Integer cargo) {
		this.nome = nome;
		this.id = id;
		switch (cargo) {
			case 1:
				this.cargo = "Garçom";
				this.totalVenda = 0.0;
				break;
			case 2:
				this.cargo = "Cozinheiro";
				break;
			case 3:
				this.cargo = "Gerente";
				break;
			default:
				this.cargo = "Garçom";
		}
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(Double totalVenda) {
		this.totalVenda = totalVenda;
	}


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", id=" + id + ", cargo=" + cargo + ", totalVenda=" + totalVenda + "]";
	}

	
	


}
