package hotel_H;

public class Pessoa {
	
	private String nome;
	private String email;
	private String endereco;
	private String senha;
	private Integer telefone;
	
		
	public Pessoa(String nome, String email, String endereco, String senha, Integer telefone) {
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.senha = senha;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", senha=" + senha
				+ ", telefone=" + telefone + "]";
	}
	
	
	

}
