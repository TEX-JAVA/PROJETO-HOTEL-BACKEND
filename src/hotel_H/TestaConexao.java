package hotel_H;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionFactory.connect();
		
		String sql = "select * from servico";
		PreparedStatement st = conn.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<Servico> servicos = new ArrayList<>();
		
		
		while(rs.next()) {
			Servico servico = new Servico(
			rs.getInt("id"),
			rs.getString("nome"),
			rs.getString("descricao"),
			rs.getDouble("valor")
			);
			servicos.add(servico);
		}
		
		servicos.forEach(servico -> System.out.println(servico));	
		
		rs.close();
		st.close();
		conn.close();
		
	}
}
