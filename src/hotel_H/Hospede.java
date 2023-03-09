package hotel_H;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Hospede extends Pessoa{
	private int id;
	
	public List<Reserva> reservas = new ArrayList<>();
	
	public Hospede(String nome, String cpf, LocalDate nascimento, String email, int id_endereco, String telefone) {
		super(nome, cpf, nascimento, email, id_endereco, telefone);
	}
	public Hospede(int id, String nome, String cpf, LocalDate nascimento, String email, int id_endereco, String telefone) {
		super(nome, cpf, nascimento, email, id_endereco, telefone);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Override
	public String toString() {
		return "Hospede [reservas=" + reservas + ", Nome=" + getNome() + ", Cpf=" + getCpf()
				+ ", Nascimento=" + getNascimento().format(formato) + ", Email=" + getEmail() + ", Endereco="
				+ getEndereco() + ", Telefone=" + getTelefone() + "]";
	}

	
}




