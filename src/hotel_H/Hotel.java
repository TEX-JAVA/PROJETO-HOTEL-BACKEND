package hotel_H;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private int id;
	private String nome;
	private String endereco;
	private String telefone;
	private String cnpj;
	
	public List<Funcionario> funcionarios = new ArrayList<>();
	public List<Hospede> hospedes = new ArrayList<>();
	public List<Quarto> quartos = new ArrayList<>();
	public List<Reserva> reservas = new ArrayList<>();
	public List<Servico> servicos = new ArrayList<>();
	
	//implementação crud
	
	public Hotel(String nome, String endereco, String cnpj) {
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
	}
	
	public Hotel(int id, String nome, String endereco, String cnpj) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Hotel [nome=" + nome + ", endereco=" + endereco + ", cnpj=" + cnpj
				+ ", funcionarios=" + funcionarios + ", hospedes=" + hospedes + ", quartos=" + quartos + ", reservas="
				+ reservas + ", servicos=" + servicos + "]";
	}
	
	
	
}
