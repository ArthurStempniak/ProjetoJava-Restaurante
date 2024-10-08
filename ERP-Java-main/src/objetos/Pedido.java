package objetos;

public class Pedido {
	Integer idPedido;
	Integer numeroMesa;
	Integer idGarcom;
	Integer cardapioCodItem;
	Integer quantidadeItem;
	Integer tipoPedido;
	
	
	public Pedido(Integer idPedido, Integer numeroMesa, Integer idGarcom, Integer cardapioCodPrato,Integer tipoPedido, Integer quantidadePratos) {
		super();
		this.idPedido = idPedido;
		this.numeroMesa = numeroMesa;
		this.idGarcom = idGarcom;
		this.cardapioCodItem = cardapioCodPrato;
		this.quantidadeItem = quantidadePratos;
		// Tipo pedido 0, comida, 1, bebida
		this.tipoPedido = tipoPedido;
	}


	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", numeroMesa=" + numeroMesa + ", idGarcom=" + idGarcom
				+ ", cardapioCodItem=" + cardapioCodItem + ", quantidadeItem=" + quantidadeItem + ", tipoPedido="
				+ tipoPedido + "]";
	}


	public Integer getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}


	public Integer getNumeroMesa() {
		return numeroMesa;
	}


	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}


	public Integer getIdGarcom() {
		return idGarcom;
	}


	public void setIdGarcom(Integer idGarcom) {
		this.idGarcom = idGarcom;
	}


	public Integer getCardapioCodItem() {
		return cardapioCodItem;
	}


	public void setCardapioCodItem(Integer cardapioCodItem) {
		this.cardapioCodItem = cardapioCodItem;
	}


	public Integer getQuantidadeItem() {
		return quantidadeItem;
	}


	public void setQuantidadeItem(Integer quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}


	public Integer getTipoPedido() {
		return tipoPedido;
	}


	public void setTipoPedido(Integer tipoPedido) {
		this.tipoPedido = tipoPedido;
	}
	
}