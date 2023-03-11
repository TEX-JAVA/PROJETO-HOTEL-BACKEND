package teste;

import java.sql.SQLException;
import java.time.LocalDate;

import dao.HospedeDAO;
import dao.ServicoDAO;
import hotel_H.Hospede;
import hotel_H.Servico;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {	
		Hospede hospede1 = new Hospede(9,"Junin", "14312312346", LocalDate.parse("1990-05-22"), "davi@gmail.com",1,"21968244017");
		Servico servico1 = new Servico(10, "Banheira de ativa", "Banheira de espuma na classe premium", 120);
		
		HospedeDAO server1 = new HospedeDAO();
		//server1.inserirHospede(hospede1);
		//server1.deletaHospede(5);
		server1.atualizarHospede(hospede1);
		server1.consultarHospedes(); // pendente
		
		ServicoDAO server2 = new ServicoDAO();
		//server2.inserirServico(servico1);
		//server2.consultarServicos();
		//server2.deletarServico();
		//server2.atualizarServico(servico1);
		
		
	}
}
