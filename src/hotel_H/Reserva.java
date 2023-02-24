package hotel_H;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
	
	private int idReserva;
	private LocalDate dataReserva;
	private LocalDate checkin;
	private LocalDate checkout;
	private int qtdPessoas;
	private Hospede hospede;
	private Quarto quarto;
	//variável quantidade de diárias
	public List<Servico> servicos = new ArrayList<>();
		
	public Reserva(int idReserva, LocalDate dataReserva, LocalDate checkin, LocalDate checkout, int qtdPessoas,
			Hospede hospede, Quarto quarto) {
		this.idReserva = idReserva;
		this.dataReserva = dataReserva;
		this.checkin = checkin;
		this.checkout = checkout;
		this.qtdPessoas = qtdPessoas;
		this.hospede = hospede;
		this.quarto = quarto;
	}
	
	public int getIdReserva() {
		return idReserva;
	}
	
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	
	public LocalDate getDataReserva() {
		return dataReserva;
	}
	
	public void setDataReserva(LocalDate dataReserva) {
		this.dataReserva = dataReserva;
	}
	
	public LocalDate getCheckin() {
		return checkin;
	}
	
	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}
	
	public LocalDate getCheckout() {
		return checkout;
	}
	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}
	
	public int getQtdPessoas() {return qtdPessoas;
	}
	
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	
	public Hospede getHospede() {
		return hospede;
	}
	
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	
	public Quarto getQuarto() {
		return quarto;
	}
	
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	
	
	
	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", dataReserva=" + dataReserva + ", checkin=" + checkin
				+ ", checkout=" + checkout + ", qtdPessoas=" + qtdPessoas + ", hospede=" + hospede + ", quarto="
				+ quarto + ", servicos=" + servicos + "]";
	}
	public double totalReserva() {
		double total = 0;
		total = somarServicos() + (this.quarto.getPreco() * this.getQtdPessoas() );
		return total;
		
		
		// somar o valor do quarto com o valor dos serviços
	}
	
	public double somarServicos() {
		double total = 0;
		for(Servico servico: servicos) {
			total = total + servico.getValor();			
		}
		return total;
	}
	
	
	


}
