package hotel_H;

import java.sql.SQLException;
import java.time.LocalDate;

import dao.HospedeDAO;
import dao.ServicoDAO;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {	
		Hospede hospede1 = new Hospede("Wesley", "14312312346", LocalDate.parse("1990-05-22"), "davi@gmail.com",1,"21968244017");
		
		HospedeDAO server1 = new HospedeDAO();
//		server1.inserirHospede(hospede1);
//		server1.deletaHospede(3);
		server1.consultarHospedes();
//		server1.consultarServicos();
//		server1.deletarServico(3);
		
		ServicoDAO server2 = new ServicoDAO();
		server2.inserirServico("piscina","pelado", 100);
		server2.consultarServicos();
		server2.deletarServico(1);
		
	}
}
