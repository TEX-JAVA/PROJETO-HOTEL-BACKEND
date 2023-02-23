package hotel_H;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Hospede extends Pessoa{
	
	public List<Reserva> reservas = new ArrayList<>();
	
	public Hospede(String nome, String cpf, LocalDate nascimento, String email, String endereco, String telefone) {
		super(nome, cpf, nascimento, email, endereco, telefone);
	}

	public void cadastrarHospedagem() {
		//CRUD pro hospede manipular sua reserva
	}

	public DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Override
	public String toString() {
		return "Hospede [reservas=" + reservas + ", Nome=" + getNome() + ", Cpf=" + getCpf()
				+ ", Nascimento=" + getNascimento().format(formato) + ", Email=" + getEmail() + ", Endereco="
				+ getEndereco() + ", Telefone=" + getTelefone() + "]";
	}

	
}




