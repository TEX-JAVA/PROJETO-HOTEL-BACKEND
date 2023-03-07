package hotel_H;

public class Servico {
	private String nome;
	private String descricao;
	private double valor;
	private int id;
	public Servico(int id,String nome, String descricao, double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}	
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Servico [nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + "]";
	}
		
}
