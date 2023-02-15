package hotel_H;

public class Quarto {
    private Integer qtd_hospedes;
	private Double preco;
	public Quarto(Integer qtd_hospedes, Double preco) {
		super();
		this.qtd_hospedes = qtd_hospedes;
		this.preco = preco;
	}
	public Integer getQtd_hospedes() {
		return qtd_hospedes;
	}
	public void setQtd_hospedes(Integer qtd_hospedes) {
		this.qtd_hospedes = qtd_hospedes;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	

}
