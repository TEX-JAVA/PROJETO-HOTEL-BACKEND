package hotel_H;

import java.time.LocalDate;
import java.util.Date;

public class Funcionario extends Pessoa{
	
	private int id;
    private LocalDate dataDeAdmissao;
    private String cargo;
    private double salario;

	public Funcionario(String nome, String cpf, LocalDate nascimento, String email, int endereco, String telefone,
			LocalDate dataDeAdmissao, String cargo, double salario) {
		super(nome, cpf, nascimento, email, endereco, telefone);
		this.dataDeAdmissao = dataDeAdmissao;
		this.cargo = cargo;
		this.salario = salario;
	}
    
	public Funcionario(String nome, String cpf, LocalDate nascimento, String email, int endereco, String telefone,
			int id, LocalDate dataDeAdmissao, String cargo, double salario) {
		super(nome, cpf, nascimento, email, endereco, telefone);
		this.id = id;
		this.dataDeAdmissao = dataDeAdmissao;
		this.cargo = cargo;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
    
	@Override
	public String toString() {
		return "Hospede: " + "Id="+ getId() + ", Nome=" + getNome() + ", Cpf=" + getCpf()
				+ ", Nascimento=" + getNascimento() + ", Email=" + getEmail() + ", Endereco="
				+ getEndereco() + ", Telefone=" + getTelefone();
	}
	
	
}