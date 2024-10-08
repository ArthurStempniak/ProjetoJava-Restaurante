package objetos;

public class Mesa {

    private String numeromesa;
    private String capacidadepessoa;
    private Boolean disponibilidade;

    public Mesa(String numeromesa, String capacidadepessoa, Integer disponibilidade) {
        this.numeromesa = numeromesa;
        this.capacidadepessoa = capacidadepessoa;
        
		switch (disponibilidade) {
		case 1:
			this.disponibilidade = true;
			break;
		case 2:
			this.disponibilidade = false;
			break;
		default:
			this.disponibilidade = false;
	}
    }
    
 
	public String getNumeromesa() {
		return numeromesa;
	}
	public void setNumeromesa(String numeromesa) {
		this.numeromesa = numeromesa;
	}
	public String getCapacidadepessoa() {
		return capacidadepessoa;
	}
	public void setCapacidadepessoa(String capacidadepessoa) {
		this.capacidadepessoa = capacidadepessoa;
	}
	public Boolean getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}


	@Override
	public String toString() {
		return "Mesa [numeromesa=" + numeromesa + ", capacidadepessoa=" + capacidadepessoa + ", disponibilidade="
				+ disponibilidade + "]";
	}
	

}
