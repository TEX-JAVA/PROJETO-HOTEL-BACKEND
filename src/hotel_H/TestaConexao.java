package hotel_H;

import java.sql.SQLException;

import dao.ServicoDAO;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		ServicoDAO server1 = new ServicoDAO();
		server1.inserirServico("piscina","pelado", 100);
		server1.consultarServicos();
		server1.deletarServico(1);
	}
}
