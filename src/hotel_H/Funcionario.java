package hotel_H;

public class Funcionario extends Pessoa{
	
	private Integer salario;

	public Funcionario(String nome, String email, String endereco, String senha, Integer telefone, Integer salario) {
		super(nome, email, endereco, senha, telefone);
		this.setSalario(salario);
		
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	
	@Override
	public String toString() {
		return "Pessoa [nome=" + this.getNome() + ", email=" + this.getEmail() + ", endereco=" + this.getEndereco() + ", senha=" + this.getSenha()
				+ ", telefone=" + this.getTelefone() + ", salario=" + this.getSalario() + "]";
	}

	
	
	
	
}
