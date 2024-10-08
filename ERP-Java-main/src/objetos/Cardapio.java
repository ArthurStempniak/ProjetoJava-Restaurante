package objetos;

public class Cardapio {
	private String nomePrato;
	private int codPrato;
	private float precoPrato;
	private int dispPrato;

	public Cardapio(String nomePrato, int codPrato, float precoPrato, int dispPrato) {
		this.nomePrato = nomePrato;
		this.codPrato = codPrato;
		this.precoPrato = precoPrato;
		this.dispPrato = dispPrato;
	}

	public String getnomePrato() {
		return nomePrato;
	}

	public void setnomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}

	public int getcodPrato() {
		return codPrato;
	}

	public void setcodPrato(int codPrato) {
		this.codPrato = codPrato;
	}

	public float getprecoPrato() {
		return precoPrato;
	}

	public void setprecoPrato(float precoPrato) {
		this.precoPrato = precoPrato;
	}

	public int getdispPrato() {
		return dispPrato;
	}

	public void setdispPrato(int dispPrato) {
		this.dispPrato = dispPrato;
	}

	public String prato() {
		return '\n' + "Codigo do produto:" + codPrato + "\nNome do prato: " + nomePrato + '\n' + "preço Prato: $"
				+ precoPrato + "\ndisponibilidade Prato: " + dispPrato;
	}

}