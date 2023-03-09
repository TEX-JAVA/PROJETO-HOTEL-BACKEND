package hotel_H;

import java.time.LocalDate;
import java.util.Date;

public class Funcionario extends Pessoa{
	
	private String rg;
    private String cargo; 
    private Date dataDeAdmissao;
    private String matricula;
    private double salario;
    
	public Funcionario(String nome, String cpf, LocalDate nascimento, String email, int endereco, String telefone,
			String rg, String cargo, Date dataDeAdmissao, String matricula, double salario) {
		super(nome, cpf, nascimento, email, endereco, telefone);
		this.rg = rg;
		this.cargo = cargo;
		this.dataDeAdmissao = dataDeAdmissao;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
    
}
