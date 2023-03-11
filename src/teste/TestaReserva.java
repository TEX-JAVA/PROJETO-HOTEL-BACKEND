package teste;

import java.sql.SQLException;
import java.time.LocalDate;

import dao.*;
import hotel_H.*;


public class TestaReserva {

	public static void main(String[] args) throws SQLException{
		

		Reserva reserva2 = new Reserva(4,LocalDate.parse("2023-03-14"), LocalDate.parse("2023-03-20"), LocalDate.parse("2023-03-18"), 2,300.00, 4);
		
		Reserva reserva3 = new Reserva(LocalDate.parse("2023-03-11"), LocalDate.parse("2023-10-23"), LocalDate.parse("2023-10-25"), 2,300.00, 4);
		//Incluir no banco
		
		
		ReservaDAO novaReserva = new ReservaDAO();
		
		
		novaReserva.inserirReserva(reserva3);
		//novaReserva.deletaReserva(reserva2);
		
		//novaReserva.atualizaReserva(reserva2);
		
		novaReserva.consultarReserva();
	}
}
