package hotel_H;

public class Quarto {
	private boolean disponibilidade;
	private String nome;
	private String numQuarto;
	private Double preco;
	
	public Quarto(boolean disponibilidade, String nome, String numQuarto, Double preco) {
		super();
		this.disponibilidade = disponibilidade;
		this.nome = nome;
		this.numQuarto = numQuarto;
		this.preco = preco;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumQuarto() {
		return numQuarto;
	}
	public void setNumQuarto(String numQuarto) {
		this.numQuarto = numQuarto;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	

}
