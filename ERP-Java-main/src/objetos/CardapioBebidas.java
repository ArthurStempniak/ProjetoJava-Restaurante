package objetos;

public class CardapioBebidas {
	private String nomeBebida;
	private int codBebida;
	private float precoBebida;
	private int dispBebida;

	public CardapioBebidas(String nomeBebida, int codBebida, float precoBebida, int dispBebida) {
		this.nomeBebida = nomeBebida;
		this.codBebida = codBebida;
		this.precoBebida = precoBebida;
		this.dispBebida = dispBebida;
	}

	public String getnomeBebida() {
		return nomeBebida;
	}

	public void setnomeBebida(String nomeBebida) {
		this.nomeBebida = nomeBebida;
	}

	public int getcodBebida() {
		return codBebida;
	}

	public void setcodBebida(int codBebida) {
		this.codBebida = codBebida;
	}

	public float getprecoBebida() {
		return precoBebida;
	}

	public void setprecoBebida(float precoBebida) {
		this.precoBebida = precoBebida;
	}

	public int getdispPrato() {
		return dispBebida;
	}

	public void setdispBebida(int dispBebida) {
		this.dispBebida = dispBebida;
	}

	public String bebida() {
		return '\n' + "Codigo do produto" + codBebida + "\nNome do Bebida:" + nomeBebida + '\n' + "preco Bebida: $"
				+ precoBebida + "\ndisponibilidade Bebida: " + dispBebida;
	}
}
